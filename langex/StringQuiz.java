package langex;

/*
		 * �̸��� ���� ���α׷��� �ۼ��ϼ���. ������ �Ʒ��� �����ϴ�. 1. ���α׷��� �����ϸ� �̸��� �Է��ϼ���. ��� ���� �Է¹ޱ� 2. �̸���
		 * �� ID�� 6~12 ���̿����ϸ�, �ݵ�� �빮�� �ϳ��� ���� �ϳ��� ���ԵǾ��־���մϴ�. 3. @ �� �ִ� �̸��������� Ȯ���ؾ��մϴ�.
		 * 4. ��� ������ ������ ���ϼ����� �����ϵ��� �մϴ�. koreait.com ���� --> ex> aaa@aa.com
		 * -->aaa@koreait.com 5. �� �������� ����Ǵ� ������ ��� ����ϵ����ϼ���. ��, �빮�ڰ� �����ϴ�. ID ��
		 * ��ų�ª���ϴ�. @�� ������ �ùٸ� Email�� �ƴմϴ�.. �� 6. �ùٸ� ID �� �Էµɶ����� ��� �Է� �޽��ϴ�.
		 */
import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		while (true) {
			// �̸��� �Է¹ޱ�
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸����� �Է��ϼ�"
					+ "�� : " + "(ID�� 6~12 ���̿����ϸ�, �ݵ�� �빮�� �ϳ��� ���� �ϳ��� ���ԵǾ��־���մϴ�.)");
			String email = sc.next();

			int upperChar = 0;
			int digit = 0;
			//@���ԵǾ��ִ��� Ȯ���ϱ�
			if (email.contains("@")) {
				// ID �������
				String id = email.substring(0, email.indexOf('@'));
				if (id.length() > 12 || id.length() < 6) {
					System.out.println("ID �� ��ų� ª���ϴ�.���Է����ּ���.");
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
						System.out.println("�빮�ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.");
						continue;
					}
					if (digit == 0) {
						System.out.println("���ڰ� �ϳ� �̻� ���ԵǾ�� �մϴ�.");
						continue;
					}
				}
			} else {
				System.out.println("�ùٸ� Email�� �ƴմϴ�.���Է����ּ���.");
				continue;
			}
			// �� �����ǹǷ� ���� �ּ� �ٲٱ�
			String server = email.substring(email.indexOf('@') + 1);
			String chg = email.replace(server, "koreait.com");
			System.out.println(chg+"���� ���� �Ϸ�Ǿ����ϴ�.");
			break;
		}
	}
}
