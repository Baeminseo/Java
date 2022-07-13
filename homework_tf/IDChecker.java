package homework_tf;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class IDChecker {

	String email;
	String passwd;//��ȣ �ʵ� �߰�..

	
	public IDChecker(String email) {
		this.email = email;
	}
	//public static void main(String[] args) {
	public int checkId() {//main �޼��忡�� ����.
		int result = 0; 
		
		// TODO Auto-generated method stub
		//String email = JOptionPane.showInputDialog("�̸��� �Է�");
		String id = null, server = null;

		String invalidReason = null;
		
		while (true) {

			if (isEmail(email)) {
				id = email.substring(0, email.indexOf('@'));
				server = email.substring(email.indexOf('@') + 1, email.length());
				
				int upperChar = 0;
				int digit = 0;
				
				
				if (id.length() > 12 || id.length() < 6) {
					email = JOptionPane.showInputDialog("ID ���̰� ���� �ʽ��ϴ�.(6 ~ 12)");
					result = 1;
					//continue; 
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
					result = 2;
					email = JOptionPane.showInputDialog(invalidReason);
					continue;
				}
				if (digit == 0) {
					invalidReason = "���ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.\n";
					result = 3;
					email = JOptionPane.showInputDialog(invalidReason);
					continue;
				}
				
//				if (emailid == id) {
//					invalidReason = "�̹� �����ϴ� �̸����Դϴ�. ���Է����ּ���.";
//					result = 4;
//					email = JOptionPane.showInputDialog(invalidReason);
//					continue;
//				}
				result = 5;
//				
//				server = server.replace(server, "itkorea.co.kr");
//				email = id + "@" + server;
//				JOptionPane.showMessageDialog(null, email + "�� ȸ������ ����!!\n���� ���� ���浵 �Ϸ��߽��ϴ�.");
//				System.exit(0);

			} else {
				email = JOptionPane.showInputDialog("�ùٸ� �̸��� ���� �ƴ�. ���Է� �ٶ�");
				
			}
			return result;
		}

	}
	public boolean isEmail(String email) {//���� �޼��� ����...
		if (email.indexOf('@') == -1) {
			this.email = JOptionPane.showInputDialog("�ùٸ� �̸��� ���� �ƴ�. ���Է� �ٶ�");
			//return false;
		}
		return true;
	}
	public String getEmail() {//Email getter �߰�..
		return email;
	}
	public void setPasswd(String passwd) {//�߰�
		this.passwd = passwd;
	}
	public String getPasswd() {//�߰�
		return passwd;
	}

}
