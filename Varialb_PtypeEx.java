
public class Varialb_PtypeEx {
	public static void main(String[] argS){
		System.out.println(10);//4byte int �޸� ���� �� �� ���� �����
		byte b = 1;//1byte �޸� ���� �� �� ������
		byte b2 = -128;
		short s = 330;
		int i = 10000;
		long lo = 100000L;// Long�� �������� long Ÿ������ �� �� �ֵ��� ���� �빮�� L�� �־��ִ°� ����
		
		
		int result = (int)(i + lo); //�ɽ��� �Ǵ� long Ÿ������ ���� �ؾ���.
		
		System.out.println(Integer.toBinaryString(b2));
		
		//������ (casting)����
		
		byte be = 1;
		int in = 1;
		
		//���θ��. ����Ÿ���� ū Ÿ�Կ� ���� = ��������
		in = be;
		//�ɽ���..ū Ÿ���� ���� Ÿ�Կ� ���� �ݵ�� �ɽ����� ���ľ��ϰ�, ���� Bit�� �߷�����
		be = (byte)in;//�ɽ��� ����
		System.out.println(be);
		
		//�ڷ����� Default Ÿ���� �����ڿ� ������ ��쿣 �������� ������ Default Ÿ������ ��� ������ ����ǰ�
		//���� Default ���� ū Ÿ�԰� Default�� ������ ������ ū Ÿ������ ��ȯ�� �� ����ȴ�.
		//���� ������ �ɽ����� �ʿ��ϴ�.

     }

}