package sheet13OwnerWithPetArray;

public class Owner {
	
	String name;
	String address;
	String phoneNumber;
	Pet[] pet;
	
	public Owner(){
		super();
	}
	public Owner(String name, String address, String phoneNumber, Pet[] pet){
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.pet = pet;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber(){
		return this.phoneNumber;
	}
	public void setPetArray(Pet[] pet){
		this.pet = pet;
	}
	public Pet[] getPetArray(){
		return this.pet;
	}
	
	public String toString(){
		String petArrayString = new String();
		for(Pet p : this.pet){
			petArrayString += p.toString();
		}
		return  "Owner Name: "+getName()+"\nAddress: "+getAddress()+"\nPhone number: "+getPhoneNumber()+"\nPets \n"+petArrayString;
	}
}
