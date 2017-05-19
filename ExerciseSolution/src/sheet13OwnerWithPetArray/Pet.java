package sheet13OwnerWithPetArray;

public abstract class Pet {
	
	String name;
	String breed;
	int age;
	String color;
	boolean isFemale;
	
	public Pet(){
		super();
	}
	public Pet(Gender type){
		super();
		this.isFemale = type.gender;
	}
	public Pet(String name, String breed, int age, String color, Gender type){
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.isFemale = type.gender;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getBreed(){
		return this.breed;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	
	public void setIsFemale(Gender type){
		this.isFemale = type.gender;
	}
	public boolean getIsFemale(){
		return this.isFemale;
	}
	public abstract String getTypeOfAnimal();
	
	public String toString(){
		return "Name: "+getName()+"\nBreed: "+getBreed()+"\nAge:"+getAge()+"\nColor: "+getColor()+"\nisFemale: "+getIsFemale()+"\n";
	}
		
		
		

	
}
