package sheet4BSortArray;

import java.util.Scanner;

import java.util.Random;

public class Sort {
	public static void main(String[] args){
		Sort ex1 = new Sort();
		int[] elements = new int[40];
		Scanner input = new Scanner(System.in);
	/*
	 * random.nextInt(100) will return a random number 
	 * between 0 (inclusive) and 100 (exclusive).
	 * + 1 will mean the number is between 1 and 100.
	 */
		Random random = new Random();
		for(int i=0; i < elements.length ; i++){
			int num = random.nextInt(100) +1;
			elements[i] = num;
		}
		System.out.printf("\n  printArray Method\n");
		ex1.printArray(elements);
		System.out.printf("\n  Smallest Element Method\n");
		ex1.findSmallestElement(elements);
		System.out.printf("\n  Largest Element Method\n");
		ex1.findLargestElement(elements);
		
		System.out.printf("\n  searchArray Method\n");
		System.out.printf("\n  Input int : ");
		int num = input.nextInt();
		ex1.searchArray(elements, num);
		
		System.out.print("\n\tsortArray Method\n");
		ex1.sortArray(elements);
		
		input.close();
	}
	public void findSmallestElement(int[] x){
		System.out.printf("\n\n\tSmallest element in the array : ");
		int num = x[0];
		for(int i=1; i < x.length ;i++){
			if(x[i] < num){
				num = x[i];
			}	
		}
		System.out.printf("%d\n\n", num);
	}
	public void findLargestElement(int[] x){
		System.out.printf("\n\n\tLargest element in the array : ");
		int num = x[0];
		for(int i=1; i < x.length ;i++){
			if(x[i] > num){
				num = x[i];
			}	
		}
		System.out.printf("%d\n\n", num);
	}
	public void searchArray(int[] x, int y){
		//System.out.printf("\n\nFind element %d in the array\n",y);
		int num =-1, count =0;
		for(int i=0; i < x.length ;i++){
		//count =1 found the first occurrence of the element print i
			if(x[i] == y && count<1){
				num = i;
				count++;
			}	
		}
		if(num>-1){
			System.out.printf("\n\tElement at position %d in the array\n\n", num);
		}else{
			System.out.printf("\n\nNumber not found in the array");
		}
	}
	public void sortArray(int[] x){
		Sort ex1 = new Sort();
		int num =x[0], n =0,i=0;
		int[] sort = x;
		for(int s =0;s<x.length; s++){
			/*start with num equal to the first element in the array
			compare each element with num, if the next element is less than num then swap positions.
			use n for each pass through the array. After the first pass i will be equal to n, so on the next 
			pass i will start at 1 as n=1 and the lowest element from the first pass will be in element[0].
			*/
			for(;i < x.length; i++){
				//need to update num to the next value in the array
				num = x[n];
				if(x[i]<num){
					//num is assigned the lower number
					num = x[i];
					int num1 = x[n];
					x[n] = num;//lower no
					x[i] = num1;//higher no
					//swap the two values, lower value is put in the larger values position
					
				}
				
			}
			//put next lowest element in to sort
			sort[s] = x[n];
			//update n
			n++;
			//asign n to i and go again
			i=n;
		}
		ex1.printArray(sort);	
	}
	public void printArray(int[] x){
		System.out.printf("\n\nElements of the array : {");
		for(int i=0; i < x.length ;i++){
			System.out.printf("%d",x[i]);
			if(i < x.length -1){
				System.out.print(", ");
			}	
		}
		System.out.printf("}\n\n");
	}
	
}
