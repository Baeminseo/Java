package utilex;

import java.util.Calendar;

public class CalenderEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//특정 날짜값으로 세팅
		date1.set(2021, 3, 27);//작년 오늘로 세팅함
		
		System.out.println(toString(date1)+date1.get(Calendar.DAY_OF_WEEK));
		System.out.println(toString(date2)+date2.get(Calendar.DAY_OF_WEEK));
		
	}
	
	//캘린더 객체의 속성값 리턴 메서드 정의
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + " 년 " + (date.get(Calendar.MONTH)+1)+"월" + (date.get(Calendar.DATE))+"일";
		}
}
