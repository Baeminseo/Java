package oop;
/*
 * ������ ��� ���� ���ֵ��� ����� �޾� ������ �޼��带 ������ �������̽�
 */
public interface Attackable {
	void attack();
	void attack(Zerg theZerg);
	void attack(int x, int y, Zerg theZerg);
	void attack(int x, int y, Protos theProtos);

}
