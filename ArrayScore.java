
import java.util.Scanner;

/**
 * 
 * @author Jason(노재현)
 *
 */
/*
 * 배열과 메서드를 이용한 점수 계산 프로그램.. 이 과제가 나가기 전엔 필드(Field) 에 대한 수업 이전이기에 루프중에 점수 검증을
 * 하고, 지역 배열에 점수 누적하기가 쉽지 않았을 거에요.
 * 
 * 지역 변수의 배열이 아닌 static Field(클래스 변수--멤버 필드와 틀림)로 선언해서 사용하는걸 눈여겨 보세요.
 * 
 * 해당 코드에는 지금껏 배웠던 모든 내용이 거의 다 들어가 있습니다.
 * 
 * 이 내용이 무리없이 분석 되고, 코딩 되어진다면 수업의 이해도가 좋다라고 판단 할 수 있습니다.
 * 
 * 참고 하세요!.
 */

public class ArrayScore {

	/*
	 * 여기에 선언 또는 생성 되는 필드들은 static or member 중 하나로 인식됩니다. member 는 이전 수업에 강의했고,
	 * static 은 변수 타입에 static 으로 선언된것을 말합니다. 이 변수들은 지역이 아닌 전역의 개념을 갖게 됩니다.
	 */
	// 3과목에 총점까지 담을 배열 4개 생성.. 총점도 int 이니까!!
	static int scoreArrays[] = new int[4];
	// 과목당 학점을 담을 배열 생성..전체 학점이 아닌 과목당 학점으로 좀 수정했음..
	// 전체 학점은 여러분이 한번 만들어봐요(수정해서..)
	static String grade[] = new String[scoreArrays.length - 1];

	public static void main(String[] args) {
		// main 은 프로그래 시작만 하고, 첫 과목을 입력 받도록 일종의 표식(신호)인 int index
		// 를 파라미터로 넘겨줌..어떻게 사용되는지는 해당 메서드 분석해보세요.^^
		printMsg(0);
	}

	/*
	 * 사용자에게 점수 입력을 유도하고, 점수의 유효성(Validation) 을 검증하는 메서드를 호출 하고, 유효하다면 배열에 점수를 넣는
	 * 메서드를 호출하도록 설계 했어요. 점수 입력때 마다 출력되는 과목이 틀려야 하기에 counter 변수를 이용 상태를 변경토록 했으니,
	 * 분석해보세요.
	 */
	private static void printMsg(int theCount) {
		// 입력받는 Scanner 객체를 딱 한번만 사용하도록 설계했어요..
		// 같은 기능을 하는데, 객체를 계속 만드는 것은 자원 낭비입니다.
		Scanner sc = new Scanner(System.in);
		int counter = theCount;
		int theScore = 0;

		Outer: while (true) {
			switch (counter) {
			case 0:
				System.out.println("국어 점수를 입력 하세요 : ");
				theScore = sc.nextInt();
				// 올바른 점수 영역인지를 확인 하는 메서드 호출..
				if (checkScore(theScore)) {
					// 배열에 점수를 담도록 메서드 호출..
					// counter 는 과목을 구분하는 index 로, theScore 는 점수
					addScore(counter, theScore);
					// 다음 과목 입력 받기 위해 counter 증가
					counter++;
				} else {
					System.out.println("점수 범위가 틀립니다!!(0 ~ 100)");
					continue;
				}
				break;

			case 1:
				System.out.println("영어 점수를 입력 하세요 : ");
				theScore = sc.nextInt();
				// 올바른 점수 영역인지를 확인 하는 메서드 호출..
				if (checkScore(theScore)) {
					// 배열에 점수를 담도록 메서드 호출..
					// counter 는 과목을 구분하는 index 로, theScore 는 점수
					addScore(counter, theScore);
					// 다음 과목 입력 받기 위해 counter 증가
					counter++;
				} else {
					System.out.println("점수 범위가 틀립니다!!(0 ~ 100)");
					continue;
				}
				break;

			case 2:
				System.out.println("수학 점수를 입력 하세요 : ");
				theScore = sc.nextInt();
				// 올바른 점수 영역인지를 확인 하는 메서드 호출..
				if (checkScore(theScore)) {
					// 배열에 점수를 담도록 메서드 호출..
					// counter 는 과목을 구분하는 index 로, theScore 는 점수
					addScore(counter, theScore);
					// 다음 과목 입력 받기 위해 counter 증가
					counter++;
					addScore(counter, 0);
				} else {
					System.out.println("점수 범위가 틀립니다!!(0 ~ 100)");
					continue;
				}
				break;

			default:
				break Outer;
			}
		}

	}

	/*
	 * 입력된 점수를 점수 배열에, 점수별 학점을 학점 배열에 넣는 기능을 하는 메서드입니다. 보통 여러분이 여기에 배열을 생성하고 값을 넣게
	 * 되는데, 그렇게 하면 메서드가 호출시마다 배열이 새로 생성이 되기 때문에 값을 유지 하기 어렵고, 문제가 발생됩니다.
	 */
	private static void addScore(int index, int theScore) {
		int total = 0;// 총점을 담을 변수..

		// 각 배열에 점수 넣어줌..
		// 0,1,2 까지는 과목 점수..3은 총점 index..
		if (index < 3) {
			scoreArrays[index] = theScore;
			if (theScore >= 90) {
				if (theScore <= 94) {
					// 과목별 학점에 값 넣어줌..
					grade[index] = "A-";
				} else if (theScore >= 96) {
					grade[index] = "A+";
				} else {
					grade[index] = "A";
				}
			} else if (theScore >= 80 && theScore < 90) {
				if (theScore <= 84) {
					grade[index] = "B-";
				} else if (theScore >= 86) {
					grade[index] = "B+";
				} else {
					grade[index] = "B";
				}
			} else if (theScore >= 70 && theScore < 80) {
				if (theScore <= 74) {
					grade[index] = "C-";
				} else if (theScore >= 76) {
					grade[index] = "C+";
				} else {
					grade[index] = "C";
				}
			} else {
				grade[index] = "F";
			}
		} else {
			// index 가 3인 경우는 모든 점수의 입력이 끝남..따라서 총점 영역에 값 누적.
			for (int i = 0; i < scoreArrays.length - 1; i++) {
				scoreArrays[scoreArrays.length - 1] += scoreArrays[i];
			}
			total = scoreArrays[grade.length];

			// 모든 점수와, 평점에 대한 설계가 위에서 끝났으니 이젠 출력 Go!!
			System.out.print("당신의 점수 결과 --> ");
			for (int i = 0; i < grade.length; i++) {
				if (i == 0) {
					System.out.print("국어:" + scoreArrays[i] + "(" + grade[i] + ")");
				} else if (i == 1) {
					System.out.print(" 영어:" + scoreArrays[i] + "(" + grade[i] + ")");
				} else if (i == 2) {
					System.out.print(" 수학:" + scoreArrays[i] + "(" + grade[i] + ")");
				}
			}
		}
	}

	// 입력된 점수의 Validation check..
	private static boolean checkScore(int theScore) {
		boolean result = false;
		if (theScore >= 0 && theScore <= 100)
			return !result;
		return result;
	}

}
