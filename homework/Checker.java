package homework;

public class Checker {
	
	private String value; //����� �Է� ��
	private String[] theValues = {"����","����","��"};
	
	public Checker(String value) {
		this.value = value;
	}
	//üũ �޼���
	//�ùٸ� ���̸� true ����
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
