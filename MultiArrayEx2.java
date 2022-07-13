
public class MultiArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] multi[] = {{1,2,3},{4,5,6}}; //값으로 초기화한 다중배열 생성
		
		int[][] multi2 = null; //배열선언
		multi2 = new int[3][2]; // 3행 2열 짜리 배열 생성 (값은 default 초기화 됨)
		
		multi2 = new int[][] {{10,20},{30,40}}; //선언 이후 특정값으로 초기화 구문
		
		//위 3개 형태의 구문은 익혀두세요
		
		//for 문을 이용해서 다중 배열을 순회 하여 값 추출..
		for(int i = 0; i<multi.length; i++) {//outer 의 length 만큼 루프
			//inner 배열의 값을 접근한다. 단 outer 의 이름값으로 접근한다.
			for(int j = 0; j<multi[i].length;j++) {
				// 값은 Outer[]inner[] 안에 전재하므로..
				System.out.println(multi[i][j]);//출력 후 끝에 커서 위치시킨다. 즉 한 줄에 쭉 출력하는 메서드 print()
				
			}
			System.out.println(); //출력 후 라인을 변경한다. 다음 라인으로 커서 위치 이동 위 print 와 차이점 익혀두세요.
		}

	}

}
