package sheet13OwnerWithPetArray;

public abstract class Pet {
	/*member variables*/
	private String name;
	private String breed;
	private int age;
	private String color;
	private boolean isFemale;
	private static int numberOfPets = 0;
	
	/*constructors*/
	public Pet(){
		//super();
		numberOfPets++;
	}
	public Pet(Gender type){
		//super();
		numberOfPets++;
		this.isFemale = type.getGender();
	}
	public Pet(String name, String breed, int age, String color, Gender type){
		numberOfPets++;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
		this.isFemale = type.getGender();
	}
	
	/*Getters and Setters*/
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
		this.isFemale = type.getGender();
	}
	public boolean getIsFemale(){
		return this.isFemale;
	}
	public int getNumberOfPets(){
		return Pet.numberOfPets;
	}
	
	/*Abstract method so Abstract class*/
	public abstract String getTypeOfAnimal();
	
	public String toString(){
		return "Name: "+getName()+"\nBreed: "+getBreed()+"\nAge:"+getAge()+"\nColor: "+getColor()+"\nisFemale: "+getIsFemale()+"\n";
	}
		
		
		

	
}
