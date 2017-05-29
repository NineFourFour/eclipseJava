package sheet9Inheritence;

public class Bed extends Furniture {

	
	private boolean hasHeadboard;
	private String size;
	
	
	/*constructors*/
	public Bed (){
		/*inherit the furniture class, implicit so no need for super()*/
		//super();
	}
	public Bed(boolean hasHeadboard, String size){
		/*same reason as above ,  super(colour, materialType);
		 * also no need to pass through as parameters.
		 * */
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}
	public Bed(String colour, String materialType, boolean hasHeadboard, String size){
		super(colour, materialType);
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}
	public Bed(Colour colour, MaterialType material, boolean hasHeadboard, String size){
		 super(colour, material);
		this.hasHeadboard = hasHeadboard;
		this.size = size;
	}
	public Bed(Colour colour, MaterialType material, boolean hasHeadboard, Size size){
		 super(colour, material);
		this.hasHeadboard = hasHeadboard;
		setSize(size);
	}
	
	
	
	/*setters getters*/
	public void setHasHeadboard(boolean hasHeadboard){
		this.hasHeadboard = hasHeadboard;
	}
	public void setSize(String size){
		this.size = size;
	}
	public void setSize(Size size){
		this.size = size.toString();
	}
	public boolean hasHeadboard(){
		return this.hasHeadboard;
	}
	public String getSize(){
		return this.size;
	}
	public String toString(){
		return super.toString()+" -- Headboard: "+(this.hasHeadboard?"Yes":"No")+" -- Size: "+this.size;
	}

}
