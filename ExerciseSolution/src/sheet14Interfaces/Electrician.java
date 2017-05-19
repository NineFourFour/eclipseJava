/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public class Electrician extends Trainee implements Apprentice {
	Phase phase;
	String employerName;
	

	public Electrician() {
	
	}	
	public Electrician(String name, String dateOfBirth, String rsiNumber, Phase phase, String employerName){
			super(name, dateOfBirth, rsiNumber);
			this.phase = phase;
			this.employerName = employerName;
	}
	
	
	public void setPhase(Phase phase){
		this.phase = phase;
	}
	public void setEmployerName(String employerName){
		this.employerName = employerName;
	}
	public Phase getPhase(){
		return this.phase;
	}
	public String getEmployerName(){
		return this.employerName;
	}
	public String toString(){
		return String.format("\nElectrician Name: %s\nDate Of Birth: %s\nRSI Number: %s\nPhase: %d\nEmployers Name: %s", this.name, this.dateOfBirth, this.rsiNumber, this.phase.getPhase(),this.employerName);
	}
}
