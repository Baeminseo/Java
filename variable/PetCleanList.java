package variable;
//펫 청결도 정보
// 만족도 0 ~ 100
import java.util.*;

public class PetCleanList {
	
	/**
	 *  관리하기 쉽게 날짜별 청결도정보 정리
	 */
	
	HashMap<Date, PetClean> petcleanlist = new HashMap<Date, PetClean>(); 
	
	public void addDate(Date date, double cleanvalue) {
		
		PetClean cleantemp = new PetClean();
		
		cleantemp.setPethappy(cleanvalue);
		
		this.petcleanlist.put(date, cleantemp);

	}
	
	
	
	
	
}
