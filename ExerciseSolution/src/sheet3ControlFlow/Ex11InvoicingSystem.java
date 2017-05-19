package sheet3ControlFlow;

import java.util.Scanner;

public class Ex11InvoicingSystem {
	public static void main(String[] args){
		System.out.printf("\t\nInvoicing System\n\n");
		
		Scanner input = new Scanner(System.in);
		System.out.print("\t\nEnter reference no : ");
		String refer = input.next();
		System.out.print("\t\nEnter unit price: ");
		double price = input.nextDouble();
		System.out.print("\t\nEnter quantity: ");
		int quantity = input.nextInt();
		Ex11InvoicingSystem ex11 = new Ex11InvoicingSystem();
		ex11.calculateTotal(refer, price, quantity);
		input.close();
	}
	public void calculateTotal(String ref, double price, int quantity){
		double total;
		if(quantity <= 100){
			/*cost for quantity under 100*/
			total = price * quantity;
			System.out.printf("Total cost of order : %.2f\n\n", total);
		}else if(quantity > 100){
				/*discount for units over 100, first 100 charged at the base base, */
				double newPrice = price * 0.75;//discount for units over 100
				total = (price * 100) + ((quantity - 100) * newPrice);
				System.out.printf("Total cost of order over 100: %.2f\n\n", total);
		}else{
			System.out.printf("Total cost cann't be calculate\n\n");
		}
	}
	
}
