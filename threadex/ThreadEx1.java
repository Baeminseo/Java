package threadex;
//Tread �� ��ӹ��� Thread Ŭ���� ����
class ThreadEx1_1 extends Thread{
	/*
	 * �ش� �����尡 �����ؾ� �� �۾��� run �� �����Ѵ�.
	 */
	public void run() {
		for(int i = 0; i < 5; i++) {
			//Thread Ŭ������ �޼��带 �̿��ؼ� ������ �̸��� ���Ϲ޴´�.. ���� �̸��� �������� ������ ��ȣ�� �����Ǿ�����.
			System.out.println(getName());
		}
	}
}

/*
 * runnable interface �� ������ ������ Ŭ���� ����
 */
class ThreadEx1_2 implements Runnable{

	//Runnable �� run() �ϳ��� �����ϱ� ������ �������̵� ���ָ� ��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			//Runnable �� ����߱� ������ ������ Ŭ������ �޼��� ��� �Ұ��ϴ�. ���� Thread Ŭ������ static �޼��带 �̿�, ���� �������� ������ ��ü�� ���Ϲ޾� �̸��� ����غ���.
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class ThreadEx1 {

	public static void main(String[] args) {
		//������ ���� Start() �� ȣ���Ͽ� �����Ѵ�.. �� �� �����忡�� �� �ѹ��� Start()�� �����. ��Ȱ��� ���� �߻���
		ThreadEx1_1 thread1 = new ThreadEx1_1();
		//�ι�° �����忡 ž��� Runnable ��ü ����
		Runnable r = new ThreadEx1_2();
		//Thread ��ü�� r�� ž���Ͽ� �����Ų��.
		Thread thread2 = new Thread(r);
		
		//�۾�����
		thread1.start();
		thread2.start();
		
		//�Ʒ��� ���� �����尡 ���� ���̴� �� �����ֱ� ���� main �����尡 �� �۾��� ������
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
