package threadex;

import javax.swing.JOptionPane;

/*
 * �� ������ �̱۾����带 ���� �߻��Ǵ� �������� Ȯ���մϴ�.
 */
public class ThreadEx4 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� ��������");
		System.out.println("�Է��� ���� : "+ input + "�Դϴ�.");
		
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
