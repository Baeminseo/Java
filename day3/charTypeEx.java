package day3;

public class charTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char�� ���� Ÿ�������� ������ ǥ���� �� ���� 2byte�̴�.
		//���� ������ ���� ���Ǵ°� ���� �ƴ� ������ ���ڸ� ǥ���ϱ� �����̴�.
		//�ڹٴ� �����ڵ� ���ڼ��� �⺻���� ä���Ͽ� �ٱ�� �����ϰ�, �����ڵ� ���ڼ��� 0 ~65,000(�뷫)�� �ڵ帣�� ǥ���Ѵ�.

		char a = 1;
		int s = a;
		
		char b= 'b';// ��� char �� ���ڰ��� �ʱ�ȭ �ҽÿ� �ݵ�� ''���̿� ���� �־���Ѵ�.
		s = b;
		System.out.println((char)(s+1));
		//char�� �����δ� �����ڵ� ���� ���� ���� �� �ִ�.. �ݵ�� '\u0000' ���·� �־���Ѵ�.	
		char uni = '\uff33';
		System.out.println(uni);
		
		//boolean Ÿ���� ��, ������ ǥ���ϱ� ���� Ÿ�Դϴ�. �޸� �Ű� �� �ʿ����. �� ���� (if) �� ���ȴ�

		
		boolean t = true;
		boolean f = false;
	
	}

}
