package langex;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb1 = new StringBuilder("hi");
		StringBuilder sb2 = new StringBuilder(1000);
		sb2.append("hi");
		
		//���� ũ�� Ȯ���ϱ�
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		
		//���� ũ�� �ڸ���
		sb2.trimToSize();
		System.out.println(sb2.capacity());
		
		//ĭ�� �־��
		sb2.insert(1, "ello h");
		System.out.println(sb2);
		
		//String ���� �ٲٱ�
		String con = sb2.toString();
		String con2 = new String(sb2);
		
	}

}
