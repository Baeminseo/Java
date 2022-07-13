package threadex;

import javax.swing.JOptionPane;

/*
 * 이 예제는 싱글쓰래드를 사용시 발생되는 문제점을 확인합니다.
 */
public class ThreadEx4 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("아무 값이나 넣으세요");
		System.out.println("입력한 값은 : "+ input + "입니다.");
		
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
