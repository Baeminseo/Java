package langex;

public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new ObjectExam();
		Object obj2 = new ObjectExam();
		obj2 = obj;
		System.out.println(obj.toString());
		
		if(obj.equals(obj2)) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}

	}

}
