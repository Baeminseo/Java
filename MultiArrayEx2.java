
public class MultiArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multi[] = {{1,2,3},{4,5,6}}; //������ �ʱ�ȭ�� ���߹迭 ����
		
		int[][] multi2 = null; //�迭����
		multi2 = new int[3][2]; // 3�� 2�� ¥�� �迭 ���� (���� default �ʱ�ȭ ��)
		
		multi2 = new int[][] {{10,20},{30,40}}; //���� ���� Ư�������� �ʱ�ȭ ����
		
		//�� 3�� ������ ������ �����μ���
		
		//for ���� �̿��ؼ� ���� �迭�� ��ȸ �Ͽ� �� ����..
		for(int i = 0; i<multi.length; i++) {//outer �� length ��ŭ ����
			//inner �迭�� ���� �����Ѵ�. �� outer �� �̸������� �����Ѵ�.
			for(int j = 0; j<multi[i].length;j++) {
				// ���� Outer[]inner[] �ȿ� �����ϹǷ�..
				System.out.println(multi[i][j]);//��� �� ���� Ŀ�� ��ġ��Ų��. �� �� �ٿ� �� ����ϴ� �޼��� print()
				
			}
			System.out.println(); //��� �� ������ �����Ѵ�. ���� �������� Ŀ�� ��ġ �̵� �� print �� ������ �����μ���.
		}

	}

}
