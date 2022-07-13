package oop;

public class Marine extends Terran implements SteamPack, Attackable{
	
	//모든 마린이 가져야 할 공통 속성(객체 속성)을 정의 한다. 여기에 정의되는 속성을 멤버필드(Member fields) 라고 한다.
	String name; //이름
	int hp;//체력
	int ap;//공격력
	int pt;//방어력
	
	@Override
	public void useSteamPack() {
		System.out.println("이속이 10 증가, 공격력이 10 증가했습니다.");
		
	}
	
	//생성자(constructor) : 클래스에서 객체를 실제 생성해주는 역할을 하는 코드
	// 또한 생성자는 목적에 따라 객체의 초기화를 한다. --> 객체의 초기화란 객체 멤버필드의 값을 특정 값으로 초기화 해주는 것을 말한다.
	/*
	 * 생성자의 필수 조건 :
	 * 1. 생성자명은 반드시 클래스 명과 같아야한다. 
	 * 2. 생성자는 메서드가 아니기에 리턴타입이 없다.
	 * 3. 객체 초기화 목적에 따라 하나 이상의 파라미터를 추가 할 수 없다.
	 * 4. 기본 생성자 (파라미터가 없는 생성자)는 프로그래머가 직접 생성자를 하나도 정의하지 않으면 컴파일시 컴파일러가 자동으로 생성하여 넣어준다.
	 * 이말은 반대로 여러분이 하나라도 생성자를 정의하면 기본생성자는 제공 되지 않는다는 의미이다. (중요)
	 */
	
	//컴파일러가 제공하는 기본 생성자 
	/*public Marine() {
		
	}*/
	
	public Marine() {
		if(theunitCount > UnitCounter.MAX_UNIT) {
			System.out.println("유닛이 "+ UnitCounter.MAX_UNIT + " 을 초과합니다.");
			return;
		}
		theunitCount++;
		name = null; hp = 0; ap = 0; pt = 0;
	}
	//이름만 초기화 하는 생성자 정의
    public Marine(String name) {
    	//자신의 객체를 REF 하는 키워드 this 를 이용해서 자신의 멤필에 파라미터의 값을 대입한다.
		this.name = name;
	}
    
    public Marine(String name, int hp) {
    	/*
    	 * 생성자 this() : 생성자에서 다른 생성자를 호출 할 때 사용되는 키워드, 반드시 생성자 첫머리에 나와야하며
    	 * 존재하는 생성자만 호출 할 수 있다.
    	 */
    	this(name);
    	this.hp = hp;
    }
    
    public Marine(String name, int hp, int ap) {
    	this(name, hp);
    	this.ap = ap;
    	
    }
    
    public Marine(String name, int hp, int ap, int pt) {
    	this(name, hp, ap);
    	this.pt = pt;
    	
    }
    
    //객체를 출력문(syso)에 출력키면 기본적으로 hashCode 값이 출력된다.
    // 객체의 기본 속성값을 출력 시키도록 특정 메서드를 정의하도록 한다.. toString() 이라는 메서드 이다. 기억하세요.
    
    public String toString() {
    	return this.name + "상병의 현재 피 : "+this.hp + "공격력 : " + this.ap + "방어력 :"+pt;
    }
    /*
    public void attack(String target) {
    	System.out.println("마린이 " + target + " 을 공격합니다.");
    }
    
    //메서드 오버로딩 : 같은 이름의 메서드를 (물론 리턴타입도 같아야한다) 파라미터로 구분을 지어서 정의하는 형태(생성자 오버로딩과 같음)
    //이때 주의해야할 것은 파라미터의 갯수, 순서, 타입이 일치하면 같은 메서드로 인식 되어진다는 것이다 (컴파일 에러)
    //이점 : 비슷하지만 조금씩 틀린 기능을 수행할 때 다른 이름으로 정의하는 것 보다 직관적으로 사용할 수 있다라는 장점이 있다.
    
    public void attack(Zerg theZerg) {
    	
    }
    public void attack(int x, int y, Zerg theZerg) {
    	
    }
    
    public void attack(int x, int y, Protos theProtos) {
    	
    }
    */
    public void move(int x, int y) {
    	System.out.println("마린이 "+ x + ", "+ y + "좌표로 이동합니다.");
    }
    public void dbClick(Marine theMarine) {
    	System.out.println(theMarine.name + "이 옛설 하며 응답을 합니다.");
    }
    
    
    
    //메서드 정의. 객체가 생성된 후 수행될 업무 로직을 메서드를 이용해서 표현한다.
    //기존에 배웠던 메서드를 연상하세요.
    
    //생성자 오버로딩 (overLaoding): 같은 이름의 생성자로 파라미터만 틀리게 정의하는 형태. 나중에 메서드 오
	public static void main(String[] args) {
		//Marine 객체 생성.. new 라는 키워드를 이용해서 생성한다.
		/*
		Marine m1 = new Marine("Alpha",5,10,3); //m1 마린객체 생성
		Marine m2 = new Marine("john",5,10,3);//m2 마린객체 생성하면서 이름, 피의 값 초기화한다.
		System.out.println(m1);//객체 생성
		System.out.println(m2);
		//객체의 속성에 값을 직접 대입함
		//m1.name = "John";
		
		
		//객체 속성을 알아봅시다. "."을 이용해서 속성, 메서드를 호출하면 됩니다.. 
		System.out.println(m1.name);
		System.out.println(m1.hp);
		System.out.println(m1.ap);
		System.out.println(m1.pt);
		
		m1.attack("저그");
		m1.move(300, 200);
		m1.dbClick(m1);
		*/
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마린이 기관총으로 공격을 합니다.");
		
	}

	@Override
	public void attack(Zerg theZerg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int x, int y, Zerg theZerg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int x, int y, Protos theProtos) {
		// TODO Auto-generated method stub
		
	}

}
