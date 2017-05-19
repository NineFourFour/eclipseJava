/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public class Trainee {
	String name;
	String dateOfBirth;
	String rsiNumber;
	
	public Trainee(){
		
	}
	public Trainee(String name, String dateOfBirth, String rsiNumber){
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.rsiNumber = rsiNumber;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setRsiNumber(String rsiNumber){
		this.rsiNumber = rsiNumber;
	}
	
	public String getName(){
		return this.name;
	}
	public String getDateOfBirth(){
		return this.dateOfBirth;
	}
	public String getRsiNumber(){
		return this.rsiNumber;
	}
	
	public String toString(){
		return "\n\tName: "+this.name+"\n\tDate of Birth: "+this.dateOfBirth+"\n\tRSI Number: "+this.rsiNumber;
	}
}
