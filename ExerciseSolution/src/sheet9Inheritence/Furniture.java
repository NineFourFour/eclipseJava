package sheet9Inheritence;

public class Furniture {
	
	String colour;
	String materialType;
	/*constructors for class*/
	public Furniture(){
		super();
	}
	public Furniture(String colour, String materialType){
		this.colour = colour;
		this.materialType = materialType;
	}
	/*set methods for the class variables*/
	public void setColour(String colour){
		this.colour = colour;
	}
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}
	/*get methods*/
	public String getColour(){
		return this.colour;
	}
	public String getMaterialType(){
		return this.materialType;
	}
	/*return class variables in a string*/
	public String toString(){
		return " "+this.colour+" "+this.materialType;
	}
	
}
