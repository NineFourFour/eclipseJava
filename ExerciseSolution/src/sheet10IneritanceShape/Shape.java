package sheet10IneritanceShape;
/*
 * 
 * Shape is a superclass for Rectangle, Triangle and Circle
 * 
 * abstract classes can't be instantiated. Their purpose is to provide common 
 * functionally to all its subclasses, i.e. setters and getters will be inherited. 
 * Constructors can be call from the subclass constructor, super(), and the parent toString()
 * can be called from subclass toString, super.toString.
 * 
 * An abstract class doesn't have to contain an abstract method but an abstract method must be in an abstract class.
 * 
 * An abstract method CAN'T have a body, instead of {}, it will end with a ;
 * i.e. public abstract void draw();
 * An abstract method must be implemented by all subclasses. When it makes no sense to implement a method in a 
 * super class, e.g. the draw method, it is not possible to implement the method here and let all child classes inherit it.
 * By making it abstract all child classes MUST implement it themselves, based on their own requirements.
 * 
 * The first concrete class(non-abstract) must implement the draw() method. The subclass of the abstract class must insert
 * the abstract method with a body.
 * 
 * */
public abstract class Shape {
	public enum Color{RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGE, WHITE, GREY}
	static int counter;
	private String color;
	//Color code;
	
	public Shape(Color code){
		/*using one of the methods in the Enum type 
		 * to covert toString*/
		counter++;
		this.color = code.toString();
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setColor(Color code){
		this.color = code.toString();
	}
	public String getColor(){
		return this.color;
	}

	public void draw(){
		System.out.println("\n\tDraw the Shape ");
	}
	public String toString(){
		return this.color;
	}
}
