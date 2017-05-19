/**
 * Author: James Hickey
 * Date: 15 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet14Interfaces;

public class Test {
	public static void main(String[] args) {
		ComputerAidedDesign cad1 = new ComputerAidedDesign();
		//System.out.println(cad1);
		
		SoftwareDeveloper sd1 = new SoftwareDeveloper();
		sd1.setName("BillGates");
		sd1.setDateOfBirth("22 July 1956");
		sd1.setRsiNumber("BG123456rs1");
		//System.out.println(sd1);
		
		Carpenter carpOne = new Carpenter("NineFour","05/11/1970","ninefour9494rs1", Phase.PHASE_FOUR, "DataCapture");
		//System.out.println(carpOne);
		Carpenter carpTwo = new Carpenter("Tom Murphy", "31 July 1994", "3107TM", Phase.PHASE_TWO, "System Build");
		Electrician electOne = new Electrician("John Spark", "5 Feburary 1992", "2345JS", Phase.PHASE_TWO, "DataSystems");
		System.out.println(electOne);
		
		Trainee[] tr1 = {cad1,sd1,carpOne,electOne, carpTwo};
		
		for (Trainee T: tr1){
			//System.out.println(T);
			if(T instanceof Apprentice ){
				if(((Apprentice) T).getPhase().phase == 2){
					System.out.println("Apprentice name: "+T.getName());
					
					if(T instanceof Carpenter)
						System.out.println("Employers Name: "+((Apprentice) T).getEmployerName());
					if(T instanceof Electrician)
						System.out.println("Employers Name: "+((Apprentice) T).getEmployerName());
					//System.out.println(((Apprentice) T).getPhase());
					
				}
			}
		}
		
	}

}
