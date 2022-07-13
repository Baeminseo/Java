package day4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩 if 구문.. 필요에 따라 if,else if,else 구문내에 다시 조건을 정의 시킬 수 있다.
		// 그 형식을 보자
		
		int score = 95;
		String grade = "";//문자열의 기본값 초기화.
		if(score >= 90) {
			grade = "A";
			//이번엔 +.- 여부를 결정 짓는다. 98점 이상이면 +. 94 이하면 -
			if(score >= 98) {
				grade += "+";			
			}else if (score < 94) {
				grade += "-";
			}
			
		}

	}

}
