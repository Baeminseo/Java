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
			System.out.println("회원가입을 원하시면 1, 로그인을 하실거면 2를 입력해주세요.");
			String userStart = sc.next();
//			String readVal = null;

			if (userStart.equals("1")) {
				while (true) {
					System.out.println("아이디를 입력하세요.");
					userid = sc.next();
					File file = new File("/data/" + userid);

					if (!file.exists() || !file.isDirectory()) {
						file.mkdir();
						System.out.println("비밀번호를 입력하세요.");
						userpw = sc.next();
						System.out.println("비밀번호 설정이 완료되었습니다.");
						break;
					} else {
						System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
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
			
				System.out.println("아이디를 입력하세요.");
				
				
				String loginId = sc.next();
				if() {
					
				}
				
				
				
			} 
			else {
				System.out.println("잘못된 입력값입니다.");
			}
		}

	}
}
