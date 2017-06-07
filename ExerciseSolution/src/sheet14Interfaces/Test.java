/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

import java.time.LocalDate;
import java.time.Month;

public class Test {
	public static void main(String[] args) {
		ComputerAidedDesign cad1 = new ComputerAidedDesign();
		//System.out.println(cad1);
		
		SoftwareDeveloper sd1 = new SoftwareDeveloper();
		sd1.setName("BillGates");
		sd1.setDateOfBirth(LocalDate.of(1956, Month.FEBRUARY, 5));
		sd1.setRsiNumber("BG123456rs1");
		System.out.println("\n\n"+sd1);
		
		Carpenter carpOne = new Carpenter("NineFour",LocalDate.of(1970, Month.NOVEMBER, 5),"ninefour9494rs1", Phase.PHASE_FOUR, "DataCapture");
		System.out.println("\n\n"+carpOne);
		Carpenter carpTwo = new Carpenter("Tom Murphy", LocalDate.of(1994, Month.JULY, 31), "3107TM", Phase.PHASE_TWO, "System Build");
		
		Electrician electOne = new Electrician("John Spark", LocalDate.of(1980, Month.AUGUST, 23), "2345JS", Phase.PHASE_SEVEN, "DataSystems");
		System.out.println("\n\n"+electOne+"\n\n");
		
		Trainee[] tr1 = {cad1,sd1,carpOne,electOne,carpTwo,new Electrician("Captain Jack", LocalDate.of(1778, Month.JUNE, 15), "1234567CRBO", Phase.PHASE_TWO, "Indian Two")};
		System.out.println("\n\nApprenctices at Level 2:\n");
		for (Trainee T: tr1){
			//System.out.println(T);
			if(T instanceof Apprentice && ((Apprentice)T).getPhase() == Phase.PHASE_TWO.getPhase()){
					System.out.println(((Apprentice)T).getClass().getSimpleName());
					System.out.println("Apprentice name: "+T.getName());
					System.out.println("Employers Name: "+((Apprentice)T).getEmployerName());
					
			}
			
		}
		
	}

}
