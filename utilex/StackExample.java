package utilex;

import java.util.Stack;

/*
 * stack �ڷ� ������ �̿��ؼ� ���������� Back, forward ����� �����ϴ� �����Դϴ�.
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
// ���� ���¸� �����ִ� �޼��� ����
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ���� : "+ back.peek()+"�Դϴ�.");
	} 
	//locator â�� URL �� typing �ϴ� ����� ����
	public static void goURL(String url) {
		//���� ���������� �����ϴ� ��Ÿ�� ��ü�� �޼��� ����ؼ� �����غ��Կ�.
		Runtime runtime = Runtime.getRuntime();
		
		try {
			runtime.exec("explorer.exe "+url);
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		//url �� ���϶����� back stack �� ������
		back.push(url);
		if(!forward.empty()) {
			forward.clear();
		}
	}
	//�������� ���(forward)�� ������ �޼���
	public static void forward() {
		if(!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	//�ڷ� (back)�� ����� ������ �޼���
	public static void back() {
		if(!back.empty()) {
			forward.push(back.pop());
		}
	} 
}
