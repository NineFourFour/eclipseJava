package sheet9Inheritence;

public class Table extends Furniture{
	private boolean isExpandable;
	private String shape;
	
	public Table(){
		/*no need for super(); as it is implied*/
	}
	public Table(boolean isExpandable, String shape){
		/*no need to pass color and material type through as 
		 * they are inherited from the super class which in this case
		 * is the furniture class, we also don't need the following
		 * super(colour,materialType);*/
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
		return super.toString()+" -- Expandable: "+(this.isExpandable? "Yes" : "No")+" -- Shape: "+this.shape;
	}	
	
}
