package threadex;

import javax.swing.JOptionPane;

/*
 * ��Ƽ �����带 �̿��ؼ� �������� �۾��� �����ϵ��� �����մϴ�.
 */
class ThreadEx5_1 extends Thread{
	public void run() {
		System.out.println("10�� �ȿ� �ƹ����̳� �Է���");
		String input = JOptionPane.showInputDialog("�� �Է�");
		ThreadEx5.inputCheak = true;
		System.out.println("�Է��� �� --> " + input);
	}
}
//ī��Ʈ�� �����ϴ� ������ ����
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
		System.out.println("10�ʵ��� �ƹ����� �Է����� �ʾƼ� ���α׷� ������");
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
