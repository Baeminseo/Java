package homework_teacher;

import java.awt.Component;

import javax.swing.JOptionPane;

public class EmailChecker {
//�̸��� Ȯ��

	private static String id;

	public static void useremail() {
		// �̸��� �Է¹ޱ�
		String Email = JOptionPane.showInputDialog("�̸��� �Է��� �Է��ϼ���.(ID�� 6~12 ���̿����ϸ�, �ݵ�� �빮�� �ϳ��� ���� �ϳ��� ���ԵǾ��־���մϴ�.)");
		while (true) {

			int upperChar = 0;
			int digit = 0;

			// @���ԵǾ��ִ��� Ȯ���ϱ�
			if (Email.contains("@")) {
				// ID �������
				id = Email.substring(0, Email.indexOf('@'));
				if (id.length() > 12 || id.length() < 6) {
					Email = JOptionPane.showInputDialog("ID �� ��ų� ª���ϴ�.���Է����ּ���.");
					continue;
				} else {// ���̰� ������ �빮�ڿ� ���� Ȯ��
					for (int i = 0; i < id.length(); i++) {
						char chh = id.charAt(i);
						if (chh >= 'A' && chh <= 'Z') {
							upperChar++;
						} else if (chh >= (int) '0' && chh <= (int) '9') {
							digit++;
						}
					}
					if (upperChar == 0) {
						Email = JOptionPane.showInputDialog("�빮�ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.");
						continue;
					}
					if (digit == 0) {
						Email = JOptionPane.showInputDialog("���ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.");
						continue;
					}
				}
			} else {
				JOptionPane.showInputDialog("�ùٸ� Email�� �ƴմϴ�.���Է����ּ���.");

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
