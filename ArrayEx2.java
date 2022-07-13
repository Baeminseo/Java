import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx2 {

	static ArrayList<Person> name = new ArrayList<>();

	// 1번 누르면 이름 추가, 2번을 누르면 모든 이름 출력
	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("이름을 추가하려면 1번을, 이름을 출력하려면 2번을, 이름을 삭제하려면 3번을 눌러주세요.");
			String choice = sc.next();

			if (choice.equals("1")) {
				System.out.println("추가할 사람 이름을 적어주세요.");
				name.add(sc.next());
				System.out.println("이름이 추가되었습니다.");
				System.out.println("추가된 이름은 "+name.get(name.size()-1)+"입니다.");
//			continue;
			} else if (choice.equals("2")) {
				System.out.println("모든 사람 이름을 출력합니다.");
				System.out.println(name);
//			continue;
			} else if(choice.equals("3")){
				System.out.println("삭제할 사람 이름을 입력하세요.");
				String deleteName = sc.next();
				for(int i = 0; i < name.size();i++) {
					if(name.get(i).equals(deleteName)) {
						System.out.println("이름 존재");
						name.remove(i);
						break;
					}else if(!(name.get(i).equals(deleteName))){
//						System.out.println("이름이 없습니다.");
						continue;
					}else {
						System.out.println("다시 입력");
					}
				}
//				if(name.contains(deleteName)) {
//					System.out.println("이름이 존재합니다.");
//					name.remove(deleteName);
//				}else {
//					System.out.println("존재하지 않는 이름입니다.");
//				}
			}else {
				System.out.println("올바른 값이 아닙니다. 다시 입력해주세요.");
//			continue;
			}
		}

	}

}
