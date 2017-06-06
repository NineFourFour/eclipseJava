package sheet13OwnerWithPetArray;

public class testPetObjects {
	
	public static void main(String[] args) {
		
		Cat ownerCat = new Cat();
		ownerCat.setName("lol");
		ownerCat.setBreed("aCat");
		ownerCat.setAge(5);
		ownerCat.setColor("black");
		ownerCat.setIsFemale(Gender.FEMALE);
		ownerCat.setNumberOfLives(9);
	
		System.out.println(ownerCat);
		ownerCat.justLostaLife();
		System.out.println("Cat has lost a life\nit has "+ownerCat.getNumberOfLives()+" lives left\n");
		
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
		
		System.out.println("\nOwners Pets");
		Pet[] ownersPets = {ownerCat, ownerDog, ownerHamster, ownerSnake, new Dog("Murdock", "GermanShepard", 2, "Black/Tan", Gender.MALE, MicroChipped.IS_MICRO_CHIPPED)};
		Owner newOwner = new Owner("John Murphy", "49 wood lawn Road", "3531345678", ownersPets);
		String owner = newOwner.toString();
		System.out.println(owner);
		
		for(Pet p : ownersPets){
			
			if(p instanceof Mammal)
				((Mammal)p).walk();
			if(p instanceof Dog)
				((Dog)p).sleep();
		}
		
		
	}
}
