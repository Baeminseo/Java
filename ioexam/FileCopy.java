package ioexam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * FileOutStream 을 통해 파일을 write(int)해서 복사하는 예제입니다.
 * 기존 파일의 내용은 FileInputStream 을 통해 read() 합니다.
 */
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("HelloWorld.java");
			fos = new FileOutputStream("test.back",true);
			
			//읽고 쓰여지는 데이터 변수 int 선언
			int data = 0;
			while((data = fis.read()) != -1) {
				//읽혀진 데이터를 write()합니다.
				fos.write(data);
			}
			//다 읽고 쓴 후엔 닫아줍니다.
			fis.close();
			fos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
