package utilex;

import java.util.HashMap;

import javax.swing.JOptionPane;

/*
 * Map Ÿ���� ��ǥ Ŭ������ HashMap�� �̿��� Map �� �⺻�� ������
 */
public class HashMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//gereric �� �������� ������ �⺻���� object, Object �� ��
		HashMap map = new HashMap();
		map.put("abc","1234");
		map.put("def","3456");
		map.put("abc","5678");
		
		while(true) {
		String id = JOptionPane.showInputDialog("ID �� �Է��ϼ���");
		String passwd = JOptionPane.showInputDialog("Password �� �Է��ϼ���");
		//contains()�޼��带 �̿��ؼ� ID �� Pass ���� �����غ���.
		if (!map.containsKey(id)) {
			System.out.println("�Է��� Id �� �������� ����... �ٽ� �Է��ϼ���.");
		}else {
			if(!(map.get(id)).equals(passwd)) {
				System.out.println("����� ���� ���� �ٽ� �Է��ϼ���.");
			}else {
				System.out.println("ID �� ����� ��ġ�մϴ�.");
				break;
			}
		}
	}
	}
}
