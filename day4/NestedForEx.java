package day4;

public class NestedForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ����� ���ô�.

		int sum = 0;
		// �� ���� Outer
		Outer: for (int i = 2; i <= 9; i++) {//�ڹٿ����� for ������ �̸��� ����� �� �ִ�. ������ �̸� :, ���� ���ǿ� ���� continue,break ���� ȣ���� �� �ִ�. 
			// 1~9������ �������� Inner ����
			Inner : for (int j = 1; j <= 9; j++) {
				// 2 *1 = 2...9*9=81
				sum = i * j;
				if (sum % 2 != 0) // ������� Ȧ���� ��츸 ��� ���ǹ�
					//continue; // ������ ���๮�� �������� �ʰ� ���� ����� for �� �������� �Ѿ��.
					break Outer;// �� ������ �����Ǹ� ���� ����� ������ Ż���Ѵ�.
				System.out.println(i + "*" + j + "=" + sum);

			}//Inner End
		}//Outer End

	}
}
