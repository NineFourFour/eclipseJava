package sheet3ControlFlow;

import java.util.Scanner;

public class Ex9IfElseStatements {
	
	public static void main(String[] args) {
		
	
		System.out.printf("\t\nEnter value into the console\n\n");
		
		int i=0, a=0;
		Scanner input = new Scanner(System.in);
		System.out.print("\t\n "+(i+1)+" Enter an integer: ");
		a = input.nextInt();
		
		if(a > 0 && a<=10){
			System.out.printf("\t\nInput is between 1 and 10\n");
		}else if(a > 10 && a <= 20){
			System.out.printf("\t\nInput is between 10 and 20\n");
		}else if(a > 20 && a <= 30){
			System.out.printf("\t\nInput is between 20 and 30\n");
		}else if(a > 30 && a <= 40){
			System.out.printf("\t\nInput is between 30 and 40\n");
		}else if(a > 40 && a <= 50){
			System.out.printf("\t\nInput is between 40 and 50\n");
		}else{
			System.out.printf("\t\nInput is not with in number range\n");
		}
		
		input.close();
	}
}
	
	
	
	
	
	
