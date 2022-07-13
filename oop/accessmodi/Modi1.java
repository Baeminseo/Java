package oop.accessmodi;

/*
 * 자바의 접근 제어자 () : 자바는 설계 목적에 따라 접근 제어자를 선언해서 접근을 제어할 수있다.
 * public > protected > default(package) > private 의 순으로 구성 되어져 있고, 필드, 클래스는 public or default 만 가능, 메서드에 선언될 수 있다.
 * public 은 범위가 가장 큰 개념으로 패키지 구분없이 어디서든 접근 간으하고, protected 는 같은 패키지는 ok, 다른패키지는 자식 클래스만 ok,
 * default(package) 는 같은 패키지에서만 접근 가능하고 패키지를 선언하지 않으면 기본저긍로 default 로 설정되어진다.
 * private 은 오로지 같은 클래스에서만 접근 가능하며, 외부로의 노출을 막고자할 때 사용된다. (즉 내부 로직에만 사용됨)
 */

public class Modi1 {
	
	public int a;
	protected int b;
	int c;
	private int d;

	public Modi1() {
		
	}
	protected Modi1(int a) {
		
	}
	public void a() {
		
	}
	
	protected void b() {
		
	}
	void c() {
		int a = d + 2;
	}
	private void d() {
		int a = d + 1;
		
	}

}
