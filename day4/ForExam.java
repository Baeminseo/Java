package day4;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문.. for (루프 변수 ; 조건식 ; 증강식){
		    // 수행할 명령문..
		//}
		
		int sum = 0;
		//무한 루프
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("1부터 10 누적합 : "+ sum);

	}

}
