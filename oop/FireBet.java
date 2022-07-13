package oop;

public class FireBet extends Terran implements SteamPack, Attackable {

	public FireBet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void useSteamPack() {
		// TODO Auto-generated method stub
        System.out.println("파이벳이 스팀팩을 이용해서 미친듯이 불을 뿜습니다.");
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("파이어벳이 불 공격을 합니다.");
	}

	@Override
	public void attack(Zerg theZerg) {
		// TODO Auto-generated method stub
		System.out.println("파이어벳이 저그를 공격합니다.");
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
