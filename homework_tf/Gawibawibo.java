package homework_tf;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Gawibawibo {

	// ����� ��ü Ÿ�� �ʵ� ����.
	static private Checker checker;
	static private Gamer gamer;
	static private PlayerInfo user;

	static private String input; // ������� �Է°� ����. ��Ȳ�� ���� ��� ����ؾ� �ϱ� ������ �ʵ�� ����.
	public static String strValues[] = { "����", "����", "��" };
	private static int com;
	static long passlogin = 0;

	// �޼��� ��� �迭 ����.
	public static String[] messages = { "������ ���� �մϴ�.(Y/N)", "���������� �� �ϳ� �Է��ϼ���.", "�Է��� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.",
			"������ �ٽ� �Ͻðڽ��ϱ�?(Y/N)" };
	public static String[] messages2 = { "1.ID �����ϱ�(ȸ������)", "2.�α��� �ϱ�.", "3.��ŷ����." };
	

	public static void main(String[] args) {
		// ����ڿ��� �޼������ �� ���ð� �Է� �޵��� �Ѵ�.
		startMessage();

		// ������� �Է°��� ������ �ʱ�ȭ �Ѵ�. ���� ���� �����ؼ� ������ ���� �б� ��Ų��..�ش� Ŭ���� �м� �غ���.
		checker = new Checker(input);
		while (true) {

			// �� �����Ұ�.
			if (checker.check()) {// �ùٸ� ���� ����ڰ� �־����� ���� �÷���..
				// gamer �����ڿ� ����� �� �־��ְ� �ʱ�ȭ...���� ������-->�ʱ�ȭ�޼���-->�÷��̸޼��� �� ȣ�� ���踦 ���� �ڵ����� ������
				// ����ȴ�.
				gamer = new Gamer(input);

				// ���� ��� get..
				int result = gamer.getGameResult();
				// ��ǻ���� �� get..
				com = gamer.getCom();

				if (user == null) {// ó�� �����÷��̶�� ��ü �ʱ�ȭ ���ְ�..ù �����̱⿡ ��ü ������ �Ѱ�����,
					// ���� ����ø��� ��ü�� �����ϸ� ���� ���� ���� �ϱ� ��ƴ�. �ؼ� ���� ���Ӻ��ʹ� Ref ������ �̿��ؼ� ������ ������Ų��. ������
					// ����.
					// ��ü�� �Ҵ���� �����ÿ� null �� ���ϵȴ�.(�� ����Ұ�)
					user = new PlayerInfo();
					// ���� ������ �ڵ����� setting �ϴ� �޼��� ȣ���Ͽ� ���� set.
					user.autoSet(result);
					// ��� �޼��� ȭ�鿡 �ѷ��ش�. �Ķ������ ������ �ش� �޼��忡 ���� ������ �� ���� �Ѵ�.
					showMessage(result, user, com);
					// ������ ��� �� �� ���θ� Ȯ���Ѵ�.
					// �Ʒ� ���ڿ��� \"Cancel\" �� �ڹ��� escape ���ڷ� �������� ���� t(tab), "(�ֵ���ǥ) ���� ǥ�����ٶ� ����Ѵ�.
					input = JOptionPane.showInputDialog(
							"������ ��� �ϽǷ��� " + Arrays.toString(strValues) + " �� �ϳ���, �������� \"Cancel\" ��������.");
					// ����ڰ� ���ο� ���� �־����� �ٽ� üũ..���� ���� üũ�� �ؾ��Ѵ�.
					checker.setInput(input);
					// ���� ����ڰ� cancel �� ������ null �� ���ϵǹǷ� ���α׷� �����Ų��.
					if (input == null) {
						programExit();
					}
				} else {// �׷��� �ʴٸ� ���� ����ڰ� ��� ������ �ϴ� ���̹Ƿ� setter �� �̿��ؼ� ������ �����Ѵ�.
					user.autoSet(result);
					showMessage(result, user, com);
					input = JOptionPane.showInputDialog(
							"������ ��� �ϽǷ��� " + Arrays.toString(strValues) + " �� �ϳ���, �������� \"Cancel\" ��������.");
					checker.setInput(input);
					if (input == null) {
						programExit();
					}
				}
			} else {// ���������� �� �ƴ� �̻��� �� �־�����..
				input = JOptionPane.showInputDialog(messages[1]);
				// ������� �ٸ����� checker �� �����Ѵ�...�ٽ� ������..
				checker.setInput(input);
			}
		}
	}

	private static void programExit() {
		JOptionPane.showMessageDialog(null, "���α׷��� ���� �մϴ�.", "���α׷� ����", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

	// ó�� ���۽� �ʱ� �޼����� �����ְ� ������� ������ �޴´�.
	// y �Ǵ� Y �϶��� �������� ����ǰ�, ������ ���α׷� ����
	private static void startMessage() {
		input = JOptionPane.showInputDialog(Arrays.toString(messages2));
		System.out.println(input);
		MemberDAO memberCreate;
		IDChecker checker;
		Member member;
		String email, passwd = null;
		/*
		 * 0 : @ ���� 1 : ���� Ʋ�� 2 : �빮�� ���� 3 : �ҹ��� ���� 4 : �̸��� �ߺ�Ȯ�� 5 : ���� ID(Email)
		 */
		int idResult = 0;//

		try {
			switch (Integer.parseInt(input)) {
			case 1:
				email = JOptionPane.showInputDialog("Email �� �Է��Ͽ� �ּ���");
				checker = new IDChecker(email);
				idResult = checker.checkId();
				if (idResult == 5) {// Email ���� Check OK...
					// IDChecker ���� ���� �� ���� �� ID �� ���� ID �̱� ������ getter �� ���� �ٽ� ���´�.
					email = checker.getEmail();
					// Password �Է� �ޱ�.s
					passwd = JOptionPane.showInputDialog("��ȣ�� �Է��Ͽ� �ּ���");
					checker.setPasswd(passwd);
					// ��������� �����մϴ�.
					member = new Member(System.currentTimeMillis(), email, passwd);
					// ���� ���� Go
					int newMember = new MemberDAO(member).doWork();
					if (newMember == 1) {
						int firLogin = JOptionPane.showConfirmDialog(null, "ȸ�������� �Ϸ� �Ǿ����ϴ�. �α��� �Ͻðڽ��ϱ�?");
						passlogin = System.currentTimeMillis();
						if (firLogin == 0) {// ok �� 0 ����..
							// Login ��Ű��..���� �߰���..
							logIn();
						} else {
							// Yes �� �ƴ� �ٸ� ���� �ϴ� ���� ��Ű�� �������� ������ �������� �ٸ��ɷ� �ٲ㺸����~
							JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
							System.exit(0);
						}
					}
				}
			case 2:
				int result = logIn();
				if(result == 2) {
					break;
				}
				else {
					//����� �������� ������ ������...-1 �ΰ�� ȸ���ƴ�, 0 �� ��� ��ȣ Ʋ�� 
				}
			case 3:

				break;

			default:
				break;
			}
		} catch (Exception e) {
			// ����ڰ� �Է� ������ �׳� �������� �ߴµ�, �������� �˸°� ������ ������~~
			// TODO: handle exception
			JOptionPane.showConfirmDialog(null, "�Է°��� Ʋ���ϴ�..���α׷� ���� �մϴ�.");
			System.exit(0);
		}

		input = JOptionPane.showInputDialog(Arrays.toString(strValues) + messages[0]);
		// ù ���۽� cancel �̺�Ʈ�� ���� ó����.
		try {
			// ��ҹ��� ���о��� ���ڿ� ���� ������ �� �� ���� ���.equals() �� ��ҹ��� ������.
			if (input.equalsIgnoreCase("y")) {
				// ���������� �� �ϳ� ������� ������ �ٸ����� �־ �����ϵ��� �����ߴ�. �м� �غ�����..
				input = JOptionPane.showInputDialog(messages[1]);
				return;
			}
		} catch (Exception e) {
			int res = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?");
			if (res == 0 || res == 2) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
				System.exit(0);
			}
			input = JOptionPane.showInputDialog(messages[1]);
			// �ѹ��� cancel �� ���α׷� ���� ����
			if (input == null) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
				System.exit(0);
			}
		}
		if (input.equalsIgnoreCase("n")) {
			// �޼��� �ڽ��� ����ϴ� GUI ȣ��.
			JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�");
			// �Ʒ� �ڵ�� ��������� ���� �������� �ڹ� ���α׷��� �����ϴ� �ڵ��̴�.
			System.exit(0);
		} else {// Y/N �ƴ� �ٸ� �� ���� ��� ó��..
			JOptionPane.showMessageDialog(null, "������ �� ���� ��ɾ� �Դϴ�. ���α׷� �����մϴ�");
			System.exit(0);
		}

	}
	//�α��� �޼��� �߰���..
	private static int logIn() {
		int result = -1;
		//�α��νÿ� �α��� �ð� Setting �� ���� ��� �ð��� �����ɴϴ�.
		//���� �����ϰ� �۾��մϴ�...���� �۾��� �������� ���� �غ�����..
		String input = JOptionPane.showInputDialog("ID�� Pass ������ \',\' �� �־ �Է� �ٶ��ϴ�");
		System.out.println(input);
		StringTokenizer st = new StringTokenizer(input,",");//�� ��ü�� ���ڿ��� Delimeter �� �������� ���ڿ��� �и� ���� ���� ���ִ� ��ü�Դϴ�. "," �� �������� �и��ؼ� id,pass �����մϴ�.
		String id=null, passwd = null;
		Member member = null;
		while(st.hasMoreElements()) {
			member = new Member(System.currentTimeMillis(), st.nextToken(), st.nextToken());
		}
		System.out.println(member.getEmail());
		new MemberDAO().logIn(member);
		
		//System.exit(0);
		
		return result;
	}

	/*
	 * ���� ��� �����ִ� �޼���.. ���� ������ ����ڰ�ü(PlayerInfo) �� �ֱ� ������ �Ķ���ͷ� �ް�, idx �� ���п� ����
	 * index, comValue �� ��ǻ���� ��.
	 */
	public static void showMessage(int idx, PlayerInfo user, int comValue, PrintStream bw) {
		
		if (idx == 0) {
			String msg = "��屺��!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";
			bw.write(msg);
			bw.close();
			// JOptionPane.showMessageDialog �� msg �� ������ �˾����� �ѷ��ش�.
			JOptionPane.showMessageDialog(null, msg);
		} else if (idx == 1) {
			String msg = "�̰屺��!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";
			bw.write(msg);
			bw.close();
			JOptionPane.showMessageDialog(null, msg);
		} else if (idx == 2) {
			String msg = "������!! --> �����(" + input + ") : ��ǻ��(" + strValues[comValue] + ")\n" + "���� --> "
					+ user.getTotal() + " : " + user.getWin() + "�� " + user.getDraw() + "�� " + user.getLose() + "��\n"
					+ "�·� --> " + user.getWin_Rate() + "%";
			bw.write(msg);
			bw.close();
			JOptionPane.showMessageDialog(null, msg);
		}
		
	}
}
