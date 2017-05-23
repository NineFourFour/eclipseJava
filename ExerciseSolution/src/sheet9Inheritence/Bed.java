package sheet9Inheritence;

public class Bed extends Furniture {
	
	private boolean hasHeadboard;
	private String size;
	
	public Bed (){
		/*inherit the furniture class*/
		super();
	}
	public Bed(String colour, String materialType, boolean hasHeadboard, String size){
		super(colour, materialType);
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}
	public void setHasHeadboard(boolean hasHeadboard){
		this.hasHeadboard = hasHeadboard;
	}
	public void setSize(String size){
		this.size = size;
	}
	public boolean hasHeadboard(){
		return this.hasHeadboard;
	}
	public String getSize(){
		return this.size;
	}
	public String toString(){
		return "Colour: "+getColour()+"\tMaterial type: "+getMaterialType()+"\t\tHeadboard: "+(this.hasHeadboard?"Yes":"No")+"\t\tSize: "+this.size;
	}

}
