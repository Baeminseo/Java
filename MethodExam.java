import java.util.Scanner;

public class MethodExam {// Ŭ���� Body

	public static void main(String[] args) {// �޼��� body
		// TODO Auto-generated method stub
		// java method : ����� �Լ� ����� ����. �ʿ��� ���� �Ǵ� ����� �̸� ���� (Define)�س���, �ʿ�� ���� ȣ��(call) �ؼ� ����ϴ� ���� ���Ѵ�.
		// �ڹ��� �޼��忡�� �� ���Ѿ� �� ��Ģ�� ��� �ִµ�, ������ ����..(���ؾȵǸ� �ܿ��)
		/*1. �޼���� �ݵ�� �̸�(name)�� ������ �Ѵ�. ������ ������ ����.
		 * 2. �޼��� �̸� ���� ������ �ݵ�� �޼����� ������ ǥ���� ()�� �־��ش�.
		 * 3. ��ȣ ������ �ʿ�(����)�� ���� �Ķ����(�Ű�����)�� �ְų� ���� �� �ִ�.
		 * 4. �޼��� �� �������� �ݵ�� �޼����� ���� Ÿ���� ��� �Ǿ�� �Ѵ�. P or R type
		 * 5. ���� ����(return)�� ���� ��쿣 void ��� Ű���带 ����ؼ� ������ ���� �ؾ��Ѵ�.
		 * 6. ���� Ÿ�� �������� Ű���� (public, static, abstract)���� ������ ���� ����� �� �ִ�. (���߿� ���)
		 */
		
		printMsg();
		
		
	}
    //�޼����� ����ϰ� �Է� �޴� �޼��� ����
	//main �޼��尡 static �̹Ƿ� ȣ���ϱ� ���ؼ� static ������ �ؾ���.. ������ ���߿�
    static void printMsg(){
    	System.out.println("������ �Է��ϼ���(0~100) : ");
    	getKorScore();
    }
	private static void getKorScore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		
		//�ùٸ� ���� ���������� �����ϴ� �޼��带 ȣ���غ���.		
		boolean ok = checkScore(kor);
		if(ok) {
			System.out.println("�ùٸ� �����Դϴ�.");
			return;//��������� �޼��带 ������ Ű����.. ������ �޼��� Body ������ �������� �ʴ´�.
		}else {
			System.out.println("���� ������ Ʋ���ϴ�.");
		}
		System.out.println("�̰� getKorScore �޼��� ����");
	}
	static boolean checkScore(int kor){
		boolean ok = false;
		
		if(kor < 100 && kor > 0) {
			ok = !ok;
		}
		return ok;
	}
}
