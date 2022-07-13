package oop.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		/*
		Cat myCat = new Cat("ģĥ��","���");//�ν��Ͻ�ȭ
		Dog dog = new Dog("��������","��Ʈ��");
		Duck duck = new Duck("�������","�渮�� ����");
		System.out.println(myCat.toString());
		myCat.sound();
		System.out.println(dog.toString());
		dog.sound();
		System.out.println(duck.toString());
		duck.sound();
		duck.layEggs();
		/*
		 * ��ü������ ������(polyMorphism) : instance �� ������ �� super Ÿ������ �����ϴ� ���¸� ���մϴ�.
		 * �̷��� ������ instance(��ü)�� �پ��� ���°� ref �Ǿ�����, ref Ÿ�Կ� ���� �޼��峪, �ʵ带 �پ��ϰ� ȣ��
		 * �Ǵ� ȣ�� �Ұ��ϰ� �� �� �ֽ��ϴ�. �� ������ �˾ƺ��ϴ�.
		 */
		
		//Super Ÿ������ �ڽ� ��ü �����ϱ�
		/*
		Animal cat = new Cat("ģĥ��","���");
		System.out.println(cat);
		cat.sound();
		//Ŭ���� �ɽ��� : ��Ӱ����� ū Ÿ���� Ŭ������ ���� Ÿ������ �������ִ� ����
		Cat cat2 = (Cat)cat;
		
		Animal duck = new Duck("�������","�渮�� ����");
		System.out.println(duck);
		((Duck)duck).layEggs();
		*/
		
		//instanceof ������ ����
		Cat myCat = new Cat("ģĥ��","���");//�ν��Ͻ�ȭ
		Dog dog = new Dog("��������","��Ʈ��");
		Duck duck = new Duck("�������","�渮�� ����");
		
		Animal[] animals = {myCat, dog, duck};
		//���� for.. ��� �迭�� index �� �˾Ƽ� �����ִ� for.. jdk 1.5 ���ĺ��� ������
		for(Animal ani : animals) {
			System.out.println(ani);
			ani.sound();
			if(ani instanceof Duck) {
				((Duck)ani).layEggs();
			}
		}
		
	}

}
