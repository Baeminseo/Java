package homework_final;
/*
 * ���� PlayerInfo �� ��� �޾Ƽ� ȸ�����Կ� �ʿ��� �ʵ常 �߰���Ŵ..
 */
public class Member extends PlayerInfo {
	
	private long lonInTime;
	private String email;
	private String passwd;
	
	public Member(long lonInTime, String email, String passwd) {
		super();
		this.lonInTime = lonInTime;
		this.email = email;
		this.passwd = passwd;
	}
	public long getLonInTime() {
		return lonInTime;
	}
	public void setLonInTime(long lonInTime) {
		this.lonInTime = lonInTime;
	}
	public String getid() {
		return email;
	}
	public void setid(String email) {
		this.email = email;
	}
	public String getpassword() {
		return passwd;
	}
	public void setpassword(String passwd) {
		this.passwd = passwd;
	}
	public String getID() {
		return this.email.substring(0,this.email.indexOf('@'));
	}
	
}
