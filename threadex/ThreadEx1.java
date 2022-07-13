package threadex;
//Tread 를 상속받은 Thread 클래스 정의
class ThreadEx1_1 extends Thread{
	/*
	 * 해당 쓰래드가 수행해야 할 작업을 run 에 정의한다.
	 */
	public void run() {
		for(int i = 0; i < 5; i++) {
			//Thread 클래스의 메서드를 이용해서 쓰래드 이름을 리턴받는다.. 따로 이름을 지정하지 않으면 번호가 지정되어진다.
			System.out.println(getName());
		}
	}
}

/*
 * runnable interface 를 구현한 쓰래드 클래스 정의
 */
class ThreadEx1_2 implements Runnable{

	//Runnable 엔 run() 하나만 존재하기 때문에 오버라이드 해주면 끝
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 5; i++) {
			//Runnable 을 상속했기 때문에 쓰래드 클래스의 메서드 사용 불가하다. 따라서 Thread 클래스의 static 메서드를 이용, 현재 실행중인 쓰래드 객체를 리턴받아 이름을 출력해본다.
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}
public class ThreadEx1 {

	public static void main(String[] args) {
		//쓰래드 수행 Start() 를 호출하여 수행한다.. 단 한 쓰래드에는 단 한번의 Start()만 허용함. 재활용시 예외 발생함
		ThreadEx1_1 thread1 = new ThreadEx1_1();
		//두번째 쓰래드에 탑재될 Runnable 객체 생성
		Runnable r = new ThreadEx1_2();
		//Thread 객체에 r을 탑재하여 실행시킨다.
		Thread thread2 = new Thread(r);
		
		//작업시작
		thread1.start();
		thread2.start();
		
		//아래는 다중 쓰래드가 서로 섞이는 걸 보여주기 위해 main 쓰래드가 할 작업도 정의함
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

}
