package langex;

public class MathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.2;
		double b = 1.5;
		double c = 1.9;
		
		//소수점 이하 버림
		System.out.println(Math.floor(a));
		System.out.println(Math.floor(c));
		
		//반올림
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		
		//Math.random() 0.000000000000001 ~ 0.99999999999(0초과 1 미만의 랜덤한 double 리턴)
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));//0부터 9까지 나옴
		
		//집가고싶어요 정말로
	}

}
