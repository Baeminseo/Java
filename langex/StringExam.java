package langex;

import java.nio.charset.Charset;
import java.util.Arrays;

public class StringExam {
	public static void main(String[] args) {
		String str = "hi";
		String str2 = "hi";
		String str3 = new String(str);
		
		byte[] bArr = {97,98,99,100};
		
		String bString = new String(bArr);
		String bStr2 = new String(bArr,1,bArr.length-1);
		
		System.out.println(bString);
		System.out.println(bStr2);
		System.out.println(bString.length());
		
		//�� ��ü�� �������� ���θ� ���� �����ڴ� == �Դϴ�.
		if(str == str3) {
			System.out.println("���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		}
		
		char[] name = {'��','��','��'};//���ڶ�..
		String chaStr = new String(name);
		System.out.println(chaStr);
		
		String name1 = new String(name,2,name.length-2);//
		System.out.println(name1);
		
		byte[] rev = chaStr.getBytes();
		
		String charSetStr = new String(rev,Charset.forName("US-ASCII"));
		System.out.println(charSetStr);
		
		String email = "qoalstj01@naver.com";
		char ch = email.charAt(0);//0�� index�� ���ڸ� �����մϴ�.
		System.out.println(ch);
		char ch2 = email.charAt(email.length()-1);//�Ӽ������̾��µ� �����..
		System.out.println(ch2);
		
		//email �� .com �� �ִ��� Ȯ���غ����?
		
		
		if(email.contains(".com")) {
			System.out.println(".com �� �ֽ��ϴ�.");
		}else {
			System.out.println("�����ϴ�.");
		}
		
		System.out.println(String.copyValueOf(name)); //
		
		System.out.println(email.endsWith(".com")); //
		System.out.println(email.startsWith("q")); //
		
		for(int i=0;i<email.length(); i++) {
			char chh = email.charAt(i);
			System.out.println(chh);
		}
		
		byte[] nameByte = chaStr.getBytes();//Byte�� �и��ϱ�
		System.out.println(Arrays.toString(nameByte)); 
		System.out.println(new String(nameByte));//String���� �ٽ� ����
		
		int idx = email.indexOf('!');
		System.out.println("@�� ��ġ�� "+ idx); //��ġ ã��
		
		String email2 = "abcda@itkorea.com";
		
		int idx2 = email2.indexOf('a',email2.indexOf('a')+1);//2��° a�� �ִ� ��
		System.out.println(idx2);
		
		String chg = email2.replace('a', 'k');//�ٲٱ�
		System.out.println(chg);
		
		String server=email.substring(email.indexOf('@')+1);//���� ���
		System.out.println(server);
		
		String mailId = email.substring(0, email.indexOf('@'));//�߶󳻱�
		System.out.println(mailId);
		
		String mm = "  abc  ";
		System.out.println(mm.trim().length());//��������
		
	}
	
	

}
