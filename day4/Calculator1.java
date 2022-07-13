package day4;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 첫 값을 입력 : ");
		int fir = sc.nextInt();
		
		System.out.println("계산할 두번째 값을 입력 : ");
		int sec = sc.nextInt();
		
		System.out.println("연산자 입력 : ");//반드시 4칙 연산자 중 하나만 입력하세요.
		char op = sc.next().charAt(0);
		
		//결과값을 출력할 수 있도록 조건문을 정의하세요.
		//결과 : ? 이런식으로
		
		int result = 0;
		if (op == '+') {
			result = fir + sec;
		}
		else if(op == '-') {
			result = fir - sec;
		}
		else if(op == '*') {
			result = fir * sec;
		}
		else if(op == '/') {
			result = fir / sec;
		}
		
		System.out.println("결과는 "+ fir + op + sec + "=" + result);

	}
 
}
