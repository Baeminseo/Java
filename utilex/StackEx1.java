package utilex;

import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();	
	
	public static void main(String[] args) {
		// ������ ���⼭ �ϰ� ���������� �ϳ��� foward, back �� �����غ��� �Ʒ��� ���غ���.
		goURL("http://www.daum.net");
		/*
		goURL("http://www.naver.com");
		goURL("http://www.nate.com");
		
		printStatus();
		
		goBack();
		System.out.println("�ڷΰ��� ��ư ������");
		printStatus();
		*/
	}
	
	public static void printStatus() {
		
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� : " + back.peek() + " �Դϴ�.");
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
