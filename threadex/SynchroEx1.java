package threadex;
/*
 * 공유 객체를 참조하여 두 쓰래드가 공유 객체의 핵심 정보인 멤버필드(인스턴스 변수)를 접근하는 예제입니다.
 * 참고로 공유객체의 지역변수는 동기화의 비대상입니다.
 */

class SynchroEx1_1 implements Runnable{
	int inVar = 0;

	@Override
	public void run() {
		int localvar = 0;
		
		String name = Thread.currentThread().getName();
		
		while(inVar < 6) {
			inVar++;
			System.out.println(name + " 지역 변수 : "+localvar);
			System.out.println(name + " 멤버 변수 : "+ inVar);
			System.out.println();
		}
		
	}
	
}
public class SynchroEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new SynchroEx1_1();
		
		Thread t1 = new Thread(r);//같은 객체를 공유시킨다.
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
