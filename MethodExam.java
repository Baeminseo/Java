import java.util.Scanner;

public class MethodExam {// 클래스 Body

	public static void main(String[] args) {// 메서드 body
		// TODO Auto-generated method stub
		// java method : 산수의 함수 개념과 같다. 필요한 로직 또는 기능을 미리 구현 (Define)해놓고, 필요시 마다 호출(call) 해서 사용하는 것을 말한다.
		// 자바의 메서드에는 꼭 지켜야 할 규칙이 몇가지 있는데, 다음과 같다..(이해안되면 외우기)
		/*1. 메서드는 반드시 이름(name)을 가져야 한다. 변수의 명명법과 같다.
		 * 2. 메서드 이름 우측 옆에는 반드시 메서드라는 일종의 표식인 ()을 넣어준다.
		 * 3. 괄호 내에는 필요(목적)에 따라서 파라미터(매개변수)를 넣거나 안할 수 있다.
		 * 4. 메서드 명 좌측에는 반드시 메서드의 리턴 타입이 명기 되어야 한다. P or R type
		 * 5. 만약 리턴(return)이 없을 경우엔 void 라는 키워드를 사용해서 없음을 선언 해야한다.
		 * 6. 리턴 타입 이전에는 키워드 (public, static, abstract)등을 목적에 따라 사용할 수 있다. (나중에 배움)
		 */
		
		printMsg();
		
		
	}
    //메세지를 출력하고 입력 받는 메서드 정의
	//main 메서드가 static 이므로 호출하기 위해선 static 선언을 해야함.. 이유는 나중에
    static void printMsg(){
    	System.out.println("점수를 입력하세요(0~100) : ");
    	getKorScore();
    }
	private static void getKorScore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		
		//올바른 점수 범위인지를 검증하는 메서드를 호출해보자.		
		boolean ok = checkScore(kor);
		if(ok) {
			System.out.println("올바른 점수입니다.");
			return;//명시적으로 메서드를 끝내는 키워드.. 이후의 메서드 Body 구문은 실행하지 않는다.
		}else {
			System.out.println("점수 범위가 틀립니다.");
		}
		System.out.println("이건 getKorScore 메서드 구문");
	}
	static boolean checkScore(int kor){
		boolean ok = false;
		
		if(kor < 100 && kor > 0) {
			ok = !ok;
		}
		return ok;
	}
}
