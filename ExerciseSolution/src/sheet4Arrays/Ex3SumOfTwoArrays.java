package sheet4Arrays;

public class Ex3SumOfTwoArrays {
	
	/*dataType[] arrayRefVar = new dataType[arraySize];
	dataType[] arrayRefVar = {value0, value1, ..., valuek};
	length of array -> arrayRefVar.length;
	public static int[] reverse(int[] list)*/
	
	public static void main(String [] args){
		int[] list1 = {1,2,3,4,5,6,7,8};
		int[] list2 = {8,7,6,5,4,3,2,1};
		System.out.printf("\n\n\tAdd Two Integer Arrays \n\n"); 
		System.out.printf("\tArray1\tArray2\tSum\n\n"); 
		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		ex3.sum(list1, list2);

	
	}
	public void sum(int[] list1, int[] list2){
			for(int i = 0; i<list1.length; i++){
				int sum = list1[i] + list2[i];
				System.out.printf("\n\t%d\t%d\t%d",list1[i], list2[i], sum);
			}
			System.out.println("");
	}
}
