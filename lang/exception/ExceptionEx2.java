package lang.exception;

import java.io.*;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "자바를하는중";
		FileWriter fw = null;
		try {
			fw = new FileWriter("myfirstFile.txt");
			fw.write(message);
		} catch (IOException e) {
			System.out.println("IO 예외 발생함");
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
