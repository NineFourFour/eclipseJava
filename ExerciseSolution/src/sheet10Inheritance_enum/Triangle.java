package sheet10Inheritance_enum;

public class Triangle extends Shape {
	
	public Triangle(){
		super();
	}
	public Triangle(Color code){
		super(code);
	}
	public void draw(){
		System.out.printf("\n\tDraw Triangle with the color: %s\n", this.color);
	}
}
