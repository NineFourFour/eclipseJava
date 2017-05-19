package sheet4Arrays;

public class ExTwoDArrays {
	
	public static void main(String[] args) {
		
		int[][] num = new int [10][];
		
		num[0] = new int[8];
		num[1] = new int[8];
		num[2] = new int[2];
		num[3] = new int[2];
		num[4] = new int[5];
		num[5] = new int[5];
		num[6] = new int[2];
		num[7] = new int[2];
		num[8] = new int[8];
		num[9] = new int[8];
	
		String[][] x = new String [10][];
		
		x[0] = new String[8];
		x[1] = new String[8];
		x[2] = new String[2];
		x[3] = new String[2];
		x[4] = new String[5];
		x[5] = new String[5];
		x[6] = new String[2];
		x[7] = new String[2];
		x[8] = new String[8];
		x[9] = new String[8];
		/*can only be used as initializers, so nums = { {1,2,3,4,5,6}, {2},{12,12}, {1,2,3,4} }; will no work*/
		int[][] nums = { {1,2,3,4,5,6}, {2},{12,12}, {1,2,3,4} };
		for(int i=0; i<nums.length;i++){
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0; i<num.length;i++){
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i=0; i<x.length;i++){
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}
