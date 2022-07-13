package langex;

public class IntegerEx {

	public static void main(String[] args) {
		
		//최대 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		String dig = "10";
		//문자열의 정수를 int 값으로 추출하는 메서드. parseInt
		//주의 : 공백이나, 다른 문자열이 들어가거나 하면 예외 유발됨
		int i = Integer.parseInt(dig) + 10;
		System.out.println(i);
	}

}
