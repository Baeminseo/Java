package utilex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {
/*
 * 이 예제는 MAP type 을 map 메서드를 이용하여 collection 으로 변경하는 예제입니다.
 * collection의 Member 가 아닌 Map 이 필요에 따라 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map= new HashMap<String, Integer>();
		
		map.put("김도경", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("김민호", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("유하늘", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("배민서", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("유준선", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("정민상", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("임채연", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("김재영", Integer.valueOf((int)(Math.random()*100)+1));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			//Map.Entry Interface 는 Map 객체에서 Collection 으로 변형된 객체들의 K,V 를 가져오는 (유지하는)기능을 갖고 있다.
			Entry e = (Entry)it.next();
			System.out.println("이름: "+ e.getKey() + " 점수 : "+ e.getValue());
		}
		
		
		//키만 Set 으로 리턴시키다.
		set = map.keySet();
		System.out.println("학생들 명단 : "+ set);
		
		//학생들의 점수만 (value)만 Collection 타입으로 리턴
		Collection<Integer> values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (Integer)it.next();
			total += i;
		}
		
		System.out.println("총점 : "+ total);
		System.out.println("평균 : " + (float)total/set.size());
		System.out.println("최고점 : "+Collections.max(values));
		System.out.println("최저점 : "+Collections.min(values));
	}

}
