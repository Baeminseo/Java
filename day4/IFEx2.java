package day4;

public class IFEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if ~ else if (조건문) else if(조건문) else..(else는 항상 옵션이다. 구현해도 그만 아녀도 그만.. 로직에 따라서 한다.)
		//학점을 출력합니다.. 90점이상은 A , 80점 이상은 B, 나머진 C
		
		int score = 90;
		char grade; //평점 변수
		if(score >= 90) {
			//점수가  A 학점 범위이므로 평점 세팅함.
			grade = 'A';
		}
		else if(score < 90 && score >= 80) {
			grade = 'B';
		}
		else {
			grade = 'c';
			
		}
		System.out.println("당신의 학점은 "+ grade + "입니다.");
	}
	
}
