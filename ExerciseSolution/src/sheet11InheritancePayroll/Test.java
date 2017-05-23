package sheet11InheritancePayroll;

public class Test {
	public static void main(String[] args) {
		
		Boss newBoss = new Boss("Hannibal","Lecter", 170_000);
		//String boss = newBoss.toString();
		//System.out.print(boss+"\n\n");
		
		CommissionWorker comWorker = new CommissionWorker("Dexter", "Smyth", 500, 10, 80);
		//String worker = comWorker.toString();
		//System.out.print(worker+"\n\n");
		
		PieceWorker newPieceWorker = new PieceWorker("Flecter","Norman",20, 60);
		//System.out.print(newPieceWorker+"\n\n");
		
		HourlyWorker newHourlyWorker = new HourlyWorker("Captain", "Jack", 15, 40);
		//System.out.print(newHourlyWorker+"\n\n");
		
		Employee[] employeeArray = {newBoss,comWorker,newPieceWorker,newHourlyWorker};
		
		for(Employee e:employeeArray){
			System.out.print(e+"\n\n");
			double d = e.getEarnings();
			System.out.print("getEarnings: "+d+"\n\n");
		}
	}
}
