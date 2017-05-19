package sheet10Inheritance_enum;

public class Rectangle extends Shape {
	double height;
	double width;
	double area;
	
	public Rectangle(){
		super();
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
		return this.height * this.width;
	}
	public void draw(){
		System.out.printf("\n\tDraw a rectangle of height: %.2f and width: %.2f\n", this.height, this.width);
	}
	public String toString(){
		return this.color+"\t"+this.height+"\t"+this.width;
	}
	
	
	
	
	
}
