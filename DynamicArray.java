
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� �迭 : inner �迭�� ũ�� (length)�� �������� �����ؼ� ���� ����.. �˾Ƹ� �α�
		System.out.println(args.length);
		//outer �� ũ�⸸ ���� �� inner�� �������� ����Ѵ�.
		char[] stars[] = new char[10][];
		
		for(int i = 0; i<stars.length;i++) {
			stars[i] = new char [i+1];
			for(int j = 0; j < stars[i].length; j++) {
				//inner �迭�� ���� �־��ְ� ����� �����ش�.
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}

	}

}
