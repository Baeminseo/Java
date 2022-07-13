package langex;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("hi");
		StringBuilder sb2 = new StringBuilder(1000);
		sb2.append("hi");
		
		//버퍼 크기 확인하기
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		
		//버퍼 크기 자르기
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		
		//칸에 넣어라
		sb2.insert(1, "ello h");
		System.out.println(sb2);
		
		//String 열로 바꾸기
		String con = sb2.toString();
		String con2 = new String(sb2);
		
	}

}
