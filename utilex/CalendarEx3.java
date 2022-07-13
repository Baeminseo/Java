package utilex;

import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * Calendar 객체를 이용하여 입력된 년, 월에 해당하는 달력을 출력해본다.
 * 
 */
public class CalendarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("년도와 월을 입력하세요.");
		
		if(input != null) {
			//년과 월 분리
			int year = Integer.parseInt(input.substring(0, 4));
			int month = Integer.parseInt(input.substring(4, input.length()));
			
			//날짜 객체 2개가 필요합니다.
			//사용자가 요청한 월의 마지막 날을 알아서 그 다음달에서 연산을 하는 작업을 위해 객체 두개가 필요함.
			Calendar sDay = Calendar.getInstance();
			Calendar eDay = Calendar.getInstance();
			
			//월을 세팅합니다. 0 ~11 이므로 +1
			sDay.set(year, month-1,1);//요청한 월의 시작
			eDay.set(year, month,1);//요청한 월의 마지막날 확인
			
			//마지막 날 확인을 위해 연산 작업
			eDay.add(Calendar.DATE,-1);//위의 주석을 확인해보세요. 31번 라인
			
			//요일별로 시작 날짜가 틀리기 때문에 첫번째 요일을 확인해야합니다.
			int start_Day_of_week = 0, end_day = 0;
			
			start_Day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
			end_day= eDay.get(Calendar.DATE);
			
			System.out.println(" SU MO TU WE TH FR SA ");
			// 해당 월의 1일이 어느 요일인지에 따라 공백을 출력한다.
			for(int i = 1; i<start_Day_of_week; i++) {
				System.out.print("   ");//3칸 띄우세요.
			}
			//날짜를 출력시키는 데 7일마다 주가 바꾸기ㅣ 때문에 %연산을 통해 주 바뀜 처리를 한다.
			for(int i = 1, n=start_Day_of_week; i<=end_day; i++,n++) {
				System.out.print((i<10)? "  "+i : " "+i);
				if(n%7 == 0)
					System.out.println();
			}
		}
	}

}
