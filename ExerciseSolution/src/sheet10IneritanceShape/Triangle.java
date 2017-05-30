package sheet10IneritanceShape;



public class Triangle extends Shape{
	public Triangle(Color code){
		super(code);
	}
	public void draw(){
		System.out.printf("\n\tDraw Triangle with the color: %s\n", super.toString());
	}
	public String toString(){
		return "\nTriangle has a colour of "+super.toString();
	}
}
