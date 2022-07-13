package langex;

public class ObjectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new ObjectExam();
		Object obj2 = new ObjectExam();
		obj2 = obj;
		System.out.println(obj.toString());
		
		if(obj.equals(obj2)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}

	}

}
