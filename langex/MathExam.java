package langex;

public class MathExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.2;
		double b = 1.5;
		double c = 1.9;
		
		//�Ҽ��� ���� ����
		System.out.println(Math.floor(a));
		System.out.println(Math.floor(c));
		
		//�ݿø�
		System.out.println(Math.round(a));
		System.out.println(Math.round(b));
		
		//Math.random() 0.000000000000001 ~ 0.99999999999(0�ʰ� 1 �̸��� ������ double ����)
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));//0���� 9���� ����
		
		//������;�� ������
	}

}
