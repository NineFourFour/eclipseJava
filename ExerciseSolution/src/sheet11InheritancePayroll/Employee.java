package sheet11InheritancePayroll;

import java.time.LocalDate;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	
	
	/*constructors*/
	public Employee(){
		
	}
	public Employee(String firstName, String lastName, String dateOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = LocalDate.parse(dateOfBirth);
	}
	
	/*setters getters*/
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setDateOfBirth(String dateOfBirth){
		dateOfBirth = dateOfBirth.trim();
		this.dateOfBirth = LocalDate.parse(dateOfBirth);
	}
	public LocalDate getDateOfBirth(){
		return this.dateOfBirth;
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
		return "Name: "+this.firstName+" "+this.lastName+"\nDateOfBirth: "+this.dateOfBirth.getDayOfMonth()+""
				+ "."+this.dateOfBirth.getMonthValue()+"."+this.dateOfBirth.getYear();
	}
}
