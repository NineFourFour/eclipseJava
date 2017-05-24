package sheet4BSortArray;

public class Sort2 {

	public static void main(String[] args) {
		int[] sortArray = {2,6,15,1,2,15,1,20,18,10};
		System.out.println("SortArray length: "+sortArray.length);
		for(int x: sortArray)
			System.out.print("| "+x);
		int index=0;
		
		
		for(int i = 0; i< sortArray.length; i++){
			
			int num = sortArray[i];
			System.out.printf("\n i: %d num: %d",i, num );
			for(int j=0; j<sortArray.length; j++){
				if (num > sortArray[j]){
					index = j;
					
					//System.out.printf("\nj: %d\tsortArray[j]:%d Position: %d",j,sortArray[j], index);
				}
			}
			int num2 = sortArray[index];
			sortArray[index] = sortArray[i];
			sortArray[i] = num2;
			System.out.printf("\nSortArray[%d]: %d ",index,num2);
		}
		System.out.println("\n");
		for(int x: sortArray)
			System.out.print("| "+x);
		
	}
}
