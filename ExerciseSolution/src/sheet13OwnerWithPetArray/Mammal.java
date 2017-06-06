package sheet13OwnerWithPetArray;

public interface Mammal {
	/*	An interface is like a contract, if a class wants to be of type interface must implement all methods
	 * 	in the interface. Any class that implements this interface can then be treated as another type.
	 * 
	 * 	e.g. a circle IS-A shape IS-A Bounceable.
	 * 
	 * 
	 * 
	 * 	
	 * 
	 * All variable declared in an interface are public final static,
	 * public: 	accessable to all child classes and all classes that are visible to the interface.
	 * 			these constants are inherited by all impleting classes.
	 * 
	 * static: 	means just one exist in memory. To access a static variable either use the 
	 * 			classes name dot, Mammal.SIZE8 or Cat.SIZE8
	 * 
	 * final: 	Once assigned a value they can't be changed, These constants must be given on 
	 * 			the same line or will not compile. 
	 * 
	 * access using the interface name or the implementing class name.
	 * 
	 * all methods in an interface are implicity abstract and public
	 * 
	 * An abstract must be implement by all subclass, they don't have a body and end with a ;
	 * 
	 * Child class must implement all methods, the methods in the interface are public so must be 
	 * public in the implementing classes.
	 * 
	 * */
	int MammalFactorSmall = 1;
	int MammalFactofMedium = 2;
	int MammalFactorLarge = 3;
	
	void walk();
	void sleep();
}
