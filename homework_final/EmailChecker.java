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
//�̸��� Ȯ��

	private static String id;
	private static String password;

	public EmailChecker(String email) {
		this.id = email;
	}

	public static void useremail() {
		// ȸ������ �̸��� �Է¹ޱ�
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
		// ��й�ȣ ���
		while (true) {
			password = JOptionPane.showInputDialog("��й�ȣ�� �Է����ּ���.(PW�� 4���� �̻��̾���մϴ�.)");

			if (password.length() < 4) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �ùٸ��� �ʽ��ϴ�. ���Է����ּ���.");
//			} else {
//				// playerFile ���� ȸ�� ���
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
//			// ���� ���� ������ player ���
//			// �Է��� �̸��ϰ� ��й�ȣ�� ���Ͽ� �ִ´�.
//			try {
//				if (theFile.createNewFile()) {
//					// ȸ������ �Ϸ� �޼��� ����
//					JOptionPane.showMessageDialog(null, theFile.getName() + " �� ȸ������ �Ǽ̽��ϴ�.");
//					// ��й�ȣ �־����.
//					FileWriter fw = new FileWriter(theFile);// theFiles �� �־���ϴµ� �ȵ�
//					PrintWriter printWriter = new PrintWriter(theFile);
//					printWriter.print(password);
//					printWriter.close();
//					// HashMap map = new HashMap();
//					// map.put(id,password);
//					fw.close();
//					// �α��� �ð� Ȯ��
//					pwtime(theFile);
//				} else {
//					// ���̵� �ߺ�Ȯ��
//					JOptionPane.showMessageDialog(null, "���̵� �ߺ��Ǿ����ϴ�. ���Է����ּ���.");
//					useremail();
//				}
//			} catch (IOException e) {
//
//			}
//
//		}
//	}

//	// �α��� ���� �޼���
//	// �α��� �ϱ�
//	public static void login(File theFile) {
//
//		File[] files = theFile.listFiles();
//		for (int i = 0; i < files.length; i++) {
//			String loginid = JOptionPane.showInputDialog("���̵� �Է��ϼ���.");
//			File thePlayer = files[i];
//			String id = thePlayer.getName();
//			if (id.equals(loginid)) {
//				String loginpw = JOptionPane.showInputDialog("��й�ȣ�� �Է��ϼ���.");
//				if (loginpw.equals(password)) {
//					JOptionPane.showMessageDialog(null, id + "�� �α��� �Ϸ�Ǿ����ϴ�.");
//					pwtime(theFile);
//
//				} else {
//					JOptionPane.showMessageDialog(null, id + "�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ���Է����ּ���.");
//				}
//			} else {
//				JOptionPane.showMessageDialog(null, "���̵� Ʋ�Ƚ��ϴ�. ���Է����ּ���.");
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

	// �н����� �Ⱓ�� Ȯ���Ѵ�.

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id += id;
	}

}
