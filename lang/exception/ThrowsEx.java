package lang.exception;

import java.io.*;

/*
 * 사용자 정의 예외 객체 생성하기 Exception 클래스를 상속받아 설계를 하면 된다.
 * 
 */
class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
}
public class ThrowsEx {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		a();

	}

	static void a(){
		try {
			b();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	static void b() throws MyException{
		// file을 읽어들이는 작업을 합니다.
		File file = null;
		FileReader fr = null;

		try {
			file = new File("myfirstFil.txt");
			fr = new FileReader(file);// 없는 파일을 읽으려 일부러 예외 발생시킴..

			int data = 0;
			while (true) {
				data = fr.read();
				if (data == -1)
					break;
				System.out.println((char)data);
			}
		} catch (Exception e) {
			throw new MyException("파일이 없습니다.");
			//System.out.println(e.getMessage());
			//e.printStackTrace();

		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
