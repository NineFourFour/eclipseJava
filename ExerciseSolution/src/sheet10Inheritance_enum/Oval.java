package sheet10Inheritance_enum;



public class Oval extends Circle{
	
	private int diameter;
	public Oval(){
		
	}
	public Oval(Color code, int radius, int diameter){
		super(code, radius);
		this.diameter = diameter;
	}
	public void setDiameter(int diameter){
		this.diameter = diameter;
	}
	public int getDiameter(){
		return this.diameter;
	}
	/*public void draw(){
		System.out.printf("\n\tDraw a circle with a radius of: %d\n", this.radius);
	}*/
	public String toString(){
		return "\tOval to String : "+getColor()+"\t"+this.diameter;
	}
}
