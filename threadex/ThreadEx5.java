package threadex;

import javax.swing.JOptionPane;

/*
 * 멀티 쓰래드를 이용해서 독립적인 작업을 구현하도록 정의합니다.
 */
class ThreadEx5_1 extends Thread{
	public void run() {
		System.out.println("10초 안에 아무값이나 입력해");
		String input = JOptionPane.showInputDialog("값 입력");
		ThreadEx5.inputCheak = true;
		System.out.println("입력한 값 --> " + input);
	}
}
//카운트를 수행하는 쓰래드 정의
class ThreadEx5_2 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			if(ThreadEx5.inputCheak)return;
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("10초동안 아무값을 입력하지 않아서 프로그램 종료함");
		System.exit(0);
	}
	
}
public class ThreadEx5 {
	
	static boolean inputCheak = false;
	public static void main(String[] args) {
		
		ThreadEx5_1 t1 = new ThreadEx5_1();
		ThreadEx5_2 t2 = new ThreadEx5_2();
		
		t1.start();
		t2.start();

	}

}
