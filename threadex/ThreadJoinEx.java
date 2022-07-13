package threadex;
class ThreadJoin1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
	}
}
class ThreadJoin2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("|");
		}
	}
}
public class ThreadJoinEx {

	static long startTime=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoin1 t1 = new ThreadJoin1();
		ThreadJoin2 t2 = new ThreadJoin2();
		
		t1.start();
		startTime = System.currentTimeMillis();
		
		try {
			t1.join();
			//t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		t2.start();
		//System.out.println("소요시간 : " +(System.currentTimeMillis()-startTime));
	}

}
