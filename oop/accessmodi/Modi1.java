package oop.accessmodi;

/*
 * �ڹ��� ���� ������ () : �ڹٴ� ���� ������ ���� ���� �����ڸ� �����ؼ� ������ ������ ���ִ�.
 * public > protected > default(package) > private �� ������ ���� �Ǿ��� �ְ�, �ʵ�, Ŭ������ public or default �� ����, �޼��忡 ����� �� �ִ�.
 * public �� ������ ���� ū �������� ��Ű�� ���о��� ��𼭵� ���� �����ϰ�, protected �� ���� ��Ű���� ok, �ٸ���Ű���� �ڽ� Ŭ������ ok,
 * default(package) �� ���� ��Ű�������� ���� �����ϰ� ��Ű���� �������� ������ �⺻����� default �� �����Ǿ�����.
 * private �� ������ ���� Ŭ���������� ���� �����ϸ�, �ܺη��� ������ �������� �� ���ȴ�. (�� ���� �������� ����)
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
