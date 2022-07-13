package oop;

public class StarCraft {

	public static void main(String[] args){
		// TODO Auto-generated constructor stub
		Marine m = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		
		System.out.println(m.theunitCount);
		System.out.println(m2.theunitCount);
		System.out.println(m3.theunitCount);
		
		FireBet fire = new FireBet(); //instantiation
		Medic mc = new Medic();
		
		// �׶��迭�� �׶� ���ֵ��� �׷�ȭ �Ѵ�.
		Terran theUnits[] = {m, fire, mc};
		//�׷�Ǿ��� ���ֵ鿡�� ���� ����� ������, ���� ������ ������ �� Attackable �������̽��� implements �� ���ָ� ������ �ϰ� ȣ���Ѵ�.
		for(int i = 0; i<theUnits.length; i++){
			Terran theUnit = theUnits[i];
			if(theUnit instanceof Attackable) {
				((Attackable)theUnit).attack();	
			}
			if(theUnit instanceof SteamPack) {
				((SteamPack)theUnit).useSteamPack();
			}
		
			
		}
	}

}
