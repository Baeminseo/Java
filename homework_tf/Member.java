package homework_tf;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getID() {
		return this.email.substring(0,this.email.indexOf('@'));
	}
	
}
