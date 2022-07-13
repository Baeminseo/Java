package ioexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * BufferReader 의 하위 타입인 라인넘버리더를 통해 문자열 기반의 파일을 읽어봅니다.
 * 당연히 버퍼 사이즈 조정 할 수 있습니다.
 * File 객체를 이용해서 파일에 접근하는 방법도 알아봅니다. 
 */
public class LineNumberReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \' \t \n --> 자바에서는 \는 문자열에서 escape 문자로 인식됩니다.
		// 즉 위에서 처럼 \ 뒤에 붙는 문자에 따라 명령을 수행한다는 의미입니다.
		//윈도우 계열에서는 파일의 path 정보를 \ 를 이용하는데, 하나만 쓰면 escape 문자로 인식하기 때문에
		//반드시 두개를 써줘야 합니다.
		String filePath = "C:\\Users\\Administrator\\eclipse-workspace\\Be_Expert_Pro\\src\\ioexam\\PrintStreamEx.java";
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		
		file = new File(filePath);
		if(!file.exists()) {
			System.out.println("파일을 찾을 수 없습니다.");
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
