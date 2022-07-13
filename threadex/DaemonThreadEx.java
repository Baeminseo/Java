package threadex;

public class DaemonThreadEx implements Runnable{

	//자동 저장을 할지말지의 Flag 선언..
	static boolean autoSave = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new DaemonThreadEx());//메인 쓰래드에서 자신 객체를 Daemon 화 한다.
		
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
			
			//5초가 지난후 Daemon 이 활성화 하도록 한다.
			if(i == 5) {
				autoSave  = true;
			}
		}
		System.out.println("프로그램 종료..");
		
	}
	//대몬쓰래드의 내용 정의.
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
		System.out.println("작업내용이 저장됨....");
	}

}
