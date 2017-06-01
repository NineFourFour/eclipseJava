package sheet13OwnerWithPetArray;

public enum Gender {
	
	MALE(false),
	FEMALE(true);
	
	private boolean gender;
	Gender(boolean gender){
		this.gender = gender;
	}
	
	public boolean getGender(){
		return this.gender;
	}
}
