package utilex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * SimpleDateFormat 을 이용해서 날짜를 지정된 pattern 대로 출력 시킵니다.
 * 각 날짜의 의미는 letter라고 씌여진 키워드로 정의되어집니다.(메뉴얼 참고)
 */
public class SimpleDateFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		Calendar c1 = Calendar.getInstance();
		Date d1 = c1.getTime();//c1 객체의 시간정보를 Date 객체로 리턴시킵니다.
		
		String pattern = "현재 시간은 yyyy년 MM월 dd일 E요일 a h:mm:ss 입니다.";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d1));

	}

}
