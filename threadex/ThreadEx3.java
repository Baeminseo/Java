package threadex;
/*
 * ��Ƽ�������� ����ӵ� ����
 */
class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.println("�ҿ�ð� 1 : " + (System.currentTimeMillis()-ThreadEx3.startTime));
	}
}
public class ThreadEx3 {
	
	static long startTime= 0;
	public static void main(String[] args) {
		ThreadEx3_1 th1 = new ThreadEx3_1();
		th1.start();
		
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
		System.out.println("�ҿ�ð� 2 : " + (System.currentTimeMillis()-ThreadEx3.startTime));
	}

}