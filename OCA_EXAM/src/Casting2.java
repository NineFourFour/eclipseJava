interface HR{
	void printPaySips();
}

abstract class Employee{
	void clockIn(){
		System.out.println("Employee Clock In");
	}
	void clockOut(){
		System.out.println("Employee Clock Out");
	}
}
class Programmer extends Employee{
	public void writeCode(){
		System.out.println("Programmer is writing code");
	}
}
class Admin extends Employee implements HR{
	public void printPaySips(){
		System.out.println("Admin paySlips");
	}
}
class Consultant implements HR {
	public void printPaySips(){
		System.out.println("Consultant PaySlips");
	}
}
public class Casting2 {
	public static void main(String[] args) {
		//Employee e = new Employee();
		Employee p = new Programmer();
		//Employee c = new Consultant();
		HR a = new Admin();
		//HR p1 = new Programmer();
		HR c1 = new Consultant();
		//Admin a1 = new Programmer();
		Programmer p2 = new Programmer();
		
		p.clockIn();
		//p.writeCode();
		//a.clockIn();
		a.printPaySips();
		//c.printPaySlips();
		//c.clockOut();
		
		((Admin)a).clockIn();
		//((Employee)p2).writeCode();
		((Programmer)p).writeCode();
		//((HR)p2).printPaySips();
		((HR)a).printPaySips();
		((Employee)p2).clockOut();
	}

}
