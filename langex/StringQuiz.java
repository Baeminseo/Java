package langex;

/*
		 * 이메일 검증 프로그램을 작성하세요. 조건은 아래와 같습니다. 1. 프로그램을 시작하면 이메일 입력하세요. 라고 띄우고 입력받기 2. 이메일
		 * 중 ID는 6~12 사이여야하며, 반드시 대문자 하나와 숫자 하나가 포함되어있어야합니다. 3. @ 가 있는 이메일인지를 확인해야합니다.
		 * 4. 모든 검증이 끝나면 메일서버를 변경하도록 합니다. koreait.com 으로 --> ex> aaa@aa.com
		 * -->aaa@koreait.com 5. 위 검증에서 위배되는 사항은 모두 출력하도록하세요. 즉, 대문자가 없습니다. ID 가
		 * 길거나짧습니다. @가 없으면 올바른 Email이 아닙니다.. 등 6. 올바른 ID 가 입력될때까지 계속 입력 받습니다.
		 */
import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		while (true) {
			// 이메일 입력받기
			Scanner sc = new Scanner(System.in);
			System.out.println("이메일을 입력하세"
					+ "요 : " + "(ID는 6~12 사이여야하며, 반드시 대문자 하나와 숫자 하나가 포함되어있어야합니다.)");
			String email = sc.next();

			int upperChar = 0;
			int digit = 0;
			//@포함되어있는지 확인하기
			if (email.contains("@")) {
				// ID 길이재기
				String id = email.substring(0, email.indexOf('@'));
				if (id.length() > 12 || id.length() < 6) {
					System.out.println("ID 가 길거나 짧습니다.재입력해주세요.");
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
						System.out.println("대문자가 하나 이상 포함되어야 합니다.");
						continue;
					}
					if (digit == 0) {
						System.out.println("숫자가 하나 이상 포함되어야 합니다.");
						continue;
					}
				}
			} else {
				System.out.println("올바른 Email이 아닙니다.재입력해주세요.");
				continue;
			}
			// 다 충족되므로 메일 주소 바꾸기
			String server = email.substring(email.indexOf('@') + 1);
			String chg = email.replace(server, "koreait.com");
			System.out.println(chg+"으로 가입 완료되었습니다.");
			break;
		}
	}
}
