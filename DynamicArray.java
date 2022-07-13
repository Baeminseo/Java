
public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 동적 가변 배열 : inner 배열의 크기 (length)를 동적으로 생성해서 쓰는 형태.. 알아만 두기
		System.out.println(args.length);
		//outer 의 크기만 생성 후 inner은 동적으로 출력한다.
		char[] stars[] = new char[10][];
		
		for(int i = 0; i<stars.length;i++) {
			stars[i] = new char [i+1];
			for(int j = 0; j < stars[i].length; j++) {
				//inner 배열에 값을 넣어주고 출력을 시켜준다.
				stars[i][j] = '*';
				System.out.print(stars[i][j]);
			}
			System.out.println();
		}

	}

}
