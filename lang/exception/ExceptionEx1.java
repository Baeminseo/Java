package lang.exception;

public class ExceptionEx1 {

	public static void main(String[] args) {
		/*
		 * �ڹ��� ���� : �ڹٿ����� �����(Runtime) �߻��Ǵ� ��� ���� ��Ȳ���� ���ܷ� �����մϴ�.
		 * �翬�� Ŭ������ �������̽��� ���ǵǾ��ְ�, �ֻ��� Ŭ������ Throwable �Դϴ�.
		 * Throwable �������� Exception �� Error Ŭ������ �ִµ�, JYM �� ���õ� ������ Error Ŭ���� ������ ���ǵǾ��ְ�
		 * �������� Exception �� ������ ���ǵǾ��ֽ��ϴ�.
		 * ���� Error �� ������ ���α׷��Ӱ� �ڵ鸵 �� �� ���� �ý��� �����̱� ������ �����մϴ�.
		 * �츰 Exception �� ����� �ڵ鸵�ϴ� ����� ���� �˴ϴ�.
		 */
		
		int a = 10;
		int b = 0;
		System.out.println(a/b);

	}

}
