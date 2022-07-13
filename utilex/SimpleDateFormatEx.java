package utilex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * SimpleDateFormat �� �̿��ؼ� ��¥�� ������ pattern ��� ��� ��ŵ�ϴ�.
 * �� ��¥�� �ǹ̴� letter��� ������ Ű����� ���ǵǾ����ϴ�.(�޴��� ����)
 */
public class SimpleDateFormatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		
		Calendar c1 = Calendar.getInstance();
		Date d1 = c1.getTime();//c1 ��ü�� �ð������� Date ��ü�� ���Ͻ�ŵ�ϴ�.
		
		String pattern = "���� �ð��� yyyy�� MM�� dd�� E���� a h:mm:ss �Դϴ�.";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(d1));

	}

}
