package lang.exception;

import java.io.*;

/*
 * ����� ���� ���� ��ü �����ϱ� Exception Ŭ������ ��ӹ޾� ���踦 �ϸ� �ȴ�.
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
		// file�� �о���̴� �۾��� �մϴ�.
		File file = null;
		FileReader fr = null;

		try {
			file = new File("myfirstFil.txt");
			fr = new FileReader(file);// ���� ������ ������ �Ϻη� ���� �߻���Ŵ..

			int data = 0;
			while (true) {
				data = fr.read();
				if (data == -1)
					break;
				System.out.println((char)data);
			}
		} catch (Exception e) {
			throw new MyException("������ �����ϴ�.");
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
