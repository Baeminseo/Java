package day4;

public class IFEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if ~ else if (���ǹ�) else if(���ǹ�) else..(else�� �׻� �ɼ��̴�. �����ص� �׸� �Ƴ൵ �׸�.. ������ ���� �Ѵ�.)
		//������ ����մϴ�.. 90���̻��� A , 80�� �̻��� B, ������ C
		
		int score = 90;
		char grade; //���� ����
		if(score >= 90) {
			//������  A ���� �����̹Ƿ� ���� ������.
			grade = 'A';
		}
		else if(score < 90 && score >= 80) {
			grade = 'B';
		}
		else {
			grade = 'c';
			
		}
		System.out.println("����� ������ "+ grade + "�Դϴ�.");
	}
	
}
