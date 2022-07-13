package nestEx;
/*
 * ���� Ŭ������ �ν��Ͻ�(���) Ŭ������ �ܺ� Ŭ������ ��� ��ġ�� ����, �ܺ� Ŭ������ �ν��Ͻ� ���ó�� Ȱ�� ����..�ַ� �ܺ� Ŭ������ ������ �����ؼ� �۾��� ���� ������ ����..
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
		//����!! �Ʒ�ó�� ��� Inner  ������ static �� ���� �� �� ����..But ����� �������� ���� static �� ��밡���Ѵ�.
		//�翬�� static �޼��� ���� �Ұ�..!
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
		//Inner Ŭ������ ��ü�� �����ÿ� Outer.Inner Ÿ������ �����ؾ���...����Ұ�.�Ʒ��� �ѹ��ڵ�..
		Inner1Ex.Inner1_1 inner = new Inner1Ex().new Inner1_1();
		//�Ʒ��� �ٸ� ���� ����..
		Inner1Ex outer = new Inner1Ex();
		Inner1Ex.Inner1_1 inner2 = outer.new Inner1_1();
		inner2.printDat();
	}

}
