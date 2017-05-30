package sheet10IneritanceShape;
/*
 * Shape has a constructor that takes in an argument, the default is no longer available.
 * Also a no-args constructor has not been defined.
 * If the subclass has no constructor declared it will not compile because it will look for 
 * the no-args constructor in the super class.
 * 	i.e. in this case: 
 * 			Implicit super constructor Shape() is undefined for default constructor. Must define an explicit constructor. 
 * 
 * To fix this and make it compile, declare a constructor for Rectangle and add in the member variables from the 
 * super class, also add in the super().
 * 
 * */

public class Rectangle extends Shape{

	private double height;
	private double width;
	private double area;

	public void setArea(double area) {
		this.area = area;
	}
	public Rectangle(Color code, double height, double width){
		super(code);
		this.height = height;
		this.width = width;

	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return this.height;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getWidth(){
		return this.width;
	}
	public double getArea(){
		return  this.area = this.height * this.width;
	}
	public void draw(){
		System.out.printf("\n\tDraw a rectangle of height: %.2f, width: %.2f and with the color: %s\n", this.height, this.width, this.area);
	}
	public String toString(){
		return "\nRectangle its color is "+super.toString()+", has a Height of "+this.height+"\nwith a width of "+this.width+" and the total area is "+getArea()+"cm2";
	}
	
}
