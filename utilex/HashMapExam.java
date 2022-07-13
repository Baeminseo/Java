package utilex;

import java.util.HashMap;

import javax.swing.JOptionPane;

/*
 * Map 타입의 대표 클래스인 HashMap을 이용한 Map 의 기본기 익히기
 */
public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gereric 을 지정하지 않으면 기본으로 object, Object 로 들어감
		HashMap map = new HashMap();
		map.put("abc","1234");
		map.put("def","3456");
		map.put("abc","5678");
		
		while(true) {
		String id = JOptionPane.showInputDialog("ID 를 입력하세요");
		String passwd = JOptionPane.showInputDialog("Password 를 입력하세요");
		//contains()메서드를 이용해서 ID 와 Pass 값을 검증해본다.
		if (!map.containsKey(id)) {
			System.out.println("입력한 Id 는 존재하지 않음... 다시 입력하세요.");
		}else {
			if(!(map.get(id)).equals(passwd)) {
				System.out.println("비번이 맞지 않음 다시 입력하세요.");
			}else {
				System.out.println("ID 의 비번이 일치합니다.");
				break;
			}
		}
	}
	}
}
