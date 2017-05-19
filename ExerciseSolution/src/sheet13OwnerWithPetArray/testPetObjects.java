package sheet13OwnerWithPetArray;

public class testPetObjects {
	
	public static void main(String[] args) {
		
		Cat ownerCat = new Cat();
		ownerCat.setName("lol");
		ownerCat.setBreed("aCat");
		ownerCat.setAge(5);
		ownerCat.setColor("black");
		ownerCat.setIsFemale(Gender.MALE);
		ownerCat.setNumberOfLives(9);
		String cat = ownerCat.toString();
		System.out.println(cat);
		//ownerCat.justLostaLife();
		//cat = ownerCat.toString();
		//System.out.println(cat);
		System.out.println("\n");
		
		Snake ownerSnake = new Snake("Snaky", "aSnake", 10, "Green/Red", Gender.FEMALE);
		String snake = ownerSnake.toString();
		System.out.println(snake);
		System.out.println("\n");
		
		Dog ownerDog = new Dog();
		ownerDog.setAge(9);
		ownerDog.setBreed("aDog");
		ownerDog.setColor("Brown");
		ownerDog.setIsFemale(Gender.MALE);
		ownerDog.setMicroChipped(MicroChipped.IS_MICRO_CHIPPED);
		ownerDog.setName("Dog");
		String dog = ownerDog.toString();
		System.out.println(dog);
		System.out.println("\n");
		
		Hamster ownerHamster = new Hamster("Hammond", "aHamster", 2,"black/white",Gender.MALE);
		String hammond = ownerHamster.toString();
		System.out.println(hammond);
		
		
		Pet[] ownersPets = {ownerCat, ownerDog, ownerHamster, ownerSnake};
		Owner newOwner = new Owner("John Murphy", "49 wood lawn Road", "3531345678", ownersPets);
		String owner = newOwner.toString();
		System.out.println(owner);
		
		
		
	}
}
