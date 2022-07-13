package threadex;

public class DaemonThreadEx implements Runnable{

	//�ڵ� ������ ���������� Flag ����..
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DaemonThreadEx());//���� �����忡�� �ڽ� ��ü�� Daemon ȭ �Ѵ�.
		
		//t.setDaemon(true);
		t.start();
		
		
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
			//5�ʰ� ������ Daemon �� Ȱ��ȭ �ϵ��� �Ѵ�.
			if(i == 5) {
				autoSave  = true;
			}
		}
		System.out.println("���α׷� ����..");
		
	}
	//��󾲷����� ���� ����.
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(autoSave) {
				autoSave();
			}
		}
	}
	private void autoSave() {
		System.out.println("�۾������� �����....");
	}

}
