package sheet11InheritancePayroll;

import java.time.LocalDate;

public abstract class Employee {
	private String firstName;
	private String lastName;
	LocalDate dateOfBirth = LocalDate.of(1990, 11, 5);
	
	public Employee(){
		
	}
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public abstract double getEarnings();
	
	public String toString(){
		return this.firstName+" "+this.lastName;
	}
}
