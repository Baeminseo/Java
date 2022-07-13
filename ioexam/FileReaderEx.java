package ioexam;

import java.io.FileReader;

/*
 * 문자를 읽는데 특화된 클래스인 Reader 의 하위 타입이니 FileReader 를 이용해서 문자를 읽어봅니다.
 */
public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "myfirstFile.txt";
		
		FileReader fr = null;
		int data = 0;
		
		try {
			fr = new FileReader(file);
			while((data = fr.read())!= -1) {
			System.out.print((char)data);	
			}
			fr.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
