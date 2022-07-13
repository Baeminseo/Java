package nestEx;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 이름이 없는 클래스이다.
 * 일반적으로 인터페이스나, 추상 클래스등의 특정 메서드를 일회 사용시 이용되며, 활용 정도만 익혀두면 될듯..
 */
interface TestInner{
	int data = 10000;
	void printData();
	void yourMethod();
}
public class AnonymousInner {

	public void test() {
		//메서드 내에서 직접 클래스 정의시 오버라이드 메서드 호출 방법.. ; 없이 메서드 호출
		new TestInner() {
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println(data);
			}

			@Override
			public void yourMethod() {
				// TODO Auto-generated method stub
				
			}
		}.printData();//위와 같은 형식으로 호출 해서 오버라이드 된 메서드 호출 한다.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousInner ai = new AnonymousInner();
		ai.test();
		
		//아래는 GUI 에서 일반적으로 쓰는 형태의 예제이다.
		Frame f = new Frame("프레임제목");
		Button button = new Button("버튼입니다");
		f.setSize(300, 300);
		f.add(button);
		f.setVisible(true);
		
		//버튼을 클릭시 발생하는 Action 을 정의한 Interface 객체를 임시 생성후 해당 메서드만 재정의 후 버려진다.
		//아래는 메서드 파라미터에 익명클래스를 정의 하는 방법. ; 을 주의하자..
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

}
