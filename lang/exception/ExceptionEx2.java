package lang.exception;

import java.io.*;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "�ڹٸ��ϴ���";
		FileWriter fw = null;
		try {
			fw = new FileWriter("myfirstFile.txt");
			fw.write(message);
		} catch (IOException e) {
			System.out.println("IO ���� �߻���");
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
