package day4;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		
		//while (���ǽ�){// �� ������ �⺻������ ���� ������ ����� ���ǿ� ���� Ż���ϴ� ������ ���� ����.
		     //���ǽ��� true �� ����Ǵ� ��ɹ�..
		     //break, continue ��밡����.
		//}
		boolean flag = true;
		while(flag) {
			System.out.println("�̷��� �� �׾�");
		}
		int first = 0;	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ù ���� �Է��ϼ���(100����): ");
			first = sc.nextInt();
			
			if(first > 100) {
				System.out.println("100���� �Ѿ��׿� �ٽ� �Է��ϼ���");
				continue;
			}
			System.out.println("����� ������ "+ first);
		    break;

			
		}
		
	}

}
