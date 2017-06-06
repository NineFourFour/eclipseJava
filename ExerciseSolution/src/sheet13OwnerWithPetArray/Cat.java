package sheet13OwnerWithPetArray;

/*cat has a IS-a relationship with Pet class, it inherits form that class
 *so extends from that class
 *cat also implements the methods contained in the Mammal interface*/

public class Cat extends Pet implements Mammal {
	/*member variables*/
	private int numberOfLives;
	
	/*Constructors*/
	public Cat(){
		//super();
	}
	public Cat(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	public Cat(String name, String breed, int age, String color, Gender type, int numberOfLives){
		super(name, breed, age, color, type);
		this.numberOfLives = numberOfLives;
	}
	/*implementing abstract method from parent abstract class, 
	 * also the interface*/
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of Cat";
	}
	public void sleep(){
		System.out.println("Cat is sleeping");
	}
	public void walk(){
		System.out.println("Cat is walking, has mammalFactor: "+Mammal.MammalFactorSmall);
	}
	
	/*Setters and getters*/
	public void setNumberOfLives(int numberOfLives){
		this.numberOfLives = numberOfLives;
	}
	public int getNumberOfLives(){
		return this.numberOfLives;
	}
	public void justLostaLife(){
		this.numberOfLives -= 1;
	}
	
	/*overriding toString method from the Object class*/
	public String toString(){
		return "\nCat:\n"+super.toString()+"Number of lives left: "+getNumberOfLives()+"\n";
	}
}
