package sheet11InheritancePayroll;

public class CommissionWorker extends Employee{
	double salary;
	double commission;
	int quanity;
	
	public CommissionWorker(){
		super();
	}
	public CommissionWorker(String firstName, String lastName, double salary, double commission, int quanity){
		super(firstName, lastName);
		this.salary = salary;
		this.commission = commission;
		this.quanity = quanity;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setCommission(double commission){
		this.commission = commission;
	}
	public double getCommission(){
		return this.commission;
	}
	public void setQuantity(int quantity){
		this.quanity = quantity;
	}
	public double getQuantity(){
		return this.quanity;
	}
	public double getEarnings(){
		return getSalary() + this.salary *(this.commission/100);
	}
	public String toString(){
		return "Commission Worker\nName: "+getFirstName()+" "+getLastName()+"\n"+"Earnings: €"+getEarnings()+"\nSales volume:"+getQuantity();
	}

}
