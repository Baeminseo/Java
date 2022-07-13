package function;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.*;
import javax.swing.*;

//�α���, ȸ������, ��������
public class Login2 {

	User user;
	Scanner sc = new Scanner(System.in);
	int userChoice;

	public Login2() {
		// �α��� ��ü
		String startmsg = "ȸ�������� 1�� �α����� 2���� �����ּ���";
		// ���̵� �Էºκ�
		String userIdMsg = "���̵� �Է����ּ���.";
		// ��й�ȣ �Էºκ�
		String userPwMsg = "��й�ȣ�� �Է����ּ���.";

		String[] userMenu = { "INSERT", "LIST", "SEARCH", "DELETE" };
		int choice = 0;

		while (true) {
			System.out.println(startmsg);
			userChoice = sc.nextInt(); // ȸ������, �α��� ����

			if (userChoice == 1) { // ȸ������ ���ý�
				String userID;
				while (true) { // ���̵� �ߺ� üũ
					this.user = new User();
					System.out.println(userIdMsg); // ���̵� �Է� �޼���
					userID = sc.next(); // ���̵� �Է�
					user.setUserID(userID);
					if (!user.idcheck()) {
						System.out.println("�ߺ��� ���̵� �Դϴ�.");
						continue;
					} else {
						break;
					}
				}

				File file = new File(userID);

				System.out.println("�Է��Ͻ� ���̵� : " + user.getUserID() + "�Դϴ�.");
				System.out.println(userPwMsg); // ��й�ȣ �Է� �޼���
				String userPW = sc.next(); // ��й�ȣ �Է�
				user.setUserPW(userPW);

				user.fileSave();

				System.out.println("�Է��Ͻ� ��й�ȣ : " + user.getUserPW() + "�Դϴ�.");

				// �ߺ�üũ �߰� �ʿ� (��й�ȣ �ι� �Է¹ް� ���ؼ� ������ ���)

			} else if (userChoice == 2) { // �α��� ���ý�
				while (true) {
					FileReader fr = null;
					BufferedReader br = null;
					LineNumberReader lr = null;

					this.user = new User(); //
					System.out.println(userIdMsg); // ���̵� �Է� �޼���
					String userID = sc.next(); // ���̵� �Է�
					this.user.setUserID(userID);

					if (this.user.idcheck()) {
						System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
						continue;
					} else {
						System.out.println(userPwMsg); // ��й�ȣ �Է� �޼���
						String userPW = sc.next(); // ��й�ȣ �Է�
						this.user.setUserPW(userPW);
						try {
							fr = new FileReader("/Users/kimminho/Desktop/eclisp_WorkSpace/PMS2/src/File/"
									+ this.user.getUserID() + "/" + this.user.getUserID() + ".txt");
							br = new BufferedReader(fr, 1024);
							lr = new LineNumberReader(br);

							while (true) {
								String pw = lr.readLine();
								if ((pw = lr.readLine()) != null) {
									if (!pw.equals(this.user.getUserPW())) {
										System.out.println("��й�ȣ�� �ٸ��ϴ�.");
										break;
									} else if (pw.equals(this.user.getUserPW())) {
										System.out.println("�α��� ����");
										System.out.println("�Է��Ͻ� ���̵� : " + userID + "�Դϴ�.");
										System.out.println("�Է��Ͻ� ��й�ȣ : " + userPW + "�Դϴ�.");
										break;

									} else {
										System.out.println("�߸��� ���� �ԷµǾ����ϴ�.");
									}
								} else {
									System.out.println("��й�ȣ�� Ʋ��");
									break;
								}
							}
						} catch (Exception e) {
							e.printStackTrace();
						} finally {
						}
						try {
							fr.close();
							br.close();
							lr.close();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					// ��ü
					break; //

				}
//				System.out.println("�α��μ���");
			}
		}
	}

	public static void main(String[] args) {
		Login2 login2 = new Login2();
	}
}
