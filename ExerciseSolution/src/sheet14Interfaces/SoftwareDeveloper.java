/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public class SoftwareDeveloper extends Trainee {
	
	public SoftwareDeveloper(){
		
	}
	public SoftwareDeveloper(String name, String dateOfBirth, String rsiNumber){
		super(name, dateOfBirth,rsiNumber);
	}
	public String toString(){
		return String.format("\nSoftware Developer Name: %s\nDate Of Birth: %s\nRSI Number: %s", this.name, this.dateOfBirth, this.rsiNumber);
	}
}
