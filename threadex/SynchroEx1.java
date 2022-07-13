package threadex;
/*
 * ���� ��ü�� �����Ͽ� �� �����尡 ���� ��ü�� �ٽ� ������ ����ʵ�(�ν��Ͻ� ����)�� �����ϴ� �����Դϴ�.
 * ����� ������ü�� ���������� ����ȭ�� �����Դϴ�.
 */

class SynchroEx1_1 implements Runnable{
	int inVar = 0;

	@Override
	public void run() {
		int localvar = 0;
		
		String name = Thread.currentThread().getName();
		
		while(inVar < 6) {
			inVar++;
			System.out.println(name + " ���� ���� : "+localvar);
			System.out.println(name + " ��� ���� : "+ inVar);
			System.out.println();
		}
		
	}
	
}
public class SynchroEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new SynchroEx1_1();
		
		Thread t1 = new Thread(r);//���� ��ü�� ������Ų��.
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
