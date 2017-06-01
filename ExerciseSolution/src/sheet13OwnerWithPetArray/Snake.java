package sheet13OwnerWithPetArray;

public class Snake extends Pet implements Mammal {
	
	public Snake(){
		super();
	}
	public Snake(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of snake";
	}
	public void sleep(){
		System.out.println("Snake is a sleep");
	}
	public void walk(){
		System.out.println("Snake is slithering");
	}
}
