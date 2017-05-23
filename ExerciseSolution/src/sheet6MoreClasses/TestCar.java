package sheet6MoreClasses;

public class TestCar {

	
	public static void main(String[] args){
		Car[] carArray = new Car[5];
		
		Car cr = new Car();
		carArray[0] = cr;
		System.out.println(carArray[0]);
		carArray[0].setMake("Audi");
		carArray[0].setModel("A8");
		carArray[0].setEngineSize(4.0);
		System.out.print("\n\tcarArray[0].setMake('Audi'), carArray[0].setModel('A8'), carArray[0].setEngineSize(4.0)");
		carArray[1] = new Car("Honda", "ATVcr", 3.5);
		carArray[2] = new Car("Audi", "A5", 2.5);
		carArray[3] = new Car("BMW", "M6", 3.5);
		carArray[4] = new Car("Bugatti", "Veron", 8.0);
		
		System.out.printf("\n\n\tMakes of Cars printed from an Array\n");
		printCarArray(carArray);
		System.out.println("\n");
		
	}
	public static void printCarArray(Car[] cr){
		
		for(int i=0; i<cr.length ; i++){
			
			System.out.printf("\n\t%d. Make: %s\tModel: %s\tEngineSize:  %.2f",cr[i].getNo(),cr[i].getMake(), cr[i].getModel(), cr[i].getEngineSize());
		}
	}
}
