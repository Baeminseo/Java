package utilex;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

/*
 * Iterator�� �ݺ� ��ȯ�� ��Ȱ�� �ϸ� index �� ������ ���� �ʴ�. ���� Element �� ���� �ϴ� �ɷ��� ������ �ִ�.
 * ListIterator ���� �ִ�.
 */
public class IteratiorEx {

	public static void main(String[] args) {
		ArrayList list1= new ArrayList();
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		
		Iterator it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ListIterator lit = list1.listIterator();
		//������ 
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		//������ü �ϳ� get..
		//System.out.println(lit.previous());
		//������.
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex());
			System.out.println(lit.previous());
		}
		
		
		
	}

}
