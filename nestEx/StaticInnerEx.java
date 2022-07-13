package nestEx;
/*
 * �ܺ� Ŭ������ ����ʵ� ������ġ�� ����Ǹ�, �ܺ� Ŭ������ static ���ó�� �ٷ����..�ַ� �ܺ� Ŭ������ static ���, Ư�� static �޼��忡�� ���� �������� ���� �ȴ�.
 * ���� ���� Ŭ�������� static �ʵ�(����ƴ�)�� �����ؾ� �� ��쿣 Inner �� static ���� ����Ǿ����� �Ѵ�.
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
		
		//static Inner �̱⿡ ���� ����..
		public static void printA() {
			//Outer �� Non-Static �̱⿡ ���� �Ұ�..
			//System.out.println("a = " + a);
			//static ���� static ȣ�� OK
			System.out.println(c);
			System.out.println(getC());
			//��..�̰� �� ���װ�..���� Ŭ���� ����� ����ʵ� ���� �ȵ�..
			//System.out.println(d);
			System.out.println(e);//OK
			System.out.println(f);//OK
			
			//pintB();//�翬�� �Ұ�����?? 
		}
		//staic Inner ���� ��� �޼��� ���ǽ� ȣ�� ���� ���� Ȯ��..�ܺ� notstatic �� ��� �Ұ�.
		public void printB() {
			//�Ұ�..inner�� static�̴�...
			//System.out.println(a);
			//System.out.println(b);
			System.out.println(c);//OK
			//System.out.println(getA());//NO
			System.out.println(getC());//OK
			
			printA();//OK..�翬����??
		}
	}

	public static void main(String[] args) {
		
		StaticInnerEx.StaticInner.printA();//��ó�� ���� ȣ�⵵ �ǰ�..But member �޼���� ȣ�� �Ұ���..
		//�ٸ� ������..
		StaticInnerEx.StaticInner sInner = new StaticInner();
		//�Ʒ��� print() �� ȣ���� ���������� ��ó�� ���� ȣ���ϴ� ����� �ǹٸ���..
		sInner.printA();
		sInner.printB();
	}

}
