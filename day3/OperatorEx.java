package day3;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10;
		int b = ++a;
		int c = b--;
		
		
		// 선행 연산자 : ++b. --c
		//후행 연산자 : k++, y-- 모든 연산자 중 제일 우선순위가 낮음+
				
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(4<<3);
		
		//비교 연산자.. 결과는 항상  true or false 를 리턴.. 조건절에 사용됨.
		
		boolean result = 3> 2;
		System.out.println(result);
		int aa = 3, bb = 2;
		if(aa >= bb) {
			System.out.println(aa + "값이 더 크거나 같습니다.");
		}
		
		
		// ==Ptype 에 사용되는 경우엔 값이 같은지를 묻고. Rtype 에 사용될 시에는 같은 객체 인지를 묻는 연산자
		// 같으면 true 아니면 false 리턴
		// != 같지 않은지를 묻는다. 나머진 위와 같음
		// != 같지 않은지를 묻는다.. 같지 않을 경우 true 아니면 false 리턴 나머진 위와 같음
		
		int myAge = 30;
		int limit = 35;
		
		boolean result1 =(limit - myAge) >= 5 && myAge > 30;
		System.out.println("&& 연산 결과 : " + result1);
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("|| 연산결과 : " + result2);
		
		int genCode = 2;
	    char gender = genCode % 2 == 0 ? 'F' :'M' ;
	    System.out.println("당신의 성별은 = " + gender );
		
		//배정대입 연산자 : += 예를 들면 좌측의 변수에 결과값을 먼저 대입을 하라는 의미임
		int kk = 10;
		kk += 1;
		System.out.println(kk);
		
	}

}
