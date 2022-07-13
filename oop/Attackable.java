package oop;
/*
 * 마린의 모든 공격 유닛들은 상속을 받아 구현할 메서드를 보유한 인터페이스
 */
public interface Attackable {
	void attack();
	void attack(Zerg theZerg);
	void attack(int x, int y, Zerg theZerg);
	void attack(int x, int y, Protos theProtos);

}
