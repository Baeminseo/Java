package utilex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("1");
		set.add(1);
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("hi");
		
		System.out.println(set);
		
		
		set.clear();
		for(int i = 0; set.size() < 6; i++) {
			set.add((int)(Math.random()*45)+1);
		}
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
	}

}
