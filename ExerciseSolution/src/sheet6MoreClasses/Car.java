package sheet6MoreClasses;

public class Car {
	private int no;
	private String Make;
	private String Model;
	private double engineSize;
	static int number=0;
	
	public Car(){
		number++;
	}
	
	public Car(String M, String Mo, double eS){
		this.no = number++;
		this.Make = M;
		this.Model = Mo;
		this.engineSize = eS;
	}
	public void setMake(String m){
		this.Make = m;
	}
	public void setModel(String m){
		this.Model = m;
	}
	public void setEngineSize(double es){
		this.engineSize = es;
	}
	public int getNo(){
		return this.no;
	}
	public String getMake(){
		return this.Make;
	}
	public String getModel(){
		return this.Model;
	}
	public double getEngineSize(){
		return this.engineSize;
	}
	public String toString(){
		
		return String.format("\n\t%d. Make: %s\tModel: %s\tEngineSize:  %.2f",getNo(),getMake(),getModel(),getEngineSize());
	}
	
}
