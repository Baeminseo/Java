package utilex;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator : Collection Ÿ���� ��ü���� ��ȯ�ϸ鼭 ���� Element�� ���Ͻ�Ű�� ��ü
 * Enumeration �� ���� ��ü�� ���� ����� ������ �ִ�.
 * ������ �ڵ��..
 */
public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> list1= new ArrayList<String>();
		
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");

		//Iterator ��ü�� �����ϴ� �޼��� ȣ��
		Iterator<String> it = list1.iterator();
		//while ���� �̿�, hasNext()�� ȣ���Ͽ� Element �� ����, next() �� �̿��Ͽ� return �޴´�.
		//����� Generic �� ���� ������ object �� ���ϵȴ�.
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
