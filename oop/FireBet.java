package oop;

public class FireBet extends Terran implements SteamPack, Attackable {

	public FireBet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSteamPack() {
		// TODO Auto-generated method stub
        System.out.println("���̺��� �������� �̿��ؼ� ��ģ���� ���� �ս��ϴ�.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���̾�� �� ������ �մϴ�.");
	}

	@Override
	public void attack(Zerg theZerg) {
		// TODO Auto-generated method stub
		System.out.println("���̾�� ���׸� �����մϴ�.");
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
