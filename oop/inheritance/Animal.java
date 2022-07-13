package oop.inheritance;

public abstract class Animal {
	
	String theType;//� ������ü������ �Ǻ��ϴ� �ʵ�..
	
	public Animal(String theType) {
		this.theType = theType;
		
	}
	
	public String toString() {
		return"�̰��� " + theType;
		
	}
	//�߻� �޼��� : ������ ��Ӹ��� ���� ����� �޼��带 ���Ѵ�.
	/*
	 * �ڽ� Ŭ���������� ������ �ʿ������ �ڽĵ��� ����� �޾� ������ �Ͽ� ����� �� �ֵ��� ����ȭ �� �� �ִ�.
	 * abstract ��� Ű���带 �����Ͽ� �߻�ȭ �� �� �ְ�, �����(body)�� ����.
	 * �߻� �޼��带 �ϳ��� �����ϴ� Ŭ������ �ڵ����� �߻�Ŭ������ ����Ǿ���Ѵ�.
	 * �߻� Ŭ������ ��� ���� �ڽ� Ŭ������ ������ �߻� �޼��带 �������̵� �ؾ��Ѵ�.
	 * �׷��� �����ÿ� �ڽŵ� �߻����� ������ �Ǿ���Ѵ�.
	 */
	public abstract void sound();

}
