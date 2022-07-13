import java.util.Arrays;

public class ArrayExam1 {

	public static void main(String[] args) {
		
		//배열(Array) : 같은 타입의 값이 많이 사용이 될때 변수를 사용하는 것 보다, 배열을 이용해서 하나의 단위 묶음으로 활용하는 게 편하다.
		//자바에서는 이때 배열을 이용해서 데이터를 관리한다. 배열부터는  ptype 이 아니라 R type 으로 구분되어지니 꼭 기억하도록 한다.
		// Rtype 은 속성(properties) , 메서드(Method)를 가지고 있다라고 꼭 기억할 것
		// 이 중 배열은 속성만 가지고 있다.
		
		//생성식 type[] 변수 = new type[size];
		int score[] = new int[10]; //size 가 10인 배열을 생성함.. 기본적으로 Rtype 은 생성시에 모든 값은 기본값을 자동 초기화한다. 꼭 기억
		String[] names;
		names = new String[3];//string 은 문자열 객체이기에 기본값은 null로 초기화 한다.
		boolean[] bl = {true, false,true};//특정 값으로 생성과 동시에 초기화.
		
		System.out.println(score[0]);//배열의 값에 접근시엔 index 값을 넣어준다.
		System.out.println(names[0]);//배열의 값에 접근시엔 index 값을 넣어준다.
		System.out.println(bl[2]);
		
		for(int i = 0 ; i < bl.length; i++) {
			System.out.println(bl[i]);
		}
		//배열의 값을 전체적으로 쉽게 볼 수 있는 API(루프를 돌리지 않아도 값 확인 가능함)
		//Arrays.toString(배열);
		System.out.println(Arrays.toString(bl));
		


	}

}
