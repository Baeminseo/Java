package oop.accessmodi;
/*
 * Ư�� ����� �Ǵ� �л��� ���¸� ǥ���ϴ� Ŭ����
 * �ϸ� DTO(Date Transfer Object) ��� �մϴ�.
 * �� DTO �� �̿��ؼ� �Ϲ������� ���߿� DB �� �ְ� ���� �۾��� �ϰ� �˴ϴ�.
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

	//name getter ����
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
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
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
