package sheet10Inheritance_enum;

public class Shape {
	enum Color{RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGW, WHITE, GREY}
	
	Color code;
	String color;
	public Shape(){
		super();
	}
	public Shape(String color){
		this.color = color;
	}
	public Shape(Color code){
		/*using one of the methods in the Enum/Object class 
		 * to covert toString*/
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
	/*public static void main(String[] args) {
		Shape one = new Shape();
		System.out.printf("\n\tNew Shape one.toString() : %s",one.toString());
		
		one.code = Shape.Color.BLACK;
		Shape two = new Shape(one.code);
		System.out.printf("\n\tNew Shape two.toString() : %s",two.toString());
		
	}*/
}
