package oop.inheritance;
/*
 * 클래스 상속 : 클래스와 클래스간에는 상속(extends)를 통해 기능과 속성을 확장할 수 있습니다.
 * 부모 클래스를 super 클래스로 지칭합니다.
 * 상속은 자식이 필요에 따라 extends 라는 키워드를 통해 받을 수 있는데, 특정 접근 제어자 (나중에 배움)를 제외한 모든걸 상속 받습니다.
 * 클래스 간에는 반드시 하나만 상속 가능하며 (즉 부모클래스가 1만 존재) 다중 상속은 불가합니다.(다중상속은 interface 를 통해 가능)
 * 제일 조심해야할 건 다 상속 해주지만 생성자만큼은 절대 상속이 안된다는 점 입니다.
 */


public class Dog extends Animal {
	
	String breed; //품종 속성
	String name;//이름 속성
	
	public Dog(String breed, String name) {
		//생성자의 super() : 부모 클래스의 특정 생성자를 명시적으로 호출하는 코드로, this()와 마찬가지로 반드시 첫 머리에 호출되어야 한다.
		super("개");
		this.breed = breed;
		this.name = name;
	}
	
	/*
	 * 메서드 오버라이딩() : 상속되어진 부모 클래스의 메서드를 자식의 관점에서 내용을 재 정의하는 형태.
	 * 오버라이딩을 하기 전에는 상속되어진 부모 클래스의 메서드가 호출되어지지만, 오버라이팅을 하면 부모의 메서드는 자식에 의해 가려지게 된다.
	 * 이때 만약 부모의 메서드 내용이 자식 입장에서 필요하면 super  라는 키워드를 통해 호출하여 기능을 활용할 수 있다.
	 * 오버라이딩의 조건 : 반드시 부모의 메서드 형식과 모든게 같아야 하며, 접근 제어자(나중에 배움)는 부모보다 같거나 커야 합니다.
	 * public > protected > default > private
	 */
	

	//고양이의 속성을 표현하는 toString()을 재정의(Overriding)합니다.
	
	public String toString() {
		return super.toString() + " 이름은 " + name + " 품종은 "+ breed;
	}
	
	@Override
	public void sound() {
		System.out.println(this.theType +"가 멍멍 하고 소리를 냅니다." );
	}

}
