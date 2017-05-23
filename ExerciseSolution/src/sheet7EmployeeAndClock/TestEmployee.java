package sheet7EmployeeAndClock;

public class TestEmployee {
public static void main(String[] args){
		
		
		Employee e = new Employee();
		System.out.print("\n\tNo: "+e.getNo());
		System.out.print("\n\t"+e);
		
		Employee e1 = new Employee("James");
		System.out.print("\n\tNo: "+e1.getNo());
		System.out.print("\n\t"+e1);
		
		Employee e2 = new Employee("James");
			e2.setName("nineFour");
			e2.setAge(46);
			e2.setSalary(70_000);
			e2.setNoOfSickDays(2);
			e2.setEmployeeNumber(9494);
		System.out.print("\n\tNo: "+e2.getNo());
		System.out.print("\n\t"+e2);
	
		Employee e3 = new Employee();
			e3.setName("Hannibal");
			e3.setAge(63);
			e3.setSalary(100_000);
			e3.setNoOfSickDays(0);
			e3.setEmployeeNumber(9696);
		System.out.print("\n\tNo: "+e3.getNo());
		System.out.print("\n\t"+e3);
		System.out.printf("\n\nNumber of Employees : %d",Employee.numberOfEmployees);
	}
}
