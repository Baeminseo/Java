package variable;
	//Æê Á¤º¸, Ç°Á¾, ³ªÀÌ, ¸ö¹«°Ô, Å°, ¼ºº° ¼±¾ð ºÎºÐ

import java.util.*;
import java.util.HashMap;

public class Pet {

	PetCleanList petclean = new PetCleanList();
	PetEatList peteat = new PetEatList();
	PetwalkList petwalk = new PetwalkList();
	
	private int petAge; // Æê ³ªÀÌ
	private String petName; //Æê ÀÌ¸§
	private int petWeight; //Æê ¸ö¹«°Ô
	private int petHeight; //Æê Å°
	private String petSex; //Æê ¼ºº°
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setPetAge(int petAge) {
		this.petAge = petAge;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetName(String petName) {
		this.petName = petName;
	}
	
	public int getPetWeight() {
		return petWeight;
	}
	
	public void setPetWeight(int petWeight) {
		this.petWeight = petWeight;
	}
	
	public int getPetHeight() {
		return petHeight;
	}
	
	public void setPetHeight(int petHeight) {
		this.petHeight = petHeight;
	}
	
	public String getPetSex() {
		return petSex;
	}
	
	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}
	
}
