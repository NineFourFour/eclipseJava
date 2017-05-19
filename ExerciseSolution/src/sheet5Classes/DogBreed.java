/**
 * Author: James Hickey
 * Date: 16 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet5Classes;

public enum DogBreed {
	
	LABADOR(1),
	POINTER(2),
	COLLIE(3),
	BOXER(4),
	SIBERIAN_HUSKY(5),
	GERMAN_SHEPARD(6),
	JACK_RUSSEL(7);
	
	int breed;
	
	DogBreed(int breed){
		this.breed = breed;
	}
	public int getBreed(){
		return this.breed;
	}

}
