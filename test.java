import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

import homework_tf.IDChecker;

public class test {
	static String userid;
	static String userpw;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("ȸ�������� ���Ͻø� 1, �α����� �ϽǰŸ� 2�� �Է����ּ���.");
			String userStart = sc.next();
//			String readVal = null;

			if (userStart.equals("1")) {
				while (true) {
					System.out.println("���̵� �Է��ϼ���.");
					userid = sc.next();
					File file = new File("/data/" + userid);

					if (!file.exists() || !file.isDirectory()) {
						file.mkdir();
						System.out.println("��й�ȣ�� �Է��ϼ���.");
						userpw = sc.next();
						System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
						break;
					} else {
						System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
					}
					FileWriter fw = null;

					try {
						fw = new FileWriter("/data/" + userid + "/" + userid + ".txt");
						fw.write(userid + "\n" + userpw);

					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							fw.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}

			else if (userStart.equals("2")) {
				FileReader fr = new FileReader("/data/"+userid+"/"+ userid + ".txt");
				BufferedReader br = new BufferedReader(fr,1024);
				LineNumberReader lnr = new LineNumberReader(br);
			
				System.out.println("���̵� �Է��ϼ���.");
				
				
				String loginId = sc.next();
				if() {
					
				}
				
				
				
			} 
			else {
				System.out.println("�߸��� �Է°��Դϴ�.");
			}
		}

	}
}
