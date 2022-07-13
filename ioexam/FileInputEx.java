package ioexam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * File �� ���� byte �� �о� ���̴� FileInputStream �����Դϴ�.
 */
public class FileInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "test.dat";

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			int count = 0;
			int data;
			while((data = fis.read()) != -1) {
				count++;
				System.out.print((char)data);
			}
			
			System.out.println("\ncount: "+ count);
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("������ ã�� �� �����ϴ�.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
