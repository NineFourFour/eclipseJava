package sheet11InheritancePayroll;

import sheet10Inheritance_enum.Circle;

public class Test {
	public static void main(String[] args) {
		
		Boss newBoss = new Boss("Hannibal","Lecter","1942-04-28",170_000);
		//String boss = newBoss.toString();
		System.out.print(newBoss+"\n\n");
		
		CommissionWorker comWorker = new CommissionWorker("Dexter", "Smyth","1970-11-05", 500, 10, 80);
		//String worker = comWorker.toString();
		//System.out.print(worker+"\n\n");
		
		PieceWorker newPieceWorker = new PieceWorker("Flecter","Norman","1970-11-05",20, 60);
		//System.out.print(newPieceWorker+"\n\n");
		
		HourlyWorker newHourlyWorker = new HourlyWorker("Captain", "Jack","1970-11-05", 15, 40);
		//System.out.print(newHourlyWorker+"\n\n");
		
		Employee[] employeeArray = {newBoss,comWorker,newPieceWorker,newHourlyWorker};
		
		for(Employee e:employeeArray){
			System.out.print(e+"\n\n");
			double d = e.getEarnings();
			System.out.print("getEarnings: "+d+"\n\n");
			/*if(shapeArrayOne[i] instanceof Circle){
				System.out.printf("\n\tCircle\n");
				/*if a Circle then, cast shape object to circle object
				 * and print out the radius and color
				Circle CircleOne = (Circle)shapeArrayOne[i];
				System.out.println(CircleOne);
				System.out.printf("\n\tRadius of the circle is %d", ((Circle)shapeArrayOne[i]).getRadius());*/
		}
	}
}
