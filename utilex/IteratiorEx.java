package utilex;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Iterator는 반복 순환자 역활을 하며 index 를 가지고 있지 않다. 단지 Element 만 추출 하는 능력을 가지고 있다.
 * ListIterator 등이 있다.
 */
public class IteratiorEx {

	public static void main(String[] args) {
		ArrayList list1= new ArrayList();
		list1.add("가");
		list1.add("나");
		list1.add("다");
		list1.add("라");
		
		Iterator it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator lit = list1.listIterator();
		//순방향 
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		//이전객체 하나 get..
		//System.out.println(lit.previous());
		//역방향.
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex());
			System.out.println(lit.previous());
		}
		
		
		
	}

}
