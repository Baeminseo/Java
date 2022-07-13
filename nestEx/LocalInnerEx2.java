package nestEx;

public class LocalInnerEx2 {

	int a = 100;
	
	public void innerTest(int n) {
		int b = 200;
		
		final int c = n;
		
		class Inner{
			public void getData() {
				System.out.println("int a = " + a);
				System.out.println("int b = " + b);
				System.out.println("final int c : " + c);
			}
		}
		Inner i = new Inner();
		i.getData();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerEx2 locaIn = new LocalInnerEx2();
		locaIn.innerTest(10);
	}

}
