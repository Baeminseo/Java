package day4;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
		//while (조건식){// 이 루프는 기본적으로 무한 루프를 실행시 조건에 따라 탈출하는 로직에 많이 사용됨.
		     //조건식이 true 시 수행되는 명령문..
		     //break, continue 사용가능함.
		//}
		boolean flag = true;
		while(flag) {
			System.out.println("이러다 다 죽어");
		}
		int first = 0;	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("첫 수를 입력하세요(100이하): ");
			first = sc.nextInt();
			
			if(first > 100) {
				System.out.println("100점을 넘었네요 다시 입력하세요");
				continue;
			}
			System.out.println("당신의 점수는 "+ first);
		    break;

			
		}
		
	}

}
