package sheet7EmployeeAndClock;

public class Employee {
	static int numberOfEmployees = 0;
	private int no;
	private String name;
	private int age;
	private double salary;
	private int noOfSickDays;
	private int employeeNumber;
	/*is this the default constructor or zero parameter constructor*/
	public Employee(){
		this.no =++numberOfEmployees;
	}
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
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
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
	public int getNo(){
		return this.no;
	}
	public String toString(){
		String s = "Name: "+this.name+"\tAge: "+this.age+"\tSalary: "+this.salary+"\tNo of sick days:"+this.noOfSickDays+"\tEmployee number:"+this.employeeNumber;
		return s;
	}
	
}
