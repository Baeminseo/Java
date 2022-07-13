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
	// 초기화 메소드
	public void init() {
		r = new Random();
		if (userInput.equals("가위")) {
			chgInput = 0;
		} else if (userInput.equals("바위")) {
			chgInput = 1;
		} else if (userInput.equals("보")) {
			chgInput = 2;
		}
	}
	// 컴퓨터 값 생성 및 사용자의 값과 비교하여 결과 도출
	public void play() {
		int i = r.nextInt(3);
		if (chgInput == 0 & i == 1 || chgInput == 1 & i == 2 || chgInput == 2 & i == 0) {
			System.out.println("축하합니다. 당신이 이겼습니다.");
			getWin();
		} else if (chgInput == i) {
			System.out.println("컴퓨터와 당신이 비겼습니다.");
			getdraw();
		} else {
			System.out.println("안타깝지만 졌습니다.");
			getlose();
		}
	}
}
