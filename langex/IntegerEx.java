package langex;

public class IntegerEx {

	public static void main(String[] args) {
		
		//�ִ� �ּҰ�
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String dig = "10";
		//���ڿ��� ������ int ������ �����ϴ� �޼���. parseInt
		//���� : �����̳�, �ٸ� ���ڿ��� ���ų� �ϸ� ���� ���ߵ�
		int i = Integer.parseInt(dig) + 10;
		System.out.println(i);
	}

}
