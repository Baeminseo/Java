import java.util.Scanner;

public class DowhileEx {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//do{}while(조건식); > 무조건 한번은 실행후 조건 결과에 따라서 지속 여부를 결정하는 루프문이다.
		//주의 해야할 것은 조건식 뒤에 ;이 꼭 들어가야한다.
		//do내에서 선언된 변수는 지역이므로 while 에서 인식을 못한다.
		boolean isCorrect = true;
		do {
			System.out.println("실행문...");
			if(isCorrect == true) {
				isCorrect = !isCorrect;
			}
		}while(isCorrect);
	
	}
   
}







