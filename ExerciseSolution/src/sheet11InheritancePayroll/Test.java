package sheet11InheritancePayroll;

import java.time.LocalDate;
import java.time.Month;



public class Test {
	public static void main(String[] args) {
		
		Boss newBoss = new Boss("Hannibal","Lecter","1942-04-28",170_000);
		//String boss = newBoss.toString();
		Boss nextBoss = new Boss("NineFour","Nine",LocalDate.of(1970, Month.NOVEMBER, 5), 250_000);
		//System.out.println(nextBoss+"\n\n");
		
		
		//System.out.print(newBoss+"\n\n");
		System.out.println("Boss Date of Birth: "+newBoss.getDateOfBirth());
		
		
		CommissionWorker comWorker = new CommissionWorker("Dexter", "Smyth","1970-11-05", 500, 10, 80);
		//String worker = comWorker.toString();
		//System.out.print(worker+"\n\n");
		
		PieceWorker newPieceWorker = new PieceWorker("Flecter","Norman","1970-11-05",20, 60);
		//System.out.print(newPieceWorker+"\n\n");
		
		HourlyWorker newHourlyWorker = new HourlyWorker("Captain", "Jack","1970-11-05", 15, 40);
		//System.out.print(newHourlyWorker+"\n\n");
		
		Employee[] employeeArray = {newBoss,nextBoss,comWorker,newPieceWorker,newHourlyWorker};
		
		for(Employee e:employeeArray){
			System.out.print(e+"\n\n");
			double d = e.getEarnings();
			System.out.print("getEarnings: "+d+"\n\n");
			if(e instanceof PieceWorker)
				
				/*to access the methods for the PieceWorker class
				 *downcast, cast from employee to PieceWorker
				 *((PieceWorker)e).getWagePerPiece());*/
				
				System.out.printf("\nPieceWorker wage per piece: %.2f\n\n",((PieceWorker)e).getWagePerPiece());
				/*if a Circle then, cast shape object to circle object
				 * and print out the radius and color
				Circle CircleOne = (Circle)shapeArrayOne[i];
				System.out.println(CircleOne);
				System.out.printf("\n\tRadius of the circle is %d", ((Circle)shapeArrayOne[i]).getRadius());*/
		}
	}
}
