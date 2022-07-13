package oop.accessmodi;
/*
 * 특정 사용자 또는 학생의 상태를 표현하는 클래스
 * 일명 DTO(Date Transfer Object) 라고 합니다.
 * 이 DTO 를 이용해서 일반적으로 나중에 DB 에 넣고 빼고 작업을 하게 됩니다.
 */
public class Person {
	
	private String name; 
	private String hakbun;
	private String address;
	private String gender;
				

	public Person(String name, String hakbun, String address, String gender) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		this.gender = gender;
	}

	//name getter 정의
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public String getHakbun() {
		return hakbun;
	}
	
	public void setGender(String gender) {
		if(gender == "M" || gender == "F") {
			this.gender = gender;
		}else {
			System.out.println("올바르지 않은 성별입니다.");
		}
		
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public void setName(String name) {
		this.name = name;
	}

}
