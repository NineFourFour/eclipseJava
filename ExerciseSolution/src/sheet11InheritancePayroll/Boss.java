package sheet11InheritancePayroll;

public class Boss extends Employee{
	
	double salary;
	
	public Boss(){
		super();
	}
	public Boss(String firstName, String lastName, double salary){
		super(firstName, lastName);
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
		return "Title : Boss\nName: "+this.firstName+" "+this.lastName+"\nSalary: "+this.salary;
	}
}
