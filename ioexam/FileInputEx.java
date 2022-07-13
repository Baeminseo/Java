package ioexam;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * File 로 부터 byte 를 읽어 들이는 FileInputStream 예제입니다.
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
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
