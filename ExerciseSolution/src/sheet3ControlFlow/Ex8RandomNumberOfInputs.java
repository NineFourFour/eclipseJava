package sheet3ControlFlow;

import java.util.Scanner;

public class Ex8RandomNumberOfInputs {
	public static void main(String[] args) {
		
		double total = 0;
		int i=0, a;//a doesn't need to be initialized because it will be by the user at least once, do loop
		Scanner input = new Scanner(System.in);
		do{
			System.out.print("\t\n "+(i+1)+" Enter an integer or -1 to exit: ");
			a = input.nextInt();
			/*instead of adding the 1 back, (didn't think of this) us an if */
			if (a != -1) {
				total = total +a;
				i++;
			}
			
		}while(a != -1);
		double average = (total)/(i);
		System.out.printf("\t\nTotal of input integers is %.2f\n\n", total);
		System.out.printf("\t\nAverage of input integers is %.2f\n\n",average);
		input.close();
	}
}
