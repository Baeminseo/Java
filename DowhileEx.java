import java.util.Scanner;

public class DowhileEx {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//do{}while(���ǽ�); > ������ �ѹ��� ������ ���� ����� ���� ���� ���θ� �����ϴ� �������̴�.
		//���� �ؾ��� ���� ���ǽ� �ڿ� ;�� �� �����Ѵ�.
		//do������ ����� ������ �����̹Ƿ� while ���� �ν��� ���Ѵ�.
		boolean isCorrect = true;
		do {
			System.out.println("���๮...");
			if(isCorrect == true) {
				isCorrect = !isCorrect;
			}
		}while(isCorrect);
	
	}
   
}







