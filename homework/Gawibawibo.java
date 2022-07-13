package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Gawibawibo {

	// 사용할 객체 타입 필드 선언.
	static private Checker checker;
	static private Gamer gamer;
	static private PlayerInfo user;
	static private EmailChecker userEmail;
	static private EmailChecker login;

	static private String input; //사용자의 입력값 변수. 상황에 따라 계속 사용해야 하기 때문에 필드로 선언.
	public static String strValues[] = { "가위", "바위", "보" };
	private static int com;


	// 메세지 출력 배열 생성.
	public static String[] messages = { "게임을 시작 합니다.(Y/N)", "가위바위보 중 하나 입력하세요.", "입력이 틀렸습니다. 다시 입력해주세요.",
			"게임을 다시 하시겠습니까?(Y/N)" ,"회원가입을 원하시면 Y , 로그인을 원하시면 L 를 선택해주세요."};

	public static void main(String[] args) {
		//사용자에게 메세지출력 및 선택값 입력 받도록 한다.
		startMessage();
		
		//사용자의 입력값을 가지고 초기화 한다. 이후 값을 검증해서 목적에 따라 분기 시킨다..해당 클래스 분석 해볼것.
		checker = new Checker(input);
		while (true) {
			
			// 값 검증할것.
			if (checker.check()) {// 올바른 값을 사용자가 넣었으니 게임 플레이..
				// gamer 생성자에 사용자 값 넣어주고 초기화...이후 생성자-->초기화메서드-->플레이메서드 의 호출 관계를 통해 자동으로 게임이 실행된다.
				gamer = new Gamer(input);
				
				//승패 결과 get..
				int result = gamer.getGameResult();
				//컴퓨터의 값 get..
				com = gamer.getCom();

				if (user == null) {//처음 게임플레이라면 객체 초기화 해주고..첫 게임이기에 객체 생성을 한것으로, 
					//게임 실행시마다 객체를 실행하면 누적 값을 유지 하기 어렵다. 해서 이후 게임부터는 Ref  변수를 이용해서 전적을 누적시킨다. 눈여겨 본다.
					//객체가 할당되지 않을시엔 null 이 리턴된다.(꼭 기억할것)
					user = new PlayerInfo();
					//승패 전적을 자동으로 setting 하는 메서드 호출하여 전적 set.
					user.autoSet(result);
					//결과 메세지 화면에 뿌려준다. 파라미터의 정보는 해당 메서드에 정의 했으니 꼭 이해 한다.
					showMessage(result, user, com, userEmail);
					//게임을 계속 할 지 여부를 확인한다.
					//아래 문자열중 \"Cancel\" 는 자바의 escape 문자로 역슬래쉬 옆에 t(tab), "(쌍따옴표) 등을 표기해줄때 사용한다.
					input = JOptionPane
							.showInputDialog("게임을 계속 하실려면 " + Arrays.toString(strValues) + " 중 하나를, 끝내려면 \"Cancel\" 누르세요.");
					//사용자가 새로운 값을 넣었으니 다시 체크..오류 값도 체크를 해야한다.
					checker.setInput(input);
					//만약 사용자가 cancel 을 누르면 null 이 리턴되므로 프로그램 종료시킨다.
					if(input == null) {
						programExit(userEmail, user, login);
					}
				} else {// 그렇지 않다면 기존 사용자가 계속 게임을 하는 것이므로 setter 를 이용해서 정보만 누적한다.
					user.autoSet(result);
					showMessage(result, user, com, userEmail);
					input = JOptionPane
							.showInputDialog("게임을 계속 하실려면 " + Arrays.toString(strValues) + " 중 하나를, 끝내려면 \"Cancel\" 누르세요.");
					checker.setInput(input);
					if(input == null) {
						programExit(userEmail, user, login);
					}
				}
			}else {//가위바위보 가 아닌 이상한 값 넣었을떄..
				input = JOptionPane.showInputDialog(messages[1]);
				//사용자의 다른값을 checker 에 세팅한다...다시 루프로..
				checker.setInput(input); 
			}
		}
	}
	
	private static void programExit(EmailChecker id, PlayerInfo email,EmailChecker theFile) {
		
		String msg = "사용자"+id.getid()+"님의 전적 --> "
				+ user.getTotal() + " : " + user.getWin() + "승 " + user.getDraw() + "무 " + user.getLose() + "패\n"
				+ "승률 --> " + user.getWin_Rate() + "%";
		JOptionPane.showMessageDialog(null, "프로그램을 종료 합니다.", "프로그램 종료", JOptionPane.INFORMATION_MESSAGE);
		FileWriter fw = null;
		try {
			fw = new FileWriter("theFile");//theFiles 에 넣어야하는데 안들어감
			fw.write(msg);
			fw.close();
		}catch (IOException e) {
			
		}
		System.exit(0);
	}
	
	
	//처음 시작시 초기 메세지를 보여주고 사용자의 선택을 받는다.
	//y 또는 Y 일때만 다음으로 실행되고, 나머진 프로그램 종료
	private static void startMessage() {
		if (input == null) {
			//회원가입을 원하는지, 로그인을 원하는지 묻는다.
			input = JOptionPane.showInputDialog(Arrays.toString(strValues) + messages[4]);
			if (input.equalsIgnoreCase("y")) {
				//이메일 받기 및 확인하기
				userEmail = new EmailChecker();
				EmailChecker.useremail();
			} else if (input.equalsIgnoreCase("l")) {
				//로그인한다.
				EmailChecker.login(null);
				}
			
			
			//첫 메세지 출력후 게임 여부 확인한다.cancel 을 클릭하면 null 이 리턴되고, 값을 입력하면 문자열로 리턴된다.
			input = JOptionPane.showInputDialog(Arrays.toString(strValues) + messages[0]);
			// 대소문자 구분없이 문자열 값이 같은지 비교 메 서드 사용.equals() 는 대소문자 구분함.
			if (input.equalsIgnoreCase("y")) {
				//게임시작
				input = JOptionPane.showInputDialog(messages[1]);
			} else if (input.equalsIgnoreCase("n")) {
				// 메세지 박스만 출력하는 GUI 호출.
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다");
				//아래 코드는 명시적으로 현재 실행중인 자바 프로그램을 종료하는 코드이다.
				System.exit(0);
			} else {// Y/N 아닌 다른 값 들어올 경우 처리..
				JOptionPane.showMessageDialog(null, "실행할 수 없는 명령어 입니다. 프로그램 종료합니다");
				System.exit(0);
			}
		}
	}

	/*
	 * 게임 결과 보여주는 메서드..
	 * 전적 정보는 사용자객체(PlayerInfo) 에 있기 때문에 파라미터로 받고, idx 는 승패에 대한 index, comValue 는 컴퓨터의 값.
	 */
	public static void showMessage(int idx, PlayerInfo user, int comValue, EmailChecker id) {
		
		if (idx == 0) {
			String msg = "비겼군요!! --> 사용자(" + input + ") : 컴퓨터(" + strValues[comValue] + ")\n" + "사용자"+id.getid()+"님의 전적 --> "
					+ user.getTotal() + " : " + user.getWin() + "승 " + user.getDraw() + "무 " + user.getLose() + "패\n"
					+ "승률 --> " + user.getWin_Rate() + "%";

			//JOptionPane.showMessageDialog 는 msg 의 내용을 팝업으로 뿌려준다.
			JOptionPane.showMessageDialog(null, msg);
		} else if (idx == 1) {
			String msg = "이겼군요!! --> 사용자(" + input + ") : 컴퓨터(" + strValues[comValue] + ")\n" + "사용자"+id.getid()+"님의 전적 --> "
					+ user.getTotal() + " : " + user.getWin() + "승 " + user.getDraw() + "무 " + user.getLose() + "패\n"
					+ "승률 --> " + user.getWin_Rate() + "%";

			JOptionPane.showMessageDialog(null, msg);
		}else if (idx == 2) {
			String msg = "졌군요!! --> 사용자(" + input + ") : 컴퓨터(" + strValues[comValue] + ")\n" + "사용자"+id.getid()+"님의 전적 --> "
					+ user.getTotal() + " : " + user.getWin() + "승 " + user.getDraw() + "무 " + user.getLose() + "패\n"
					+ "승률 --> " + user.getWin_Rate() + "%";
			
			JOptionPane.showMessageDialog(null, msg);
		}
	}
	
}
