
public class Varialb_PtypeEx {
	public static void main(String[] argS){
		System.out.println(10);//4byte int 메모리 생성 후 그 값을 출력함
		byte b = 1;//1byte 메모리 생성 후 값 대입함
		byte b2 = -128;
		short s = 330;
		int i = 10000;
		long lo = 100000L;// Long값 넣을때는 long 타입임을 알 수 있도록 끝에 대문자 L을 넣어주는게 예의
		
		
		int result = (int)(i + lo); //케스팅 또는 long 타입으로 대입 해야함.
		
		System.out.println(Integer.toBinaryString(b2));
		
		//형변형 (casting)예제
		
		byte be = 1;
		int in = 1;
		
		//프로모션. 작은타입을 큰 타입에 대입 = 문제없음
		in = be;
		//케스팅..큰 타입을 작은 타입에 대입 반드시 케스팅을 거쳐야하고, 상위 Bit는 잘려나감
		be = (byte)in;//케스팅 시전
		System.out.println(be);
		
		//자료형의 Default 타입이 연산자와 만났을 경우엔 연산전에 무조건 Default 타입으로 모두 변경후 연산되고
		//만약 Default 보다 큰 타입과 Default가 만나면 무조건 큰 타입으로 변환된 후 연산된다.
		//따라서 적절한 케스팅이 필요하다.

     }

}