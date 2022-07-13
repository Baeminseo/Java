package threadex;
/*
 * 이 예제는 싱글쓰래드와 멀티쓰래드의 수행 속도를 측정해봅니다.
 */
public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.println("-");
		}
		System.out.println("소요시간 1 : " + (System.currentTimeMillis()-startTime));
		
		for(int i=0; i<300; i++) {
			System.out.println("|");
		}
		System.out.println("소요시간 2 : " + (System.currentTimeMillis()-startTime));
		
		
		
		
		
	}

}
