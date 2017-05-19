package sheet13OwnerWithPetArray;

public class Cat extends Pet implements Mammal {
	int numberOfLives;
	
	public Cat(){
		super();
	}
	public Cat(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	public Cat(String name, String breed, int age, String color, Gender type, int numberOfLives){
		super(name, breed, age, color, type);
		this.numberOfLives = numberOfLives;
	}
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of Cat";
	}
	public void sleep(){
		System.out.println("Cat is a sleep");
	}
	public void walk(){
		System.out.println("Cat is walking");
	}
	public void setNumberOfLives(int numberOfLives){
		this.numberOfLives = numberOfLives;
	}
	public int getNumberOfLives(){
		return this.numberOfLives;
	}
	public void justLostaLife(){
		this.numberOfLives -= 1;
	}
	public String toString(){
		return "Name: "+getName()+"\nBreed: "+getBreed()+"\nAge:"+getAge()+"\nColor: "+getColor()+"\nisFemale: "+getIsFemale()+"\nNumber of lives left: "+getNumberOfLives()+"\n";
	}
}
