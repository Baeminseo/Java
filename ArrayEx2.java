import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx2 {

	static ArrayList<Person> name = new ArrayList<>();

	// 1�� ������ �̸� �߰�, 2���� ������ ��� �̸� ���
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�̸��� �߰��Ϸ��� 1����, �̸��� ����Ϸ��� 2����, �̸��� �����Ϸ��� 3���� �����ּ���.");
			String choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("�߰��� ��� �̸��� �����ּ���.");
				name.add(sc.next());
				System.out.println("�̸��� �߰��Ǿ����ϴ�.");
				System.out.println("�߰��� �̸��� "+name.get(name.size()-1)+"�Դϴ�.");
//			continue;
			} else if (choice.equals("2")) {
				System.out.println("��� ��� �̸��� ����մϴ�.");
				System.out.println(name);
//			continue;
			} else if(choice.equals("3")){
				System.out.println("������ ��� �̸��� �Է��ϼ���.");
				String deleteName = sc.next();
				for(int i = 0; i < name.size();i++) {
					if(name.get(i).equals(deleteName)) {
						System.out.println("�̸� ����");
						name.remove(i);
						break;
					}else if(!(name.get(i).equals(deleteName))){
//						System.out.println("�̸��� �����ϴ�.");
						continue;
					}else {
						System.out.println("�ٽ� �Է�");
					}
				}
//				if(name.contains(deleteName)) {
//					System.out.println("�̸��� �����մϴ�.");
//					name.remove(deleteName);
//				}else {
//					System.out.println("�������� �ʴ� �̸��Դϴ�.");
//				}
			}else {
				System.out.println("�ùٸ� ���� �ƴմϴ�. �ٽ� �Է����ּ���.");
//			continue;
			}
		}

	}

}
