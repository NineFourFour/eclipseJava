package sheet3ControlFlow;

import java.util.Scanner;

public class Ex12PassFail {
	
	public static void main(String[] args){
		System.out.printf("\t\nInput Marks\n\n");
		Scanner input = new Scanner(System.in);
		System.out.print("\t\nFirst mark : ");
		double mark1 = input.nextDouble();
		System.out.print("\t\nSecond mark: ");
		double mark2 = input.nextDouble();
		System.out.print("\t\nThird mark: ");
		double mark3 = input.nextDouble();
		
		Ex12PassFail e12 = new Ex12PassFail();
		boolean a = e12.pass(mark1, mark2, mark3);
		if(a){
			System.out.print("\n\tPass\n\n");
		}else{
			System.out.printf("\n\tFail\n\n");
		}
		input.close();
	
	}
	public boolean pass(double x, double y, double z){
		/*local variable must be initials before being accessed*/
		int numberOfPass=0;
		/*pass must be greater than 2 to pass*/
		if (x > 39)
			numberOfPass++;
		if(y >39)
			numberOfPass++;
		if(z > 39)
			numberOfPass++;
		double average = (x+y+z) /3;
		/*if the numberOfPass is < 2 then fail*/
		if (numberOfPass <2)
			return false;
		/*equal to three pass*/
		if(numberOfPass == 3)
			return true;
		/*less than three passes but average > = to 50*/
		if(numberOfPass >1 && average >= 50){
			return true;
		}else{
			return false;
		}
	}
}
