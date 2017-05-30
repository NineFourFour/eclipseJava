package sheet11InheritancePayroll;

public class Boss extends Employee{
	
	private double salary;
	
	public Boss(){
		super();
	}
	public Boss(String firstName, String lastName,String dateOfBirth, double salary){
		super(firstName, lastName, dateOfBirth);
		this.salary = salary;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public double getEarnings(){
		return this.salary;
	}
	public String toString(){
		return "Title : Boss\n"+super.toString()+"\nSalary: "+this.salary;
	}
}
