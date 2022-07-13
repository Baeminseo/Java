package utilex;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date 객체를 생성하여 시스템의 현재 시간값을 생성한다.
		Date now = new Date();
		System.out.println(now.toString());
		
		//getTime() 을 이용하여 1970년 이후부터 현재까지의 흐른 시간값을 Millisec 으로 확인한다.
		long passedTime = now.getTime();
		System.out.println(passedTime);
		
		now.setTime(passedTime - (24*60*60*1000));
		System.out.println(now);
		
		
	}

}
