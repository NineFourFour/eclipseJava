/**
 * Author: James Hickey
 * Date: 16 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet5Classes;

public class Dog {
	/*encapsulation, private member variables (hidden data) with public access methods*/
	//private int breed;
	private String colour;
	private String owner;
	static int numberOfDogs;
	/*using constants, change breed from a string to an int
	public static final int LABADOR = 1;
	public static final int POINTER = 2;
	public static final int COLLIE = 3;
	public static final int BOXER = 4;
	public static final int SIBERIAN_HUSKY = 5;
	public static final int GERMAN_SHEPARD = 6;
	public static final int JACK_RUSSEL = 7;
	
	replace this with an enum class DogBreed
	/*no-args constructor*/
	
	DogBreed dogBreed;
	public Dog(){
		numberOfDogs++;
	}
	public Dog(DogBreed dogBreed){
		this();
		this.dogBreed = dogBreed;
	}
	public Dog(DogBreed dogBreed, String colour, String owner){
		this();
		setBreed(dogBreed);
		this.colour = colour;
		this.owner = owner;
	}
	/*validating, it's in the list of constants*/
	public void setBreed(DogBreed dogBreed){
		//System.out.println(dogBreed.breed);
		if(dogBreed.breed > 0 && dogBreed.breed < 8)
			this.dogBreed = dogBreed;
		else
			System.out.println("\nInvalid: doesn't not contain option");
	}
	/*change the int back to a string for the breed*/
	public String getBreed(){
		switch(this.dogBreed.getBreed()){
			case 1 :
				return "Labador";
			case 2:
				return "Pointer";
			case 3:
				return "Collie";
			case 4:
				return "Boxer";
			case 5:
				return "Siberian Husky";
			case 6:
				return "Jack Russel";
			default:
				return "Not on the list of breeds";
		}
		
	}
	public void setColour(String color){
		this.colour = color;
	}
	public String getColour(){
		return this.colour;
	}
	public void setOwner(String owner){
		this.owner = owner;
	}
	public void printDog(){
		System.out.printf("\n\tDogs Breed: %s\n", getBreed());
		System.out.printf("\n\tDogs Colour: %s\n", this.colour);
		System.out.printf("\n\tDogs Owner: %s\n", this.owner);
	}
	public String toString(){
		 return "\n\tDogs Breed: "+getBreed()+"\n\tDogs Colour: "+this.colour+"\n\tDogs Owner: "+this.owner;
	}

}
