/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet15Exceptions;

public class Test {
	public static void main(String[] args){

		
		Employee e2 = new Employee("James");
		System.out.print("\nNo of Employees: "+Employee.numberOfEmployees);
		
		Employee e3 = new Employee();
		
		try{
			e2.setAge(19);
			e2.setName("nineFour");
			e3.setAge(65);
			e3.setName("Hannibal");
			System.out.print("\nNo of Employees: "+Employee.numberOfEmployees);
			Employee e4 = new Employee("Earl", 23, 234, 4, 9898);
			System.out.println("\n\n"+e4);
			e4.setAge(34);
			System.out.println(e4);
			e2.setSalary(70_000);
			e3.setSalary(100_000);
		}catch(InvalidAgeException iae){
			System.out.println("\nError: "+iae.getMessage());
		}catch(NameTooLongException nte){
			System.out.println("ERROR: "+nte.getMessage());
		}catch(SalaryTooHighException ste){
			System.out.println("ERROR: "+ste.getMessage());
		}
		
		
		e2.setNoOfSickDays(2);
		e2.setEmployeeNumber(9494);
		
		System.out.print("\n"+e2);
		System.out.print("\n");
		
		e3.setNoOfSickDays(0);
		e3.setEmployeeNumber(9696);
		
		System.out.print(e3);
		System.out.printf("\nNo of Employees : %d\n\n",Employee.numberOfEmployees);
	}
}
