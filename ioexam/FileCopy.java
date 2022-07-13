package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * FileOutStream �� ���� ������ write(int)�ؼ� �����ϴ� �����Դϴ�.
 * ���� ������ ������ FileInputStream �� ���� read() �մϴ�.
 */
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("HelloWorld.java");
			fos = new FileOutputStream("test.back",true);
			
			//�а� �������� ������ ���� int ����
			int data = 0;
			while((data = fis.read()) != -1) {
				//������ �����͸� write()�մϴ�.
				fos.write(data);
			}
			//�� �а� �� �Ŀ� �ݾ��ݴϴ�.
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
