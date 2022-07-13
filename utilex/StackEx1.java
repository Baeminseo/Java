package utilex;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();	
	
	public static void main(String[] args) {
		// 시작은 여기서 하고 브라우저에서 하나씩 foward, back 을 실행해보고 아래와 비교해본다.
		goURL("http://www.daum.net");
		/*
		goURL("http://www.naver.com");
		goURL("http://www.nate.com");
		
		printStatus();
		
		goBack();
		System.out.println("뒤로가기 버튼 누른후");
		printStatus();
		*/
	}
	
	public static void printStatus() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 : " + back.peek() + " 입니다.");
		System.out.println();
	}
	public static void goURL(String url) {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("explorer.exe "+url);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	public static void forForward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}

}
