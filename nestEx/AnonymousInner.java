package nestEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * �̸��� ���� Ŭ�����̴�.
 * �Ϲ������� �������̽���, �߻� Ŭ�������� Ư�� �޼��带 ��ȸ ���� �̿�Ǹ�, Ȱ�� ������ �����θ� �ɵ�..
 */
interface TestInner{
	int data = 10000;
	void printData();
	void yourMethod();
}
public class AnonymousInner {

	public void test() {
		//�޼��� ������ ���� Ŭ���� ���ǽ� �������̵� �޼��� ȣ�� ���.. ; ���� �޼��� ȣ��
		new TestInner() {
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println(data);
			}

			@Override
			public void yourMethod() {
				// TODO Auto-generated method stub
				
			}
		}.printData();//���� ���� �������� ȣ�� �ؼ� �������̵� �� �޼��� ȣ�� �Ѵ�.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInner ai = new AnonymousInner();
		ai.test();
		
		//�Ʒ��� GUI ���� �Ϲ������� ���� ������ �����̴�.
		Frame f = new Frame("����������");
		Button button = new Button("��ư�Դϴ�");
		f.setSize(300, 300);
		f.add(button);
		f.setVisible(true);
		
		//��ư�� Ŭ���� �߻��ϴ� Action �� ������ Interface ��ü�� �ӽ� ������ �ش� �޼��常 ������ �� ��������.
		//�Ʒ��� �޼��� �Ķ���Ϳ� �͸�Ŭ������ ���� �ϴ� ���. ; �� ��������..
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
