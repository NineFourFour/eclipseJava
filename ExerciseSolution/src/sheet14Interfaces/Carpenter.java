/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

import java.time.LocalDate;

public class Carpenter extends Trainee implements Apprentice{
	
	Phase phase;
	String employerName;
	
	public Carpenter(){
		
	}
	public Carpenter(String name, LocalDate dateOfBirth, String rsiNumber, Phase phase, String employerName){
			super(name, dateOfBirth, rsiNumber);
			this.phase = phase;
			this.employerName = employerName;
	}
	public void setPhase(int phase){
		
	}
	public void setPhase(Phase phase){
		this.phase = phase;
	}
	public void setEmployerName(String employerName){
		this.employerName = employerName;
	}
	public int getPhase(){
		return this.phase.getPhase();
	}
	public String getEmployerName(){
		return this.employerName;
	}
	public String toString(){
		return super.toString()+"\nPhase: "+getPhase()+"\nEmployers Name: "+this.employerName;
	}
}
