package example;

public class Child extends Parent{

	
	private String schoolAddress;
	

	public Child(){
		
	}
	public Child(String schoolAddress){
		this.schoolAddress = schoolAddress;
	}
	
	
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	
	public String toString(){
		return super.toString()+" Child School address: "+this.schoolAddress;
	}
}
