/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public class ComputerAidedDesign extends Trainee {

	public ComputerAidedDesign(){
		
	}
	public ComputerAidedDesign(String name, String dateOfBirth, String rsiNumber){
		super(name, dateOfBirth, rsiNumber);
	}
	public String toString(){
		return String.format("\nComputer Aided Design\nName: %s\nDate Of Birth: %s\nRSI Number: %s", this.name, this.dateOfBirth, this.rsiNumber);
	}
}
