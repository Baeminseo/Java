package day3;

public class OperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 10;
		int b = ++a;
		int c = b--;
		
		
		// ���� ������ : ++b. --c
		//���� ������ : k++, y-- ��� ������ �� ���� �켱������ ����+
				
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(4<<3);
		
		//�� ������.. ����� �׻�  true or false �� ����.. �������� ����.
		
		boolean result = 3> 2;
		System.out.println(result);
		int aa = 3, bb = 2;
		if(aa >= bb) {
			System.out.println(aa + "���� �� ũ�ų� �����ϴ�.");
		}
		
		
		// ==Ptype �� ���Ǵ� ��쿣 ���� �������� ����. Rtype �� ���� �ÿ��� ���� ��ü ������ ���� ������
		// ������ true �ƴϸ� false ����
		// != ���� �������� ���´�. ������ ���� ����
		// != ���� �������� ���´�.. ���� ���� ��� true �ƴϸ� false ���� ������ ���� ����
		
		int myAge = 30;
		int limit = 35;
		
		boolean result1 =(limit - myAge) >= 5 && myAge > 30;
		System.out.println("&& ���� ��� : " + result1);
		
		int n1 = 10;
		int n2 = 20;
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("|| ������ : " + result2);
		
		int genCode = 2;
	    char gender = genCode % 2 == 0 ? 'F' :'M' ;
	    System.out.println("����� ������ = " + gender );
		
		//�������� ������ : += ���� ��� ������ ������ ������� ���� ������ �϶�� �ǹ���
		int kk = 10;
		kk += 1;
		System.out.println(kk);
		
	}

}
