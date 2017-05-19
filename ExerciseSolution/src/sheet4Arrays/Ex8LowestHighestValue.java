package sheet4Arrays;

import java.util.Scanner;

public class Ex8LowestHighestValue {
	public static void main(String[] args) {
		System.out.printf("\n\n\tArray numList\n\n"); 
		int[] numList = new int[10];
		Scanner input = new Scanner(System.in);
		for(int i =0; i<10 ; i++){
			System.out.printf("\tElement[%d] : ",i+1);
			numList[i] = input.nextInt();
		}
		Ex8LowestHighestValue ex8 = new Ex8LowestHighestValue();
		ex8.lowestElement(numList);
		ex8.highestElement(numList);
		/*for(int i =0; i<10 ; i++){
			System.out.printf("\tnumList[%d]\t%d ",i+1,numList[i]); 
		}*/
		input.close();
	}
	public void lowestElement(int[] x){
		int low = x[0];
		for(int i=1; i < x.length; i++){
			if (x[i] < low){
				low = x[i];
			}
		}
		System.out.printf("\tLowest number in the array: %d\n\n", low);	
	}
	public void highestElement(int[] x){
		int high = x[0];
		for(int i=1; i < x.length; i++){
			if (x[i] > high){
				high = x[i];
			}
		}
		System.out.printf("\tHighest number in the array: %d\n\n", high);	
	}
}
