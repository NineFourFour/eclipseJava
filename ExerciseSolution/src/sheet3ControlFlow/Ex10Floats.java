package sheet3ControlFlow;

import java.util.Scanner;

public class Ex10Floats {
	public static void main(String[] args) {
		System.out.printf("\t\nEnter Three floats into the console\n\n");

		Scanner input = new Scanner(System.in);
		System.out.print("\t\nEnter first float: ");
		float num1 = input.nextFloat();
		System.out.print("\t\nEnter second float: ");
		float num2 = input.nextFloat();
		System.out.print("\t\nEnter third float: ");
		float num3 = input.nextFloat();
		Ex10Floats ex10 = new Ex10Floats();
		ex10.differentFloat(num1, num2, num3);
		ex10.largestFloat(num1,num2,num3);

		float average = (num1 + num2 + num3) / 3;
		System.out.printf("Average of the three floats : %.2f\n", average);
		input.close();
	}
	public void differentFloat(float num1, float num2, float num3){
		if(num1 != num2 && num1 != num3 && num2 != num3){
			System.out.printf("\t\nFloats are all different\n\n");
		}else if(num1 != num2 || num1 != num3 || num2 != num3){
			System.out.printf("\t\nTwo of the floats are the same\n\n");
		}else{
			System.out.println("\t\nThey are all the same");
		}
	}
	public void largestFloat(float num1, float num2, float num3){
		/*if(num1 > num2 && num1 > num3){
			System.out.printf("\t\nNum1 is the largtest\n\n");
		}else if(num2 > num1 && num2 > num3){
			System.out.printf("\t\nNum2 is the largest\n\n");
		}else if(num3 > num2 && num3 > num1){
			System.out.printf("\t\nNum3 float is the largest\n\n");
		}else{

		} another way of doing it below*/
		float largest = num1;
		if (largest < num2){
			largest = num2;
		}
		if (largest < num3)
			largest = num3;
		
		System.out.printf("\t\nLargest number is %.1f\n\n", largest);
	}
}
