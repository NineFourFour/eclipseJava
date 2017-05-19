package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex7ProductPrice {
	
	public static void main(String[] args) {
		int[] refNums = {1000, 1001, 1002, 1003, 1004};
		String[] productNames = {"Keyboard", "Mouse", "Monitor", "Mouse mat","Speakers"};
		double[] prices = {49.99, 15.50, 124.99, 3.99, 23.50};
		double price=0;
		System.out.println("\n\n\tReference\tProduct \tPrice");
		System.out.println("-------------------------------------------------------");
		for(int i = 0; i<refNums.length; i++ ){
			/*instead of using \t, %-15: column of 15 in width (-) left aligned. 6.2: 6 chars in width right align with 2 decimal places */
			System.out.printf("\t%-16d%-15s€%6.2f\n",refNums[i], productNames[i],prices[i]);
		}
		String input = JOptionPane.showInputDialog("Please type a Reference number");
		int num = Integer.parseInt(input);
		
		for(int i = 0; i<refNums.length; i++ ){
			if(num == refNums[i]){
				JOptionPane.showMessageDialog(null, String.format("Product %s    Price €%.2f\n",productNames[i], prices[i]));
				price = prices[i];
				String input1 = JOptionPane.showInputDialog("How many would you like to order");
				int num1 = Integer.parseInt(input1);
				//String str = String.format("%1.2f", d);
				//d = Double.valueOf(str);
				//give two decimal places
				double cost = num1 * price;
				double roundOff = Math.round(cost * 100.0) / 100.0;
				JOptionPane.showMessageDialog(null, String.format("Total cost of order: €%.2f",roundOff));
				break;
			}
		}
	
		
	}
}
