package sheet13OwnerWithPetArray;

public class Hamster extends Pet implements Mammal {
	
	public Hamster(){
		
	}
	public Hamster(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of Hamster";
	}
	public void sleep(){
		System.out.println("Hamster is a sleep");
	}
	public void walk(){
		System.out.println("Hamster is walking");
	}
	
	public String toString(){
		return "\nHamster\n"+super.toString();
	}
}
