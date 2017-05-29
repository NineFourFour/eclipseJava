package sheet9Inheritence;

public class Chair extends Furniture{
	
	private boolean hasGasLift;
	private String type;
	
	public Chair(){
		/* No need for super();
		 * as it is implied
		 * */
	}
	public Chair(boolean hasGasLift, String type){
		/*
		 * no need for super(colour, materialType);
		 * also no need to pass through as parameters as it is implied
		 * */
		this.hasGasLift = hasGasLift;
		this.type = type;
	}
	public Chair(String colour, String materialType,boolean hasGasLift, String type){
		super(colour, materialType);
		this.hasGasLift = hasGasLift;
		this.type = type;
	}
	public Chair(Colour colour, MaterialType materialType,boolean hasGasLift, String type){
		super(colour, materialType);
		this.hasGasLift = hasGasLift;
		this.type = type;
	}
	public Chair(Colour colour, MaterialType materialType,boolean hasGasLift, Type type){
		super(colour, materialType);
		this.hasGasLift = hasGasLift;
		this.type = type.toString();
	}
	
	
	public void setHasGasLift(boolean hasGasLift){
		this.hasGasLift = hasGasLift;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setType(Type type){
		this.type = type.toString();
	}
	public boolean hasGasLift(){
		return this.hasGasLift;
	}
	public String getType(){
		return this.type;
	}
	
	public String toString(){
		return super.toString()+" -- Has Gas Lift: "+(this.hasGasLift?"Yes":"No")+" -- Type of use: "+this.type;
	}	
	
}
