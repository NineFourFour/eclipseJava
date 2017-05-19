/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet15Exceptions;

public class Employee {
	static int number = 0;
	//static int employeeNumber =9494;
	int no;
	String name;
	int age;
	double salary;
	int noOfSickDays;
	int employeeNumber;
	/*is this the default constructor or a zero parameter constructor*/
	public Employee(){
		number++;
	}
	/*use this to call the class within in the class, below this(); calls the constructor above
	 * so number is updated */
	public Employee(String name){
		this();
		this.name = name;
	}
	public Employee(String name, int age, double salary, int noOfSickDays, int employeeNumber){
		this();
		this.name = name;
		this.salary = salary;
		this.noOfSickDays = noOfSickDays;
		this.employeeNumber = employeeNumber;
		setAge(age);
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		try{
			 if (age < 18 || age > 67) {
			       throw new InvalidAgeException("ERROR: Age is not with in range, must be between 18 and 67");
			 }else{
				 this.age = age;
			 }
		}catch(InvalidAgeException iae){
			System.out.println("\n\tNew Exception: "+iae.message);
		}
	}
	public void setSalary(double salary){
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
