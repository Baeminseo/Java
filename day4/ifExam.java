package day4;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//콘솔로부터 사용자의 입력 값을 받는 도구(객체)를 생성해서 입력을 받아봅니다.
		//반드시 import.util.* 이 package 구문 아래에 나오는지 확인하세요.. 나중에 배움
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요 : ");
		//입력받은 값을 문자열로 되돌려 줍니다. --> sc.next();
		String name = sc.next();
		
		System.out.println("반가워요 " + name + "님.");
		
		System.out.println("당신의 나이를 입력하세요 : ");
		
		//입력된 정수의 값을 되돌려주는 API --> sc.nextInt();
		int age = sc.nextInt();
		System.out.println("내년엔 당신은 "+ (age+1) + "세가 되시는 군요...");
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 나이를 입력하세요 : ");
		
		int age = sc.nextInt();
		if (age >= 30) {
			System.out.println("드실만큼 드셨네요");
		}
		else {
			System.out.println("더 드세요.");
		}
		
	}

}
