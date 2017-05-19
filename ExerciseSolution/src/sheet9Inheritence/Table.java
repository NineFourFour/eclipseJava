package sheet9Inheritence;

public class Table extends Furniture{
	boolean isExpandable;
	String shape;
	
	public Table(){
		super();
	}
	public Table(String colour, String materialType,boolean isExpandable, String shape){
		super(colour,materialType);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}
	public void setExpanable(boolean isExpandable){
		this.isExpandable = isExpandable;
	}
	public void setShape(String shape){
		this.shape = shape;
	}
	
	public boolean isExpandable(){
		return this.isExpandable;
	}
	public String getShape(){
		return this.shape;
	}
	
	public String toString(){
		return this.colour+"\t\t"+this.materialType+"\t\t"+this.isExpandable+"\t\t"+this.shape;
	}	
	
}
