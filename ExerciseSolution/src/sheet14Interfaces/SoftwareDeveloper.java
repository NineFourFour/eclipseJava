/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

import java.time.LocalDate;

public class SoftwareDeveloper extends Trainee {
	
	public SoftwareDeveloper(){
		
	}
	public SoftwareDeveloper(String name, LocalDate dateOfBirth, String rsiNumber){
		super(name, dateOfBirth,rsiNumber);
	}
	public String toString(){
		return super.toString();
	}
}
