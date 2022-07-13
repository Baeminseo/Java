package threadex;
/*
 * 멀티쓰래드의 수행속도 측정
 */
class ThreadEx3_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}
		System.out.println("소요시간 1 : " + (System.currentTimeMillis()-ThreadEx3.startTime));
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
		System.out.println("소요시간 2 : " + (System.currentTimeMillis()-ThreadEx3.startTime));
	}

}
