package sheet13OwnerWithPetArray;

/*cat has a IS-a relationship with Pet class, it inherits form that class
 *so extends from that class
 *cat also implements the methods contained in the Mammal interface*/

public class Dog extends Pet implements Mammal{
	
	private static int microChipNumber = 210_234;
	private int chipNumber;
	private boolean isMicroChipped;
	
	/*constructors*/
	public Dog(){
		//super();
		this.chipNumber = microChipNumber++;
	}
	public Dog(String name, String breed, int age, String color, Gender type){
		super(name, breed, age, color, type);
		this.chipNumber = microChipNumber++;
	}
	public Dog(String name, String breed, int age, String color, Gender type, MicroChipped chipped){
		super(name, breed, age, color, type);
		this.isMicroChipped = chipped.getMicroChipped();
		this.chipNumber = microChipNumber++;
	}
	
	/*Setters and Getters*/
	public boolean getMicroChipped(){
		return this.isMicroChipped;
	}
	public void setMicroChipped(MicroChipped isMicroChipped){
		this.isMicroChipped = isMicroChipped.getMicroChipped();
	}
	public boolean isMicroChipped(){
		return getMicroChipped();
	}
	public int getChipNumber(){
		if(isMicroChipped)
			return this.chipNumber;
		else
			return 0;
	}
	
	/*implementing abstract method from parent abstract class, 
	 * also the interface*/
	public String getTypeOfAnimal(){
		return "The Breed is "+getBreed()+" which is a type of Dog";
	}
	public void sleep(){
		System.out.println("Dog is sleeping, has MammalFactor: "+MammalFactorLarge);
	}
	public void walk(){
		System.out.println("Dog is walking, has MammalFactor: "+Dog.MammalFactofMedium);
	}
	
	/*overriding*/
	public String toString(){
		return "\nDog\n"+super.toString()+"Micro Chipped: "+isMicroChipped()+""
						+ "\nMicroChipNumber: "+(getChipNumber() > 0? getChipNumber() : "no ID number")+"\n";
	}
	
}
