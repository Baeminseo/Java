package day4;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//�ַܼκ��� ������� �Է� ���� �޴� ����(��ü)�� �����ؼ� �Է��� �޾ƺ��ϴ�.
		//�ݵ�� import.util.* �� package ���� �Ʒ��� �������� Ȯ���ϼ���.. ���߿� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �̸��� �Է��ϼ��� : ");
		//�Է¹��� ���� ���ڿ��� �ǵ��� �ݴϴ�. --> sc.next();
		String name = sc.next();
		
		System.out.println("�ݰ����� " + name + "��.");
		
		System.out.println("����� ���̸� �Է��ϼ��� : ");
		
		//�Էµ� ������ ���� �ǵ����ִ� API --> sc.nextInt();
		int age = sc.nextInt();
		System.out.println("���⿣ ����� "+ (age+1) + "���� �ǽô� ����...");
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����� ���̸� �Է��ϼ��� : ");
		
		int age = sc.nextInt();
		if (age >= 30) {
			System.out.println("��Ǹ�ŭ ��̳׿�");
		}
		else {
			System.out.println("�� �弼��.");
		}
		
	}

}
