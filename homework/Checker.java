package homework;

public class Checker {
	
	private String value; //사용자 입력 값
	private String[] theValues = {"가위","바위","보"};
	
	public Checker(String value) {
		this.value = value;
	}
	//체크 메서드
	//올바른 값이면 true 리턴
	public boolean isCorrect() {
		boolean result = false;
		
		for(String str : theValues) {
			if(str.equals(value)) {
				return !result;
			}
				
		}
		return result;
	}
			

}
