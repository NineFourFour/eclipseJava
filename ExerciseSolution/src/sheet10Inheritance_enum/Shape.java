package sheet10Inheritance_enum;

public class Shape {
	/* enum: makeup a data type, color*/
	public enum Color{RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGW, WHITE, GREY}
	
	Color code;
	private String color;
	
	public Shape(){
		/*set default color*/
		this.color = Color.BLACK.toString();
	}
	public Shape(Color code){
		/*using one of the methods in the Enum type 
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

}
