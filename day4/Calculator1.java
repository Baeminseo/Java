package day4;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ù ���� �Է� : ");
		int fir = sc.nextInt();
		
		System.out.println("����� �ι�° ���� �Է� : ");
		int sec = sc.nextInt();
		
		System.out.println("������ �Է� : ");//�ݵ�� 4Ģ ������ �� �ϳ��� �Է��ϼ���.
		char op = sc.next().charAt(0);
		
		//������� ����� �� �ֵ��� ���ǹ��� �����ϼ���.
		//��� : ? �̷�������
		
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
		
		System.out.println("����� "+ fir + op + sec + "=" + result);

	}
 
}
