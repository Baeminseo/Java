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
		
		//두 객체가 같은지의 여부를 묻는 연산자는 == 입니다.
		if(str == str3) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
		char[] name = {'배','민','서'};//문자라서..
		String chaStr = new String(name);
		System.out.println(chaStr);
		
		String name1 = new String(name,2,name.length-2);//
		System.out.println(name1);
		
		byte[] rev = chaStr.getBytes();
		
		String charSetStr = new String(rev,Charset.forName("US-ASCII"));
		System.out.println(charSetStr);
		
		String email = "qoalstj01@naver.com";
		char ch = email.charAt(0);//0번 index의 문자를 리턴합니다.
		System.out.println(ch);
		char ch2 = email.charAt(email.length()-1);//속성관련이었는데 까먹음..
		System.out.println(ch2);
		
		//email 에 .com 이 있는지 확인해볼까요?
		
		
		if(email.contains(".com")) {
			System.out.println(".com 이 있습니다.");
		}else {
			System.out.println("없습니다.");
		}
		
		System.out.println(String.copyValueOf(name)); //
		
		System.out.println(email.endsWith(".com")); //
		System.out.println(email.startsWith("q")); //
		
		for(int i=0;i<email.length(); i++) {
			char chh = email.charAt(i);
			System.out.println(chh);
		}
		
		byte[] nameByte = chaStr.getBytes();//Byte로 분리하기
		System.out.println(Arrays.toString(nameByte)); 
		System.out.println(new String(nameByte));//String으로 다시 생성
		
		int idx = email.indexOf('!');
		System.out.println("@의 위치는 "+ idx); //위치 찾기
		
		String email2 = "abcda@itkorea.com";
		
		int idx2 = email2.indexOf('a',email2.indexOf('a')+1);//2번째 a가 있는 곳
		System.out.println(idx2);
		
		String chg = email2.replace('a', 'k');//바꾸기
		System.out.println(chg);
		
		String server=email.substring(email.indexOf('@')+1);//이후 출력
		System.out.println(server);
		
		String mailId = email.substring(0, email.indexOf('@'));//잘라내기
		System.out.println(mailId);
		
		String mm = "  abc  ";
		System.out.println(mm.trim().length());//공백제거
		
	}
	
	

}
