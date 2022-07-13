package utilex;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList �� �ߺ� ���, Index �� �������� ������ ����(�迭�� ����), add(index) �� �������� �߰� ����, append �����ϴ�. 
 */
public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(3);//�ߺ����.
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));//index 1~4 �������� SubList 
		print(list1, list2);
		
		ArrayList list3 = new ArrayList();
		list3.add("������");
		list3.add("�̸��");
		list3.add("�ڱ���");
		list3.add("�빫��");
		list3.add("Iron Man");
		list3.add("Super Man");
		list3.add("Captain America");
		list3.add("Hulk");
		
		//Collections Ŭ������ ���� �޼��� �̿� ����.
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		print(list1, list3);
		
		//���� sort() �� ���� Sorting �� ������ ����Ʈ ��µȴ�.
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "AA");
		list2.add(3, "A");
		print(list1, list2);
		
		//list1 ���� list2 �� ��ġ�� �κ� ����
		System.out.println(list1.retainAll(list2));
		
		print(list1, list2);
		
		
		//�Ʒ��� ������ 0 ���� ������ ��ų�� �����Ǵ� list �� index �� ����ȴ�.�� �����Ǵ� index�� ���� Element�� �����ϱ� ������ �ùٸ� ����� ��� �����.
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}

}
