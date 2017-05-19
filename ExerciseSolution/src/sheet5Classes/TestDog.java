/**
 * Author: James Hickey
 * Date: 16 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet5Classes;

public class TestDog {
	public static void main(String[] args){
		//Dog d1 = new Dog(DogBreed.SIBERIAN_HUSKY, "White/Grey", "James");
		Dog d1 = new Dog();
		d1.setBreed(DogBreed.BOXER);
		Dog d2 = new Dog(DogBreed.LABADOR, "Sandy", "John");
		Dog d3 = new Dog(DogBreed.GERMAN_SHEPARD, "Black/Brown", "Seamus");
		Dog d4 = new Dog(DogBreed.JACK_RUSSEL, "white/Brown", "Jack");
		Dog d5 = new Dog(DogBreed.SIBERIAN_HUSKY);
		System.out.println(d5);
		System.out.println("\n\nFirst dog D1:");
		//d1.printDog();
		//System.out.printf("\nDog d1.setColour: Grey\n");d1.setColour("Grey");
		//d1.printDog();
		System.out.println("\nSecond dog D2:");
		d2.printDog();
		System.out.printf("\nDog d2.setOwner: Hannibal\n");d2.setOwner("Hannibal");
		d2.printDog();
		System.out.println("\nThird dog D3:");
		d3.printDog();
		System.out.printf("\nDog d3.getColour: %s\n",d3.getColour());
		System.out.println("\nFourth dog D4:");
		d4.printDog();
		System.out.printf("\nDog d4.setColour: Black\n");d4.setColour("Black");
		d4.printDog();
		System.out.println("\n\nnumber of dogs: "+Dog.numberOfDogs);
	}
}
