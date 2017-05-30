package sheet11InheritancePayroll;

import java.time.LocalDate;

public class testTwo {
	
	public class Employee{
		private String firstName;
		private String lastName;
		LocalDate dateOfBirth = LocalDate.of(1990, 11, 5);
		
		public Employee(){
			
		}
		public Employee(String firstName, String lastName, String date){
			this.firstName = firstName;
			this.lastName = lastName;
			setDate(date);
		}
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		public String getFirstName(){
			return this.firstName;
		}
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		public void setDate(String date){
			date = date.trim();
			String[] sbDateArray = date.split("\\.");
			int[] intDate = new int[sbDateArray.length];
			for(int i=0; i<sbDateArray.length; i++){
				
				int j = Integer.parseInt(sbDateArray[i]);
				intDate[i]= j;
			}
			
			dateOfBirth = LocalDate.of(intDate[0], intDate[1], intDate[2]);
			
		}
		
		public String getLastName(){
			return this.lastName;
		}
		
		public String toString(){
			return this.firstName+" "+this.lastName;
		}
		
		
		
	}
	public static void main(String[] args) {
		String date = "2012-04-23 ";
		date = date.trim();
		LocalDate dateOfBirth= LocalDate.parse(date);;
		System.out.println(dateOfBirth);
		/*String[] sbDateArray = date.split("\\.");
		int[] intDate = new int[sbDateArray.length];
		for(int i=0; i<sbDateArray.length; i++){
			
			int j = Integer.parseInt(sbDateArray[i]);
			intDate[i]= j;
			
			System.out.println(j);
		
		}*/
	}
}
