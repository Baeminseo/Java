package ioexam;

import java.io.FileReader;

/*
 * ���ڸ� �дµ� Ưȭ�� Ŭ������ Reader �� ���� Ÿ���̴� FileReader �� �̿��ؼ� ���ڸ� �о�ϴ�.
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
