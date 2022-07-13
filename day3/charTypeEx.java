package day3;

public class charTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char는 정수 타입이지만 음수를 표현할 수 없는 2byte이다.
		//정수 연산을 위해 사용되는게 절대 아닌 오로지 문자를 표현하기 위함이다.
		//자바는 유니코드 문자셋을 기본으로 채택하여 다국어를 지원하고, 유니코드 문자셋은 0 ~65,000(대략)의 코드르르 표현한다.

		char a = 1;
		int s = a;
		
		char b= 'b';// 모든 char 의 문자값을 초기화 할시엔 반드시 ''사이에 값을 넣어야한다.
		s = b;
		System.out.println((char)(s+1));
		//char의 값으로는 유니코드 값을 직접 넣을 수 있다.. 반드시 '\u0000' 형태로 넣어야한다.	
		char uni = '\uff33';
		System.out.println(uni);
		
		//boolean 타입은 참, 거짓을 표현하기 위한 타입니다. 메모리 신경 쓸 필요없다. 논리 연산 (if) 시 사용된다

		
		boolean t = true;
		boolean f = false;
	
	}

}
