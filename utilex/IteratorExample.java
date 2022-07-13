package utilex;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator : Collection 타입의 객체들을 순환하면서 내부 Element를 리턴시키는 객체
 * Enumeration 의 후위 객체로 같은 기능을 가지고 있다.
 * 나머진 코드로..
 */
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("가");
		list1.add("나");
		list1.add("다");
		list1.add("라");

		//Iterator 객체로 리턴하는 메서드 호출
		Iterator<String> it = list1.iterator();
		//while 문을 이용, hasNext()를 호출하여 Element 를 접근, next() 를 이용하여 return 받는다.
		//참고로 Generic 을 하지 않으면 object 로 리턴된다.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
