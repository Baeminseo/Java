package variable;
//�� û�ᵵ ����
// ������ 0 ~ 100
import java.util.*;

public class PetCleanList {
	
	/**
	 *  �����ϱ� ���� ��¥�� û�ᵵ���� ����
	 */
	
	HashMap<Date, PetClean> petcleanlist = new HashMap<Date, PetClean>(); 
	
	public void addDate(Date date, double cleanvalue) {
		
		PetClean cleantemp = new PetClean();
		
		cleantemp.setPethappy(cleanvalue);
		
		this.petcleanlist.put(date, cleantemp);

	}
	
	
	
	
	
}
