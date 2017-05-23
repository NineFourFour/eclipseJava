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
		e2.setName("nineFour");
		try{
			e2.setAge(0);
		}catch(InvalidAgeException iae){
			System.out.println("\n\tNew Exception: "+iae.message);
		}
		;
		e2.setSalary(70_000);
		e2.setNoOfSickDays(2);
		e2.setEmployeeNumber(9494);
		System.out.print("\n\tNo: "+Employee.number);
		System.out.print("\n\t"+e2.toString());
		System.out.print("\n");
		
		Employee e3 = new Employee();
		e3.setName("Hannibal");
		try{
			e3.setAge(70);
		}catch(InvalidAgeException iae){
			System.out.println("Error: "+iae.message);
		}
		
		e3.setSalary(100_000);
		e3.setNoOfSickDays(0);
		e3.setEmployeeNumber(9696);
		System.out.print("\n\tNo: "+Employee.number);
		System.out.print("\n\t"+e3.toString());
		System.out.print("\n");
		System.out.printf("\nNumber of Employees : %d\n\n",Employee.number);
		
		Employee e4 = new Employee("Earl", 12, 234, 4, 9898);
		System.out.println(e4);
		try{
			e4.setAge(34);
		}catch(InvalidAgeException iae){
			System.out.println("Error: "+iae.message);
		}
		System.out.println(e4);
		System.out.printf("\nNumber of Employees : %d\n\n",Employee.number);
	}
}
