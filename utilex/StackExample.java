package utilex;

import java.util.Stack;

/*
 * stack 자료 구조를 이용해서 웹브라우저의 Back, forward 기능을 구현하는 예제입니다.
 */
public class StackExample {

	private static Stack back = new Stack();
	private static Stack forward = new Stack();
	
	public static void main(String[] args) {
		goURL("http://www.daum.net");
		printStatus();
		goURL("http://www.naver.com");
		printStatus();
		back();
		printStatus();
		

	}
// 현재 상태를 보여주는 메서드 구현
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 : "+ back.peek()+"입니다.");
	} 
	//locator 창에 URL 을 typing 하는 기능을 구현
	public static void goURL(String url) {
		//실제 웹브라우저를 실행하는 런타임 개체의 메서드 사용해서 실행해볼게요.
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("explorer.exe "+url);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//url 이 쌓일때마다 back stack 에 누적함
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	//앞으로의 기능(forward)을 구현한 메서드
	public static void forward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	//뒤로 (back)의 기능을 구현한 메서드
	public static void back() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	} 
}
