package sheet9Inheritence;

public class Chair extends Furniture{
	
	boolean hasGasLift;
	String type;
	
	public Chair(){
		super();
	}
	public Chair(String colour, String materialType, boolean hasGasLift, String type){
		super(colour, materialType);
		this.hasGasLift = hasGasLift;
		this.type = type;
	}
	
	public void setHasGasLift(boolean hasGasLift){
		this.hasGasLift = hasGasLift;
	}
	public void setType(String type){
		this.type = type;
	}
	public boolean hasGasLift(){
		return this.hasGasLift;
	}
	public String getType(){
		return this.type;
	}
	
	public String toString(){
		return " "+this.colour+"\t"+this.materialType+"\t\t"+this.hasGasLift+"\t"+this.type;
	}	
	
}
