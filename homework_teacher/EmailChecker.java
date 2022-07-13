package homework_teacher;

import java.awt.Component;

import javax.swing.JOptionPane;

public class EmailChecker {
//이메일 확인

	private static String id;

	public static void useremail() {
		// 이메일 입력받기
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

		
	}
	public String getid() {
			return id;
		}
	public void setid(String id) {
		this.id += id;
	}
	
	
}
