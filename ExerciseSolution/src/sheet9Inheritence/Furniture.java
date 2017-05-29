package sheet9Inheritence;

public class Furniture {

	
	private String colour;
	private String materialType;
	
	
	/*constructors for class*/
	public Furniture(){
		
	}
	public Furniture(Colour colour, MaterialType material){
		setColour(colour);
		setMaterialType(material);
	}	
	public Furniture(String colour, String materialType){
		this.colour = colour;
		this.materialType = materialType;
	}
	
	
	
	/*set methods for the class variables*/
	public void setColour(Colour color) {
		this.colour = color.toString();
	}
	public void setColour(String colour){
		this.colour = colour;
	}
	public void setMaterialType(String materialType){
		this.materialType = materialType;
	}
	public void setMaterialType(MaterialType material){
		this.materialType = material.toString();
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
		return "Colour: "+this.colour+" -- Material Type: "+this.materialType;
	}
	
}
