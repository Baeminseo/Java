package threadex;
/*
 * �� ������ ���� Ŭ������ ���� ��ü�� ���� �� �����尡 ���� ������ �ϵ��� ����̴ϴ�. �̶� �ܾ��� ������ �������� �����ϴ�.
 */

//���� Ŭ���� ����;
class Account{
	//�ܾ� �ʵ�
	int balance = 1000;
	
	//���� �޼��� ���� .. �ݾ׸�ŭ �ܾ׿��� ����(-) �ذ��ϴ�.
	public synchronized void withdraw(int money) {
		//�� ������ �����ָ� �ȵǰ�, �׻� �ܾ� ������ ������ ������մϴ�.
		/*
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			balance -= money;
			}
			*/
		
	while(balance >= money){
		try {
			//wait() �޼��带 �̿��ؼ� �ܾ��� ���� �����ϸ� �����尡 �����ϰ� �ִ� ��ü�� lock �� Ǯ�� waiting pool �� ���鼭 ������� 
			// �ٸ� �����忡 �纸�ϰ� �����Ѵ�.
			wait();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		balance -= money;
	}
}
	//���⿣ �Ա��� �ϴ� �޼��嵵 �����غ���.
	//�� �޼���� notify()�� ���� �ܰ� ���� ��Ų�� waiting Ǯ�� ������� ��� ��ü�� ����鼭 �۾��� �����ϵ��� �˷��ش�.
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}
}
class SychroEx2_1 implements Runnable{
//�� ������� Account ��ü�� �����ϸ鼭 ���� �۾��� �ϰ� �մϴ�.
	Account account = new Account();
	
	@Override
	public void run() {
		while(account.balance > 0) {
			int money = (int)(Math.random()*3 +1)*100;
			account.withdraw(money);
			System.out.println("���� �ܾ� :" +account.balance);
		}
	}
}
public class SynchroEx2 {

	public static void main(String[] args) {
		Runnable r = new SychroEx2_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();

	}

}
