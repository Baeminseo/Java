package utilex;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * HashSet �� Set �� ��ӹ��� ��ǥ Ŭ����..
 * ���� ����, �ߺ� ��� �ʴ´�. add, addAll �� �̿��ؼ� Elemnet �߰��ϴµ� �ߺ� �߻��� false ������.
 * 
 * ���� ������ ���� �ϰ� ������쿣 LinkedHashSet �� �̿��Ѵ�.
 */
public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet ����.
		 */
		Set set = new HashSet();
		set.add("1");
		set.add(1);
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("3");
		set.add("4");
		set.add("4");
		set.add("5");
		set.add("5");
		set.add(3);
		set.add("hi");

		Object[] objArr = set.toArray();

		System.out.println(Arrays.toString(objArr));
		
		set = new LinkedHashSet();
		set.add("1");
		set.add(1);
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("3");
		set.add("4");
		set.add("4");
		set.add("5");
		set.add("5");
		set.add(3);
		set.add("hi");

		objArr = set.toArray();
		System.out.println(Arrays.toString(objArr));
		
		set = new HashSet();
		
		for(int i = 0; set.size() < 6; i++) {
			set.add((int)(Math.random() * 45) + 1);
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
