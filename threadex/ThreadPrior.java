package threadex;

 class ThreadPrio_1 extends Thread{
	 public void run() {
		 for(int i = 0; i < 300; i++) {
			  System.out.println("-");
			  for(int x = 0; x<100000; x++);
		 }
	 }	
 }
 class ThreadPrio_2 extends Thread{
	 public void run() {
		 for(int i = 0; i < 300; i++) {
			 System.out.println("|");
			 for(int x = 0; x<100000; x++);
		 }
	 }
 }
public class ThreadPrior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPrio_1 t1 = new ThreadPrio_1();
		ThreadPrio_2 t2 = new ThreadPrio_2();
		
		//쓰레드의 우선순위를 지정합니다.
		t1.setPriority(10);
		t2.setPriority(1);
		
		t1.start();
		t2.start();

	}
}

