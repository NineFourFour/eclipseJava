package sheet13OwnerWithPetArray;

public class Snake extends Pet{
	
	public Snake(){
		//super();
	}
	public Snake(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
	}
	
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of snake";
	}

	public String toString(){
		return "\nSnake\n"+super.toString();
	}
}
