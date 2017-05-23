package sheet11InheritancePayroll;

public class HourlyWorker extends Employee {
	private double wage;
	private double hoursWorked;
	
	public HourlyWorker(){
		super();
	}
	public HourlyWorker(String firstName, String lastName, double wage, double hoursWorked){
		super(firstName, lastName);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	public void setWage(double wage){
		this.wage = wage;
	}
	public double getWage(){
		return this.wage;
	}
	public void setHoursWorked(double hoursWorked){
		this.hoursWorked = hoursWorked;
	}
	public double getHoursWorked(){
		return this.hoursWorked;
	}
	public double getEarnings(){
		return getWage()*getHoursWorked();
	}
	public String toString(){
		return "Hourly Worker\nName: "+getFirstName()+" "+getLastName()+"\nEarnings: "+getEarnings();
	}
}
