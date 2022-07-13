package threadex;
/*
 * 이 예제는 계좌 클래스를 공유 객체로 만들어서 두 쓰래드가 각각 인출을 하도록 만들겁니다. 이때 잔액이 음수가 나오도록 만들어봅니다.
 */

//계좌 클래스 정의;
class Account{
	//잔액 필드
	int balance = 1000;
	
	//인출 메서드 정의 .. 금액만큼 잔액에서 인출(-) 해갑니다.
	public synchronized void withdraw(int money) {
		//막 인출을 시켜주면 안되고, 항상 잔액 내에서 인출을 해줘야합니다.
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
			//wait() 메서드를 이용해서 잔액이 만약 부족하면 쓰래드가 점유하고 있는 객체의 lock 을 풀고 waiting pool 에 들어가면서 제어권을 
			// 다른 쓰래드에 양보하게 적용한다.
			wait();
		}catch (InterruptedException e) {
			// TODO: handle exception
		}
		balance -= money;
	}
}
	//여기엔 입금을 하는 메서드도 정의해본다.
	//이 메서드는 notify()를 통해 잔고를 증가 시킨후 waiting 풀에 대기중인 출금 객체를 깨우면서 작업을 개시하도록 알려준다.
	public synchronized void deposit(int money) {
		balance += money;
		notify();
	}
}
class SychroEx2_1 implements Runnable{
//이 쓰래드는 Account 객체를 공유하면서 인출 작업을 하게 합니다.
	Account account = new Account();
	
	@Override
	public void run() {
		while(account.balance > 0) {
			int money = (int)(Math.random()*3 +1)*100;
			account.withdraw(money);
			System.out.println("현재 잔액 :" +account.balance);
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
