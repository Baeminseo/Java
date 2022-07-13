package utilex;

import java.util.Calendar;

import javax.swing.JOptionPane;

/*
 * Calendar ��ü�� �̿��Ͽ� �Էµ� ��, ���� �ش��ϴ� �޷��� ����غ���.
 * 
 */
public class CalendarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("�⵵�� ���� �Է��ϼ���.");
		
		if(input != null) {
			//��� �� �и�
			int year = Integer.parseInt(input.substring(0, 4));
			int month = Integer.parseInt(input.substring(4, input.length()));
			
			//��¥ ��ü 2���� �ʿ��մϴ�.
			//����ڰ� ��û�� ���� ������ ���� �˾Ƽ� �� �����޿��� ������ �ϴ� �۾��� ���� ��ü �ΰ��� �ʿ���.
			Calendar sDay = Calendar.getInstance();
			Calendar eDay = Calendar.getInstance();
			
			//���� �����մϴ�. 0 ~11 �̹Ƿ� +1
			sDay.set(year, month-1,1);//��û�� ���� ����
			eDay.set(year, month,1);//��û�� ���� �������� Ȯ��
			
			//������ �� Ȯ���� ���� ���� �۾�
			eDay.add(Calendar.DATE,-1);//���� �ּ��� Ȯ���غ�����. 31�� ����
			
			//���Ϻ��� ���� ��¥�� Ʋ���� ������ ù��° ������ Ȯ���ؾ��մϴ�.
			int start_Day_of_week = 0, end_day = 0;
			
			start_Day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
			end_day= eDay.get(Calendar.DATE);
			
			System.out.println(" SU MO TU WE TH FR SA ");
			// �ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�.
			for(int i = 1; i<start_Day_of_week; i++) {
				System.out.print("   ");//3ĭ ��켼��.
			}
			//��¥�� ��½�Ű�� �� 7�ϸ��� �ְ� �ٲٱ�� ������ %������ ���� �� �ٲ� ó���� �Ѵ�.
			for(int i = 1, n=start_Day_of_week; i<=end_day; i++,n++) {
				System.out.print((i<10)? "  "+i : " "+i);
				if(n%7 == 0)
					System.out.println();
			}
		}
	}

}
