package nestEx;
/*
 * 외부 클래스의 멤버필드 선언위치에 선언되며, 외부 클래스의 static 멤버처럼 다루어짐..주로 외부 클래스의 static 멤버, 특히 static 메서드에서 사용될 목적으로 정의 된다.
 * 만약 내부 클래스에서 static 필드(상수아님)를 선언해야 할 경우엔 Inner 도 static 으로 선언되어져야 한다.
 */
public class StaticInnerEx {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public int getA() {
		return a;
	}
	public static int getC() {
		return c;
	}
	public static class StaticInner{
		int d = 300;
		static final int e = 400;
		static int f = 500;
		
		//static Inner 이기에 정의 가능..
		public static void printA() {
			//Outer 은 Non-Static 이기에 접근 불가..
			//System.out.println("a = " + a);
			//static 에서 static 호출 OK
			System.out.println(c);
			System.out.println(getC());
			//뭐..이건 다 알테고..같은 클래스 멤버라도 멤버필드 접근 안됨..
			//System.out.println(d);
			System.out.println(e);//OK
			System.out.println(f);//OK
			
			//pintB();//당연히 불가하죠?? 
		}
		//staic Inner 에서 멤버 메서드 정의시 호출 가능 범위 확인..외부 notstatic 은 모두 불가.
		public void printB() {
			//불가..inner가 static이니...
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(c);//OK
			//System.out.println(getA());//NO
			System.out.println(getC());//OK
			
			printA();//OK..당연하죠??
		}
	}

	public static void main(String[] args) {
		
		StaticInnerEx.StaticInner.printA();//이처럼 직접 호출도 되고..But member 메서드는 호출 불가함..
		//다른 생성식..
		StaticInnerEx.StaticInner sInner = new StaticInner();
		//아래의 print() 는 호출은 가능하지만 위처럼 직접 호출하는 방식이 옳바르다..
		sInner.printA();
		sInner.printB();
	}

}
