package ioexam;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferdOutputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//버퍼스트림을 이용하면 효율성이 증가합니다.
		//대부분은 버퍼스트림을 이용해서 in, out 을 진행합니다.
		FileOutputStream fos =null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("123.txt");
			bos = new BufferedOutputStream(fos,5);//버퍼의 크기를 5 byte 만큼 생성한다. 즉 한번에 5 만큼 자동으로 버퍼에 채워놓는다.
			
			for(int i ='1'; i<='9'; i++) {
				bos.write(i);
			}
			//필터스트림의 close() 나 flush() 를 호출하면 내부적으로 할당된 스트림을 메서드를 호출하여준다.
			bos.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
