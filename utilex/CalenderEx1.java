package utilex;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//Ư�� ��¥������ ����
		date1.set(2021, 3, 27);//�۳� ���÷� ������
		
		System.out.println(toString(date1)+date1.get(Calendar.DAY_OF_WEEK));
		System.out.println(toString(date2)+date2.get(Calendar.DAY_OF_WEEK));
		
	}
	
	//Ķ���� ��ü�� �Ӽ��� ���� �޼��� ����
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + " �� " + (date.get(Calendar.MONTH)+1)+"��" + (date.get(Calendar.DATE))+"��";
		}
}
