package utilex;

import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date ��ü�� �����Ͽ� �ý����� ���� �ð����� �����Ѵ�.
		Date now = new Date();
		System.out.println(now.toString());
		
		//getTime() �� �̿��Ͽ� 1970�� ���ĺ��� ��������� �帥 �ð����� Millisec ���� Ȯ���Ѵ�.
		long passedTime = now.getTime();
		System.out.println(passedTime);
		
		now.setTime(passedTime - (24*60*60*1000));
		System.out.println(now);
		
		
	}

}
