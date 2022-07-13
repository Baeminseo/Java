package utilex;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * HashSet 은 Set 을 상속받은 대표 클래스..
 * 순서 없고, 중복 허용 않는다. add, addAll 을 이용해서 Elemnet 추가하는데 중복 발생시 false 리턴함.
 * 
 * 만약 순서를 유지 하고 싶은경우엔 LinkedHashSet 을 이용한다.
 */
public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet 예제.
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
