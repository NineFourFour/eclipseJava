/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet15Exceptions;

public class Employee {
	
	static int numberOfEmployees = 0;
	private String name;
	private int age;
	private double salary;
	private int noOfSickDays;
	private int employeeNumber;
	/*is this the default constructor or a zero parameter constructor*/
	public Employee(){
		numberOfEmployees++;
	}
	/*use this to call the class within in the class, below this(); calls the constructor above
	 * so number is updated */
	public Employee(String name){
		this();
		this.name = name;
	}
	public Employee(String name, int age, double salary, int noOfSickDays, int employeeNumber)throws InvalidAgeException,NameTooLongException,SalaryTooHighException{
		this();
		setName(name);
		setSalary(salary);
		setNoOfSickDays(noOfSickDays);
		setEmployeeNumber(employeeNumber);
		setAge(age);
	}
	public void setName(String name)throws NameTooLongException{
		if (name.length()>10)
			throw new NameTooLongException("setName(String): too many letters in name saquence");
		this.name = name;
	}
	public void setAge(int age)throws InvalidAgeException{
	
		 if (age < 18 || age > 67) {
		       throw new InvalidAgeException("setAge(int): Age is not with in range, must be between 18 and 67");
		 }
		 this.age = age;
	}
	public void setSalary(double salary)throws SalaryTooHighException{
		if(salary > 50_000)
			throw new SalaryTooHighException("setSalary(double): Too much, make it lower");
		this.salary = salary;
	}
	public void setNoOfSickDays(int noOfSickDays){
		this.noOfSickDays = noOfSickDays;
	}
	public void setEmployeeNumber(int employeeNumber){
		this.employeeNumber = employeeNumber;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}
	public double getSalary(){
		return this.salary;
	}
	public int getNoOfSickDays(){
		return this.noOfSickDays;
	}
	public int getEmployeeNumber(){
		return this.employeeNumber;
	}
	public String toString(){
		String s = "Name: "+this.name+"\tAge: "+this.age+"\tSalary: "+this.salary+"\tNo of sick days:"+this.noOfSickDays+"\tEmployee number:"+this.employeeNumber;
		return s;
	}	
}
