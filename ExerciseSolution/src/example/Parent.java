package example;

public class Parent {
	private String name;
	
	
	
	
	public Parent(){
		
	}
	public Parent(String name){
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		
		return "Parents Name is "+this.name;
	}
	
}
