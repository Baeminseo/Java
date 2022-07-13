package day4;

import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 점수를 입력 받는 프로그램을 작성해보세요.
		// 실행이 되면 점수를 입력하세요~ 라고 띄우고,
		// 점수가 0~100 사이가 아니면 0~100 사이만 입력하세요. 라고 띄우고 계속 입력을 받도록 하세요.
		// 점수가 올바르게 입력되면 당신의 국어 점수는 입력받은 점수입니다. 라고 출력시키세요.
		// className 은 Score1

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("점수를 입력하세요~ ");
			
			int Score1 = sc.nextInt();

			if (Score1 < 0 || Score1 > 100) {
				System.out.println("0~100 사이만 입력하세요.");
				continue;
			}
			System.out.println("당신의 국어 점수는 " + Score1 + "입니다.");
			break;
		}
	}

}
