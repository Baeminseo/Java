package day4;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ø if ����.. �ʿ信 ���� if,else if,else �������� �ٽ� ������ ���� ��ų �� �ִ�.
		// �� ������ ����
		
		int score = 95;
		String grade = "";//���ڿ��� �⺻�� �ʱ�ȭ.
		if(score >= 90) {
			grade = "A";
			//�̹��� +.- ���θ� ���� ���´�. 98�� �̻��̸� +. 94 ���ϸ� -
			if(score >= 98) {
				grade += "+";			
			}else if (score < 94) {
				grade += "-";
			}
			
		}

	}

}
