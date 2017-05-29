package sheet9Inheritence;

public class Table extends Furniture{
	
	
	private boolean isExpandable;
	private String shape;
	
	
	
	/*constructors*/
	public Table(){
		/*no need for super(); as it is implied*/
	}
	public Table(boolean isExpandable, String shape){
		/*no need to pass color and material type through as 
		 * they are inherited from the super class which in this case
		 * is the furniture class, we also don't need the following
		 * super(colour,materialType); but if you want to create a class with four parameters
		 * you will need to add them in other wise you will have to use the gettere and 
		 * setters from the parent class to add those values to the object*/
		this.isExpandable = isExpandable;
		this.shape = shape;
	}
	public Table(String colour, String materialType, boolean isExpandable, String shape){
		super(colour,materialType);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}
	public Table(Colour colour, MaterialType materialType, boolean isExpandable, String shape){
		super(colour,materialType);
		this.isExpandable = isExpandable;
		this.shape = shape;
	}
	public Table(Colour colour, MaterialType materialType, boolean isExpandable, Shape shape){
		super(colour,materialType);
		this.isExpandable = isExpandable;
		setShape(shape);
	}
	
	
	/*setters, getters*/
	public void setExpanable(boolean isExpandable){
		this.isExpandable = isExpandable;
	}
	public void setShape(String shape){
		this.shape = shape;
	}
	public void setShape(Shape shape){
		this.shape = shape.toString();
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
