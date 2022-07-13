package oop.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		/*
		Cat myCat = new Cat("친칠라","루비");//인스턴스화
		Dog dog = new Dog("스위스개","파트라슈");
		Duck duck = new Duck("도날드덕","헐리웃 오리");
		System.out.println(myCat.toString());
		myCat.sound();
		System.out.println(dog.toString());
		dog.sound();
		System.out.println(duck.toString());
		duck.sound();
		duck.layEggs();
		/*
		 * 객체지향의 다형서(polyMorphism) : instance 를 생성할 때 super 타입으로 생성하는 형태를 말합니다.
		 * 이렇게 생성된 instance(객체)는 다양한 형태고 ref 되어지고, ref 타입에 따라서 메서드나, 필드를 다양하게 호출
		 * 또는 호출 불가하게 할 수 있습니다. 이 내용을 알아봅니다.
		 */
		
		//Super 타입으로 자식 개체 생성하기
		/*
		Animal cat = new Cat("친칠라","루비");
		System.out.println(cat);
		cat.sound();
		//클래스 케스팅 : 상속관계의 큰 타입의 클래스를 작은 타입으로 변경해주는 연산
		Cat cat2 = (Cat)cat;
		
		Animal duck = new Duck("도날드덕","헐리웃 오리");
		System.out.println(duck);
		((Duck)duck).layEggs();
		*/
		
		//instanceof 연산자 응용
		Cat myCat = new Cat("친칠라","루비");//인스턴스화
		Dog dog = new Dog("스위스개","파트라슈");
		Duck duck = new Duck("도날드덕","헐리웃 오리");
		
		Animal[] animals = {myCat, dog, duck};
		//향상된 for.. 모든 배열의 index 를 알아서 돌아주는 for.. jdk 1.5 이후부터 지원함
		for(Animal ani : animals) {
			System.out.println(ani);
			ani.sound();
			if(ani instanceof Duck) {
				((Duck)ani).layEggs();
			}
		}
		
	}

}
