package utilex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// 기본 정렬 적용되는 예제.
		
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) +1;
			set.add(num);
		}
		System.out.println(set);
		
		// 문자열을 저장하고 범위 검색 메서드를 통해 결과를 얻어낸다.
		TreeSet set2 = new TreeSet();
		
		String from = "b";
		String to = "f";//미포함.
		
		set2.add("abc");
		set2.add("alien");
		set2.add("bat");
		set2.add("car");
		set2.add("Car");
		set2.add("disc");
		set2.add("dancd");
		set2.add("dzzzz");
		set2.add("dZZZZ");
		set2.add("elephant");
		set2.add("elevator");
		set2.add("fan");
		set2.add("flower");
		//문자열 같은 경우 정렬 순서를 본다.
		System.out.println(set);
		System.out.println("range search : from " + from + " to " + to);
		System.out.println("result1 : " + set2.subSet(from, to));
		System.out.println("result2 : " + set2.subSet(from, to + "zzz"));
		
		//숫자의 경우 특정 값 이상, 이하를 메서드를 통해 얻어낼수 있다.
		TreeSet set3 = new TreeSet();
		
		for(int i = 0; set3.size() < 30; i++) {
			set3.add((int)(Math.random() * 100) + 1);
		}
		
		System.out.println("50 보다 작은값 : " + set3.headSet(50));
		System.out.println("50 보다 큰값 : " + set3.tailSet(50));
		
		ArrayList cc = new ArrayList();
		System.out.println(cc.addAll(set3));
		
		//Collections 를 이용한 정렬..
		Collections.sort(cc);
		System.out.println(cc);
		
		Collections.sort(cc, Collections.reverseOrder());
		System.out.println(cc);
		
		
	}

}
