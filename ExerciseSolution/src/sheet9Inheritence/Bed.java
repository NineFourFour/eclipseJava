package sheet9Inheritence;

public class Bed extends Furniture {
	
	boolean hasHeadboard;
	String size;
	
	public Bed (){
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
		return " "+this.colour+"\t"+this.materialType+"\t\t"+this.hasHeadboard+"\t\t"+this.size;
	}

}
