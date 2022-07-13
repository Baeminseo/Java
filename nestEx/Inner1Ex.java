package nestEx;
/*
 * 내부 클래스중 인스턴스(멤버) 클래스는 외부 클래스의 멤버 위치로 선언, 외부 클래스의 인스턴스 멤버처럼 활용 가능..주로 외부 클래스의 멤버들과 관련해서 작업에 사용될 목적에 선언..
 */
public class Inner1Ex {
	
	int a = 10;
	private int b = 100;
	static int c = 300;
	
	
	private int getA() {
		return a;
	}
	class Inner1_1{
		int d = 400;
		//주의!! 아래처럼 멤버 Inner  에서는 static 을 선언 할 수 없다..But 상수의 목적으로 사용될 static 은 허용가능한다.
		//당연히 static 메서드 정의 불가..!
		//static int e = 500;
		static final int e = 500;
		
		public void printDat() {
			System.out.println("int a = " + a);
			System.out.println(getA());
			System.out.println("int b = " + b);
			System.out.println("int c = " + c);
			System.out.println("int d = " + d);
			System.out.println("int e = " + e);
		}
		
	}

	public static void main(String[] args) {
		//Inner 클래스의 객체를 생성시엔 Outer.Inner 타입으로 생성해야함...기억할것.아래는 한방코드..
		Inner1Ex.Inner1_1 inner = new Inner1Ex().new Inner1_1();
		//아래는 다른 생성 형식..
		Inner1Ex outer = new Inner1Ex();
		Inner1Ex.Inner1_1 inner2 = outer.new Inner1_1();
		inner2.printDat();
	}

}
