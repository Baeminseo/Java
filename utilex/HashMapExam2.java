package utilex;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {
/*
 * �� ������ MAP type �� map �޼��带 �̿��Ͽ� collection ���� �����ϴ� �����Դϴ�.
 * collection�� Member �� �ƴ� Map �� �ʿ信 ���� 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer>map= new HashMap<String, Integer>();
		
		map.put("�赵��", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("���ȣ", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("���ϴ�", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("��μ�", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("���ؼ�", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("���λ�", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("��ä��", Integer.valueOf((int)(Math.random()*100)+1));
		map.put("���翵", Integer.valueOf((int)(Math.random()*100)+1));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();

		while(it.hasNext()) {
			//Map.Entry Interface �� Map ��ü���� Collection ���� ������ ��ü���� K,V �� �������� (�����ϴ�)����� ���� �ִ�.
			Entry e = (Entry)it.next();
			System.out.println("�̸�: "+ e.getKey() + " ���� : "+ e.getValue());
		}
		
		
		//Ű�� Set ���� ���Ͻ�Ű��.
		set = map.keySet();
		System.out.println("�л��� ��� : "+ set);
		
		//�л����� ������ (value)�� Collection Ÿ������ ����
		Collection<Integer> values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (Integer)it.next();
			total += i;
		}
		
		System.out.println("���� : "+ total);
		System.out.println("��� : " + (float)total/set.size());
		System.out.println("�ְ��� : "+Collections.max(values));
		System.out.println("������ : "+Collections.min(values));
	}

}
