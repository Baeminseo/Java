package homework_final;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;

public class EmailChecker {
//이메일 확인

	private static String id;
	private static String password;

	public EmailChecker(String email) {
		this.id = email;
	}

	public static void useremail() {
		// 회원가입 이메일 입력받기
		String Email = JOptionPane.showInputDialog("이메일 입력을 입력하세요.(ID는 6~12 사이여야하며, 반드시 대문자 하나와 숫자 하나가 포함되어있어야합니다.)");
		while (true) {

			int upperChar = 0;
			int digit = 0;

			// @포함되어있는지 확인하기
			if (Email.contains("@")) {
				// ID 길이재기
				id = Email.substring(0, Email.indexOf('@'));
				if (id.length() > 12 || id.length() < 6) {
					Email = JOptionPane.showInputDialog("ID 가 길거나 짧습니다.재입력해주세요.");
					continue;
				} else {// 길이가 맞으면 대문자와 숫자 확인
					for (int i = 0; i < id.length(); i++) {
						char chh = id.charAt(i);
						if (chh >= 'A' && chh <= 'Z') {
							upperChar++;
						} else if (chh >= (int) '0' && chh <= (int) '9') {
							digit++;
						}
					}
					if (upperChar == 0) {
						Email = JOptionPane.showInputDialog("대문자가 하나 이상 포함되어야 합니다.");
						continue;
					}
					if (digit == 0) {
						Email = JOptionPane.showInputDialog("숫자가 하나 이상 포함되어야 합니다.");
						continue;
					}
				}
			} else {
				JOptionPane.showInputDialog("올바른 Email이 아닙니다.재입력해주세요.");
			}

			break;
		}
		// 비밀번호 등록
		while (true) {
			password = JOptionPane.showInputDialog("비밀번호를 입력해주세요.(PW는 4글자 이상이어야합니다.)");

			if (password.length() < 4) {
				JOptionPane.showMessageDialog(null, "비밀번호가 올바르지 않습니다. 재입력해주세요.");
//			} else {
//				// playerFile 에서 회원 등록
//				MemberDAO;
//				break;
//			}
		}
	}
	}

//	public static void playerFile() {
//		File dir = new File("C:\\Players");
//
//		if (!dir.exists() || !dir.isDirectory()) {
//			dir.mkdir();
//		} else {
//			File theFile = new File(dir, id);
//			// 상위 폴더 하위에 player 등록
//			// 입력한 이메일과 비밀번호를 파일에 넣는다.
//			try {
//				if (theFile.createNewFile()) {
//					// 회원가입 완료 메세지 띄우기
//					JOptionPane.showMessageDialog(null, theFile.getName() + " 님 회원가입 되셨습니다.");
//					// 비밀번호 넣어야함.
//					FileWriter fw = new FileWriter(theFile);// theFiles 에 넣어야하는데 안들어감
//					PrintWriter printWriter = new PrintWriter(theFile);
//					printWriter.print(password);
//					printWriter.close();
//					// HashMap map = new HashMap();
//					// map.put(id,password);
//					fw.close();
//					// 로그인 시간 확인
//					pwtime(theFile);
//				} else {
//					// 아이디 중복확인
//					JOptionPane.showMessageDialog(null, "아이디가 중복되었습니다. 재입력해주세요.");
//					useremail();
//				}
//			} catch (IOException e) {
//
//			}
//
//		}
//	}

//	// 로그인 전용 메서드
//	// 로그인 하기
//	public static void login(File theFile) {
//
//		File[] files = theFile.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			String loginid = JOptionPane.showInputDialog("아이디를 입력하세요.");
//			File thePlayer = files[i];
//			String id = thePlayer.getName();
//			if (id.equals(loginid)) {
//				String loginpw = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
//				if (loginpw.equals(password)) {
//					JOptionPane.showMessageDialog(null, id + "님 로그인 완료되었습니다.");
//					pwtime(theFile);
//
//				} else {
//					JOptionPane.showMessageDialog(null, id + "님 비밀번호가 틀렸습니다. 재입력해주세요.");
//				}
//			} else {
//				JOptionPane.showMessageDialog(null, "아이디가 틀렸습니다. 재입력해주세요.");
//				continue;
//			}
//		}
//	}
//
//	public static void pwtime(File theFile) {
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter(theFile);
//			long loginTime = System.currentTimeMillis();
//			long nowlogin = System.currentTimeMillis();
//			fw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}

	// 패스워드 기간을 확인한다.

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id += id;
	}

}
