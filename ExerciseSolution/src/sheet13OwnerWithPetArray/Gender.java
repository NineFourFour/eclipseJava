package sheet13OwnerWithPetArray;

public enum Gender {
	
	MALE(false),
	FEMALE(true);
	
	boolean gender;
	Gender(boolean gender){
		this.gender = gender;
	}
	public void setGender(boolean gender){
		this.gender = gender;
	}
	public boolean getGender(){
		return this.gender;
	}
}
