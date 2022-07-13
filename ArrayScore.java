
import java.util.Scanner;

/**
 * 
 * @author Jason(������)
 *
 */
/*
 * �迭�� �޼��带 �̿��� ���� ��� ���α׷�.. �� ������ ������ ���� �ʵ�(Field) �� ���� ���� �����̱⿡ �����߿� ���� ������
 * �ϰ�, ���� �迭�� ���� �����ϱⰡ ���� �ʾ��� �ſ���.
 * 
 * ���� ������ �迭�� �ƴ� static Field(Ŭ���� ����--��� �ʵ�� Ʋ��)�� �����ؼ� ����ϴ°� ������ ������.
 * 
 * �ش� �ڵ忡�� ���ݲ� ����� ��� ������ ���� �� �� �ֽ��ϴ�.
 * 
 * �� ������ �������� �м� �ǰ�, �ڵ� �Ǿ����ٸ� ������ ���ص��� ���ٶ�� �Ǵ� �� �� �ֽ��ϴ�.
 * 
 * ���� �ϼ���!.
 */

public class ArrayScore {

	/*
	 * ���⿡ ���� �Ǵ� ���� �Ǵ� �ʵ���� static or member �� �ϳ��� �νĵ˴ϴ�. member �� ���� ������ �����߰�,
	 * static �� ���� Ÿ�Կ� static ���� ����Ȱ��� ���մϴ�. �� �������� ������ �ƴ� ������ ������ ���� �˴ϴ�.
	 */
	// 3���� �������� ���� �迭 4�� ����.. ������ int �̴ϱ�!!
	static int scoreArrays[] = new int[4];
	// ����� ������ ���� �迭 ����..��ü ������ �ƴ� ����� �������� �� ��������..
	// ��ü ������ �������� �ѹ� ��������(�����ؼ�..)
	static String grade[] = new String[scoreArrays.length - 1];

	public static void main(String[] args) {
		// main �� ���α׷� ���۸� �ϰ�, ù ������ �Է� �޵��� ������ ǥ��(��ȣ)�� int index
		// �� �Ķ���ͷ� �Ѱ���..��� ���Ǵ����� �ش� �޼��� �м��غ�����.^^
		printMsg(0);
	}

	/*
	 * ����ڿ��� ���� �Է��� �����ϰ�, ������ ��ȿ��(Validation) �� �����ϴ� �޼��带 ȣ�� �ϰ�, ��ȿ�ϴٸ� �迭�� ������ �ִ�
	 * �޼��带 ȣ���ϵ��� ���� �߾��. ���� �Է¶� ���� ��µǴ� ������ Ʋ���� �ϱ⿡ counter ������ �̿� ���¸� ������� ������,
	 * �м��غ�����.
	 */
	private static void printMsg(int theCount) {
		// �Է¹޴� Scanner ��ü�� �� �ѹ��� ����ϵ��� �����߾��..
		// ���� ����� �ϴµ�, ��ü�� ��� ����� ���� �ڿ� �����Դϴ�.
		Scanner sc = new Scanner(System.in);
		int counter = theCount;
		int theScore = 0;

		Outer: while (true) {
			switch (counter) {
			case 0:
				System.out.println("���� ������ �Է� �ϼ��� : ");
				theScore = sc.nextInt();
				// �ùٸ� ���� ���������� Ȯ�� �ϴ� �޼��� ȣ��..
				if (checkScore(theScore)) {
					// �迭�� ������ �㵵�� �޼��� ȣ��..
					// counter �� ������ �����ϴ� index ��, theScore �� ����
					addScore(counter, theScore);
					// ���� ���� �Է� �ޱ� ���� counter ����
					counter++;
				} else {
					System.out.println("���� ������ Ʋ���ϴ�!!(0 ~ 100)");
					continue;
				}
				break;

			case 1:
				System.out.println("���� ������ �Է� �ϼ��� : ");
				theScore = sc.nextInt();
				// �ùٸ� ���� ���������� Ȯ�� �ϴ� �޼��� ȣ��..
				if (checkScore(theScore)) {
					// �迭�� ������ �㵵�� �޼��� ȣ��..
					// counter �� ������ �����ϴ� index ��, theScore �� ����
					addScore(counter, theScore);
					// ���� ���� �Է� �ޱ� ���� counter ����
					counter++;
				} else {
					System.out.println("���� ������ Ʋ���ϴ�!!(0 ~ 100)");
					continue;
				}
				break;

			case 2:
				System.out.println("���� ������ �Է� �ϼ��� : ");
				theScore = sc.nextInt();
				// �ùٸ� ���� ���������� Ȯ�� �ϴ� �޼��� ȣ��..
				if (checkScore(theScore)) {
					// �迭�� ������ �㵵�� �޼��� ȣ��..
					// counter �� ������ �����ϴ� index ��, theScore �� ����
					addScore(counter, theScore);
					// ���� ���� �Է� �ޱ� ���� counter ����
					counter++;
					addScore(counter, 0);
				} else {
					System.out.println("���� ������ Ʋ���ϴ�!!(0 ~ 100)");
					continue;
				}
				break;

			default:
				break Outer;
			}
		}

	}

