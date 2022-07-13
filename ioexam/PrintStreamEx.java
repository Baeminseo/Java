package ioexam;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * System 클래스의 in 필드는 InputStream 이며, read()메서드를 통해 표준 입력을 담당하도록 설계되어졌다.
 * read() 니깐 당연히 byte 를 읽어들인다.
 * out 필드는 PrintStream 타입이며, printIn() 등의 메서드를 통해 다양한 데이터를 출력 시킬 수 있다.
 */
public class PrintStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		PrintStream ps2 = null;
		//프린트스트림은 JDK 1.0 부터 나온 API, byte 를 대상으로 하기 때문에 문자열을 대상으로 하는 
		//PrintWriter 도 있다.. 대상만 틀릴뿐 기능이나 메서드는 똑같다.
		//즉, 문자열을 출력 시킬때는 PrintWriter 를 권장한다.
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream("myFile.txt",true);
			pw = new PrintWriter(fos);
			
			//PrintStream의 객체를 대입
			ps = System.out;
			ps2 = new PrintStream(fos);
			
			int input = 0;
			
			//표준 입력 대상으로부터 데이터 입력 받는다.
//			while((input = System.in.read())!= -1){
//				//입력 받은 데이터를 표준 출력한다.. 콘솔 출력
//				ps.println("input --> "+ input);
//				ps.println("input(char) --> "+ (char)input);
//				ps2.println("input --> "+ (char)input);
//				pw.println("input --> "+ (char)input);
//			}
			Scanner scanner = new Scanner(System.in);
			String msg = "";
			while(true) {
				System.out.println("입력하세요 : ");
				if(msg.equalsIgnoreCase("q"))
					break;
				msg = scanner.next();
				ps2.println(msg);
				pw.println(msg);
			}
			//완벽한 코드는 null 을 항상 체크하여야 합니다.
			//if(ps != null){
			//     ps.close();
		    //}
			
			ps.close();
			ps2.close();
			pw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
