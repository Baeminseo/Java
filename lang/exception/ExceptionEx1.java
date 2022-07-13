package lang.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/*
		 * 자바의 예외 : 자바에서는 실행시(Runtime) 발생되는 모든 에러 상황들을 예외로 정의합니다.
		 * 당연히 클래스와 인터페이스로 정의되어있고, 최상위 클래스는 Throwable 입니다.
		 * Throwable 하위에는 Exception 과 Error 클래스가 있는데, JYM 에 관련된 에러는 Error 클래스 하위에 정의되어있고
		 * 나머지는 Exception 의 하위에 정의되어있습니다.
		 * 이중 Error 의 하위는 프로그래머가 핸들링 할 수 없는 시스템 에러이기 때문에 무시합니다.
		 * 우린 Exception 의 개념과 핸들링하는 방법을 배우게 됩니다.
		 */
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);

	}

}
