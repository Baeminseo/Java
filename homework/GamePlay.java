package homework;
import java.util.Random;
public class GamePlay extends UserInfo {

	private static String userInput;
	protected static int chgInput;
	Random r;

	public GamePlay(String userInput) {
		this.userInput = userInput;
		init();
	}
	// �ʱ�ȭ �޼ҵ�
	public void init() {
		r = new Random();
		if (userInput.equals("����")) {
			chgInput = 0;
		} else if (userInput.equals("����")) {
			chgInput = 1;
		} else if (userInput.equals("��")) {
			chgInput = 2;
		}
	}
	// ��ǻ�� �� ���� �� ������� ���� ���Ͽ� ��� ����
	public void play() {
		int i = r.nextInt(3);
		if (chgInput == 0 & i == 1 || chgInput == 1 & i == 2 || chgInput == 2 & i == 0) {
			System.out.println("�����մϴ�. ����� �̰���ϴ�.");
			getWin();
		} else if (chgInput == i) {
			System.out.println("��ǻ�Ϳ� ����� �����ϴ�.");
			getdraw();
		} else {
			System.out.println("��Ÿ������ �����ϴ�.");
			getlose();
		}
	}
}
