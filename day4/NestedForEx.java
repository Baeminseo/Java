package day4;

public class NestedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단을 출력해 봅시다.

		int sum = 0;
		// 단 값의 Outer
		Outer: for (int i = 2; i <= 9; i++) {//자바에서는 for 구문에 이름을 명명할 수 있다. 형식은 이름 :, 이후 조건에 따라 continue,break 에서 호출할 수 있다. 
			// 1~9까지의 곱해지는 Inner 정의
			Inner : for (int j = 1; j <= 9; j++) {
				// 2 *1 = 2...9*9=81
				sum = i * j;
				if (sum % 2 != 0) // 결과값이 홀수인 경우만 출력 조건문
					//continue; // 하위의 실행문은 수행하지 않고 가장 가까운 for 의 조건으로 넘어간다.
					break Outer;// 위 조건이 만족되면 가장 가까운 루프를 탈출한다.
				System.out.println(i + "*" + j + "=" + sum);

			}//Inner End
		}//Outer End

	}
}
