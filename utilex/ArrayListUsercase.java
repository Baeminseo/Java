package utilex;
import java.util.ArrayList;

import homework_teacher.PlayerInfo;
public class ArrayListUsercase {

	public static void main(String[] args) {
		
		PlayerInfo p1 = new PlayerInfo();
		p1.setEmail("qoalstj01@naver.com");
		p1.setPasswd("1111");
		p1.setWin(100);

		PlayerInfo p2 = new PlayerInfo();
		p2.setEmail("aaaaaa01@naver.com");
		p2.setPasswd("2222");
		p2.setWin(1);
		
		ArrayList<PlayerInfo> thePlayers = new ArrayList<PlayerInfo>();
		thePlayers.add(p1);
		thePlayers.add(p2);
		
		//받아서 활용하는 예
		for(PlayerInfo player: thePlayers) {
			System.out.println(player.getEmail());
			System.out.println(player.getPasswd());
			System.out.println(player.getWin_Rate());
		}
	}

}
