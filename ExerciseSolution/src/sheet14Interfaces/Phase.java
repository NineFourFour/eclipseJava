/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public enum Phase {
	
	PHASE_ONE(1),
	PHASE_TWO(2),
	PHASE_THREE(3),
	PHASE_FOUR(4),
	PHASE_FIVE(5),
	PHASE_SIX(6),
	PHASE_SEVEN(7);
	
	int phase;
	
	Phase(int phase){
		this.phase = phase;
	}
	public void setPhase(int phase){
		this.phase = phase;
	}
	public int getPhase(){
		return this.phase;
	}
}
