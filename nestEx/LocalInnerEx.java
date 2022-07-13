package nestEx;
/*
 * 지역 Inner 클래스 : 외부 클래스의 메서드나 초기화블럭 안에 선언, 선언된 영역 내부에서만 사용가능함..
 */
public class LocalInnerEx {
	
	int k = 1;
	
	class InstanceInner{
		int a = 100;
	}
	static class StaticInner{
		int b = 200;
		static int c = 300;
	}
	void yourMethod(int gg) {
		int localVar = 100;
		
		class LocalInner{
			int d = 400;

			InstanceInner in = new InstanceInner();
			
			int k = gg + 10 + localVar;
			
			void doSome() {
				int r = k + d + StaticInner.c + localVar + gg;
				System.out.println(r);
			}
		}
		new LocalInner().doSome();
	}
	public static void main(String[] args) {
		LocalInnerEx outer = new LocalInnerEx();
		LocalInnerEx.InstanceInner in1  = outer.new InstanceInner();
		
		System.out.println(in1.a);
		outer.yourMethod(10);

	}

}
