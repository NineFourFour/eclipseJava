package sheet13OwnerWithPetArray;

public class Dog extends Pet implements Mammal{
	
	String microChipNumber;
	boolean isMicroChipped;
	
	public Dog(){
		super();
	}
	public Dog(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	public Dog(String name, String breed, int age, String color, Gender type, MicroChipped chipped){
		super(name, breed, age, color, type);
		this.isMicroChipped = chipped.chipped;
	}
	public boolean getMicroChipped(){
		return this.isMicroChipped;
	}
	public void setMicroChipped(MicroChipped isMicroChipped){
		this.isMicroChipped = isMicroChipped.chipped;
	}
	public boolean isMicroChipped(){
		return getMicroChipped();
	}
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of Dog";
	}
	public void sleep(){
		System.out.println("Dog is a sleep");
	}
	public void walk(){
		System.out.println("Dog is walking");
	}
	public String toString(){
		return "Name: "+getName()+"\nBreed: "+getBreed()+"\nAge:"+getAge()+"\nColor: "+getColor()+"\nisFemale: "+getIsFemale()+"\nMicro Chipped: "+isMicroChipped()+"\n";
	}
	
}
