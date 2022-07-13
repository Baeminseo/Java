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

//로그인, 회원가입, 정보저장
public class Login2 {

	User user;
	Scanner sc = new Scanner(System.in);
	int userChoice;

	public Login2() {
		// 로그인 객체
		String startmsg = "회원가입은 1번 로그인은 2번을 눌러주세요";
		// 아이디 입력부분
		String userIdMsg = "아이디를 입력해주세요.";
		// 비밀번호 입력부분
		String userPwMsg = "비밀번호를 입력해주세요.";

		String[] userMenu = { "INSERT", "LIST", "SEARCH", "DELETE" };
		int choice = 0;

		while (true) {
			System.out.println(startmsg);
			userChoice = sc.nextInt(); // 회원가입, 로그인 선택

			if (userChoice == 1) { // 회원가입 선택시
				String userID;
				while (true) { // 아이디 중복 체크
					this.user = new User();
					System.out.println(userIdMsg); // 아이디 입력 메세지
					userID = sc.next(); // 아이디 입력
					user.setUserID(userID);
					if (!user.idcheck()) {
						System.out.println("중복된 아이디 입니다.");
						continue;
					} else {
						break;
					}
				}

				File file = new File(userID);

				System.out.println("입력하신 아이디 : " + user.getUserID() + "입니다.");
				System.out.println(userPwMsg); // 비밀번호 입력 메세지
				String userPW = sc.next(); // 비밀번호 입력
				user.setUserPW(userPW);

				user.fileSave();

				System.out.println("입력하신 비밀번호 : " + user.getUserPW() + "입니다.");

				// 중복체크 추가 필요 (비밀번호 두번 입력받고 비교해서 맞으면 통과)

			} else if (userChoice == 2) { // 로그인 선택시
				while (true) {
					FileReader fr = null;
					BufferedReader br = null;
					LineNumberReader lr = null;

					this.user = new User(); //
					System.out.println(userIdMsg); // 아이디 입력 메세지
					String userID = sc.next(); // 아이디 입력
					this.user.setUserID(userID);

					if (this.user.idcheck()) {
						System.out.println("존재하지 않는 아이디 입니다.");
						continue;
					} else {
						System.out.println(userPwMsg); // 비밀번호 입력 메세지
						String userPW = sc.next(); // 비밀번호 입력
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
										System.out.println("비밀번호가 다릅니다.");
										break;
									} else if (pw.equals(this.user.getUserPW())) {
										System.out.println("로그인 성공");
										System.out.println("입력하신 아이디 : " + userID + "입니다.");
										System.out.println("입력하신 비밀번호 : " + userPW + "입니다.");
										break;

									} else {
										System.out.println("잘못된 값이 입력되었습니다.");
									}
								} else {
									System.out.println("비밀번호가 틀림");
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
					// 객체
					break; //

				}
//				System.out.println("로그인성공");
			}
		}
	}

	public static void main(String[] args) {
		Login2 login2 = new Login2();
	}
}
