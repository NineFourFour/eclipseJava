/**
 * Author: James Hickey
 * Date: 16 May 2017
 * Location: FTS
 * 
 * 
 */
package sheet5Classes;

public class TestCar {
	public static void main(String[] args){
		int num = 1;
		Car c1 = new Car();
		//Car c2 = new Car("", "", 1.2);
		Car two = new Car("Honda", "ATVcr", 3.5);
		Car three = new Car("Audi", "A5", 2.5);
		Car four = new Car("BMW", "M6", 3.5);
		Car five = new Car("Bugatti", "Veron", 8.0);
		//double engineSize = c2.getEngineSize();
		System.out.printf("\nMakes of Cars : each one an instance of the car class\n\n");
		num = c1.printCar(num);
		num = two.printCar(num);
		num = three.printCar(num);
		num = four.printCar(num);
		num = five.printCar(num);
		System.out.println("\nNumber of cars created: "+Car.number);
		
	}
}
