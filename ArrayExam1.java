import java.util.Arrays;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		//�迭(Array) : ���� Ÿ���� ���� ���� ����� �ɶ� ������ ����ϴ� �� ����, �迭�� �̿��ؼ� �ϳ��� ���� �������� Ȱ���ϴ� �� ���ϴ�.
		//�ڹٿ����� �̶� �迭�� �̿��ؼ� �����͸� �����Ѵ�. �迭���ʹ�  ptype �� �ƴ϶� R type ���� ���еǾ����� �� ����ϵ��� �Ѵ�.
		// Rtype �� �Ӽ�(properties) , �޼���(Method)�� ������ �ִٶ�� �� ����� ��
		// �� �� �迭�� �Ӽ��� ������ �ִ�.
		
		//������ type[] ���� = new type[size];
		int score[] = new int[10]; //size �� 10�� �迭�� ������.. �⺻������ Rtype �� �����ÿ� ��� ���� �⺻���� �ڵ� �ʱ�ȭ�Ѵ�. �� ���
		String[] names;
		names = new String[3];//string �� ���ڿ� ��ü�̱⿡ �⺻���� null�� �ʱ�ȭ �Ѵ�.
		boolean[] bl = {true, false,true};//Ư�� ������ ������ ���ÿ� �ʱ�ȭ.
		
		System.out.println(score[0]);//�迭�� ���� ���ٽÿ� index ���� �־��ش�.
		System.out.println(names[0]);//�迭�� ���� ���ٽÿ� index ���� �־��ش�.
		System.out.println(bl[2]);
		
		for(int i = 0 ; i < bl.length; i++) {
			System.out.println(bl[i]);
		}
		//�迭�� ���� ��ü������ ���� �� �� �ִ� API(������ ������ �ʾƵ� �� Ȯ�� ������)
		//Arrays.toString(�迭);
		System.out.println(Arrays.toString(bl));
		


	}

}
