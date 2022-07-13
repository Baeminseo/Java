package oop;
/*
 * interface : 클래스와 클래스 간에는 단일 상속만 지원됩니다. 하지만 다중 상속을 해서 작업을 축소해야하는 경우도 많습니다.
 * 인터페이스는 다중상속을 지원하게 하는 개념입니다.
 * 인터페이스는 클래스가 아니기 때문에 자신의 instance는 생성할 수 없습니다. 하지만 상속관계에서 Type Reference 로는 가능합니다.
 * 인터페이스간에는 다중 상속이 가능합니다. 즉 A,B,C interface 가 존재시 D interface 는 A,B,C 모두를 상속 가능합니다.
 * 클래스에서  interface 를 상속할때는 implements 라는 키워드를 통해 이루어집니다. ex > class A extends B implements K,Y,Z
 * interface 내에는 필드(변수), 메서드를 선언할 수 있는데, 필드는 선언과 동시에 public states final 로 되어ㅣㅈ며,
 * 메서드는 모두 추상으로 선언되어집니다.
 */
public interface SteamPack {
	
	public void useSteamPack();
	

}
