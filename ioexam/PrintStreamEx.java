package ioexam;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * System Ŭ������ in �ʵ�� InputStream �̸�, read()�޼��带 ���� ǥ�� �Է��� ����ϵ��� ����Ǿ�����.
 * read() �ϱ� �翬�� byte �� �о���δ�.
 * out �ʵ�� PrintStream Ÿ���̸�, printIn() ���� �޼��带 ���� �پ��� �����͸� ��� ��ų �� �ִ�.
 */
public class PrintStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = null;
		PrintStream ps = null;
		PrintStream ps2 = null;
		//����Ʈ��Ʈ���� JDK 1.0 ���� ���� API, byte �� ������� �ϱ� ������ ���ڿ��� ������� �ϴ� 
		//PrintWriter �� �ִ�.. ��� Ʋ���� ����̳� �޼���� �Ȱ���.
		//��, ���ڿ��� ��� ��ų���� PrintWriter �� �����Ѵ�.
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream("myFile.txt",true);
			pw = new PrintWriter(fos);
			
			//PrintStream�� ��ü�� ����
			ps = System.out;
			ps2 = new PrintStream(fos);
			
			int input = 0;
			
			//ǥ�� �Է� ������κ��� ������ �Է� �޴´�.
//			while((input = System.in.read())!= -1){
//				//�Է� ���� �����͸� ǥ�� ����Ѵ�.. �ܼ� ���
//				ps.println("input --> "+ input);
//				ps.println("input(char) --> "+ (char)input);
//				ps2.println("input --> "+ (char)input);
//				pw.println("input --> "+ (char)input);
//			}
			Scanner scanner = new Scanner(System.in);
			String msg = "";
			while(true) {
				System.out.println("�Է��ϼ��� : ");
				if(msg.equalsIgnoreCase("q"))
					break;
				msg = scanner.next();
				ps2.println(msg);
				pw.println(msg);
			}
			//�Ϻ��� �ڵ�� null �� �׻� üũ�Ͽ��� �մϴ�.
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
