/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

import java.time.LocalDate;

public class Electrician extends Trainee implements Apprentice {
	Phase phase;
	String employerName;
	
	/*Constructors*/
	public Electrician() {
		
	}	
	public Electrician(String name, LocalDate dateOfBirth, String rsiNumber, Phase phase, String employerName){
			super(name, dateOfBirth, rsiNumber);
			try{
				setPhase(phase);
			}catch(InvalidPhaseException ipe){
				System.out.println("ERROR: "+ipe.getMessage());
			}
			this.employerName = employerName;
	}
	
	/*Implement the methods in the interface Apprentice*/
	public int exceptionPhase(Phase phase){
		int value = 0;
		if(phase.getPhase()<1 ||phase.getPhase()>6){
			return value;
		}else
			this.phase = phase;
			return value = 1;
	}
	public void setPhase(Phase phase)throws InvalidPhaseException{
		if(phase.getPhase()<0 || phase.getPhase()> 6){
			this.phase = Phase.PHASE_SEVEN;
			throw new InvalidPhaseException("Invalid value");
		}
		this.phase = phase;
			
	}
	public void setPhase(int phase){
		
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
		return super.toString()+"\nPhase: "+(this.phase.getPhase() == 7? "No value": this.phase.getPhase())+""
						+ "\nEmployers Name: "+this.employerName;
	}
}
