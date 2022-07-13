package oop.inheritance;

public abstract class Animal {
	
	String theType;//어떤 동물객체인지를 판별하는 필드..
	
	public Animal(String theType) {
		this.theType = theType;
		
	}
	
	public String toString() {
		return"이것은 " + theType;
		
	}
	//추상 메서드 : 오로지 상속만을 위해 선언된 메서드를 말한다.
	/*
	 * 자신 클래스에서는 내용이 필요없지만 자식들이 상속을 받아 재정의 하여 사용할 수 있도록 강제화 할 수 있다.
	 * abstract 라는 키워드를 선언하여 추상화 할 수 있고, 내용부(body)가 없다.
	 * 추상 메서드를 하나라도 보유하는 클래스는 자동으로 추상클래스로 선언되어야한다.
	 * 추상 클래스를 상속 받은 자식 클래스는 강제로 추상 메서드를 오버라이드 해야한다.
	 * 그렇지 않을시엔 자신도 추상으로 선언이 되어야한다.
	 */
	public abstract void sound();

}
