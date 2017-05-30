package sheet10IneritanceShape;



public class Circle extends Shape{

private int radius;
	
	public Circle(Color code, int radius){
		super(code);
		this.radius = radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return this.radius;
	}
	public void draw(){
		System.out.printf("\n\tDraw a circle with a radius of: %d\n", this.radius);
	}
	public String toString(){
		return "\nCircle has the color "+super.toString()+" with a radius of "+this.radius;
	}
}