	/*
	 * �Էµ� ������ ���� �迭��, ������ ������ ���� �迭�� �ִ� ����� �ϴ� �޼����Դϴ�. ���� �������� ���⿡ �迭�� �����ϰ� ���� �ְ�
	 * �Ǵµ�, �׷��� �ϸ� �޼��尡 ȣ��ø��� �迭�� ���� ������ �Ǳ� ������ ���� ���� �ϱ� ��ư�, ������ �߻��˴ϴ�.
	 */
	private static void addScore(int index, int theScore) {
		int total = 0;// ������ ���� ����..

		// �� �迭�� ���� �־���..
		// 0,1,2 ������ ���� ����..3�� ���� index..
		if (index < 3) {
			scoreArrays[index] = theScore;
			if (theScore >= 90) {
				if (theScore <= 94) {
					// ���� ������ �� �־���..
					grade[index] = "A-";
				} else if (theScore >= 96) {
					grade[index] = "A+";
				} else {
					grade[index] = "A";
				}
			} else if (theScore >= 80 && theScore < 90) {
				if (theScore <= 84) {
					grade[index] = "B-";
				} else if (theScore >= 86) {
					grade[index] = "B+";
				} else {
					grade[index] = "B";
				}
			} else if (theScore >= 70 && theScore < 80) {
				if (theScore <= 74) {
					grade[index] = "C-";
				} else if (theScore >= 76) {
					grade[index] = "C+";
				} else {
					grade[index] = "C";
				}
			} else {
				grade[index] = "F";
			}
		} else {
			// index �� 3�� ���� ��� ������ �Է��� ����..���� ���� ������ �� ����.
			for (int i = 0; i < scoreArrays.length - 1; i++) {
				scoreArrays[scoreArrays.length - 1] += scoreArrays[i];
			}
			total = scoreArrays[grade.length];

			// ��� ������, ������ ���� ���谡 ������ �������� ���� ��� Go!!
			System.out.print("����� ���� ��� --> ");
			for (int i = 0; i < grade.length; i++) {
				if (i == 0) {
					System.out.print("����:" + scoreArrays[i] + "(" + grade[i] + ")");
				} else if (i == 1) {
					System.out.print(" ����:" + scoreArrays[i] + "(" + grade[i] + ")");
				} else if (i == 2) {
					System.out.print(" ����:" + scoreArrays[i] + "(" + grade[i] + ")");
				}
			}
		}
	}

	// �Էµ� ������ Validation check..
	private static boolean checkScore(int theScore) {
		boolean result = false;
		if (theScore >= 0 && theScore <= 100)
			return !result;
		return result;
	}

}
