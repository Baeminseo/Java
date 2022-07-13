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
		
		// 테란배열로 테란 유닛들을 그룹화 한다.
		Terran theUnits[] = {m, fire, mc};
		//그룹되어진 유닛들에게 공격 명령을 내리면, 공격 긴으을 구현한 즉 Attackable 인터페이스를 implements 한 유닛만 공격을 하게 호출한다.
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
