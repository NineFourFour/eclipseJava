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
		e2.setAge(20);
		e2.setSalary(70_000);
		e2.setNoOfSickDays(2);
		e2.setEmployeeNumber(9494);
		System.out.print("\n\tNo: "+Employee.number);
		System.out.print("\n\t"+e2.toString());
		System.out.print("\n");
		Employee e3 = new Employee();
		e3.setName("Hannibal");
		e3.setAge(63);
		e3.setSalary(100_000);
		e3.setNoOfSickDays(0);
		e3.setEmployeeNumber(9696);
		System.out.print("\n\tNo: "+Employee.number);
		System.out.print("\n\t"+e3.toString());
		System.out.print("\n");
		System.out.printf("\nNumber of Employees : %d\n\n",Employee.number);
		Employee e4 = new Employee("Earl", 12, 234, 4, 9898);
		System.out.println(e4);
		e4.setAge(34);
		System.out.println(e4);
	}
}
