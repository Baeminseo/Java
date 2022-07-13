package utilex;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList 는 중복 허용, Index 를 기준으로 데이터 관리(배열과 같음), add(index) 를 기준으로 추가 삭제, append 가능하다. 
 */
public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(3);//중복허용.
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));//index 1~4 전까지의 SubList 
		print(list1, list2);
		
		ArrayList list3 = new ArrayList();
		list3.add("문재인");
		list3.add("이명박");
		list3.add("박근혜");
		list3.add("노무현");
		list3.add("Iron Man");
		list3.add("Super Man");
		list3.add("Captain America");
		list3.add("Hulk");
		
		//Collections 클래스의 정렬 메서드 이용 정렬.
		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);
		print(list1, list3);
		
		//위의 sort() 로 인해 Sorting 된 상태의 리스트 출력된다.
		for(int i = 0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "AA");
		list2.add(3, "A");
		print(list1, list2);
		
		//list1 에서 list2 의 겹치는 부분 제거
		System.out.println(list1.retainAll(list2));
		
		print(list1, list2);
		
		
		//아래의 삭제는 0 부터 삭제를 시킬시 삭제되는 list 의 index 가 변경된다.즉 삭제되는 index를 다음 Element가 차지하기 때문에 올바른 결과를 얻기 힘들다.
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
