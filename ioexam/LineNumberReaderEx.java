package ioexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferReader �� ���� Ÿ���� ���γѹ������� ���� ���ڿ� ����� ������ �о�ϴ�.
 * �翬�� ���� ������ ���� �� �� �ֽ��ϴ�.
 * File ��ü�� �̿��ؼ� ���Ͽ� �����ϴ� ����� �˾ƺ��ϴ�. 
 */
public class LineNumberReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \' \t \n --> �ڹٿ����� \�� ���ڿ����� escape ���ڷ� �νĵ˴ϴ�.
		// �� ������ ó�� \ �ڿ� �ٴ� ���ڿ� ���� ����� �����Ѵٴ� �ǹ��Դϴ�.
		//������ �迭������ ������ path ������ \ �� �̿��ϴµ�, �ϳ��� ���� escape ���ڷ� �ν��ϱ� ������
		//�ݵ�� �ΰ��� ����� �մϴ�.
		String filePath = "C:\\Users\\Administrator\\eclipse-workspace\\Be_Expert_Pro\\src\\ioexam\\PrintStreamEx.java";
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		
		file = new File(filePath);
		if(!file.exists()) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr, 1024);
			lr = new LineNumberReader(br);
			
			String msg = null;
			while((msg = lr.readLine())!=null) {
				System.out.print(lr.getLineNumber() + ". ");
				System.out.println(msg);
			}
			if(lr != null)
				lr.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
