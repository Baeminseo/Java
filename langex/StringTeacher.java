package langex;
import javax.swing.JOptionPane;
public class StringTeacher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = JOptionPane.showInputDialog("�̸��� �Է�");
		String id = null, server = null;
		String invalidReason = null;
		
		while (true) {

			if (isEmail(email)) {
				id = email.substring(0, email.indexOf('@'));
				server = email.substring(email.indexOf('@') + 1, email.length());
				
				int upperChar = 0;
				int digit = 0;
				
				
				if (id.length() > 12 || id.length() < 6) {
					email = JOptionPane.showInputDialog("ID �� ��ų� ª���ϴ�.���Է����ּ���.");
					continue;
				}
				// ID ���� ����..
				for (int i = 0; i < id.length(); i++) {
					char ch = id.charAt(i);
					/*Character API ����
					if(Character.isUpperCase(ch)) {
						upperChar++;
					}
					if(Character.isDigit(ch)) {
						digit++;
					}
					*/
					//�ϵ��ڵ�.
					if (ch >= 'A' && ch <= 'Z') {
						upperChar++;
					}
					if (ch >= (int) '0' && ch <= (int) '9') {
						digit++;
					}
					
				}
				if (upperChar == 0) {
					invalidReason = "�빮�ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.\n";
					email = JOptionPane.showInputDialog(invalidReason);
					continue;
				}
				if (digit == 0) {
					invalidReason = "���ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.\n";
					email = JOptionPane.showInputDialog(invalidReason);
					continue;
				}
				
				server = server.replace(server, "itkorea.co.kr");
				email = id + "@" + server;
				JOptionPane.showMessageDialog(null, email + "�� ȸ������ ����!!\n���� ���� ���浵 �Ϸ��߽��ϴ�.");
				System.exit(0);

			} else {
				email = JOptionPane.showInputDialog("�ùٸ� �̸��� ���� �ƴ�. ���Է� �ٶ�");
			}
		}

	}
	public static boolean isEmail(String email) {
		if (email.indexOf('@') == -1)
			return false;
		return true;
	}

}
