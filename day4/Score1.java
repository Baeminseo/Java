package day4;

import java.util.Scanner;

public class Score1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ �Է� �޴� ���α׷��� �ۼ��غ�����.
		// ������ �Ǹ� ������ �Է��ϼ���~ ��� ����,
		// ������ 0~100 ���̰� �ƴϸ� 0~100 ���̸� �Է��ϼ���. ��� ���� ��� �Է��� �޵��� �ϼ���.
		// ������ �ùٸ��� �ԷµǸ� ����� ���� ������ �Է¹��� �����Դϴ�. ��� ��½�Ű����.
		// className �� Score1

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���~ ");
			
			int Score1 = sc.nextInt();

			if (Score1 < 0 || Score1 > 100) {
				System.out.println("0~100 ���̸� �Է��ϼ���.");
				continue;
			}
			System.out.println("����� ���� ������ " + Score1 + "�Դϴ�.");
			break;
		}
	}

}
