package sheet4AArrays;

public class Ex3Sales {
	
	public static void main(String[] args) {
		int[][]  Sales = new int[5][4];
		
		
		Sales[0][0] = 400;
		Sales[0][1] = 0;
		Sales[0][2] = 0;
		Sales[0][3] = 200;
		
		Sales[1][0] = 200;
		Sales[1][1] = 0;
		Sales[1][2] = 1000;
		Sales[1][3] = 0;
		
		Sales[2][0] = 400;
		Sales[2][1] = 1200;
		Sales[2][2] = 800;
		Sales[2][3] = 300;
		
		Sales[3][0] = 0;
		Sales[3][1] = 400;
		Sales[3][2] = 800;
		Sales[3][3] = 0;
		
		Sales[4][0] = 0;
		Sales[4][1] = 500;
		Sales[4][2] = 000;
		Sales[4][3] = 500;
		printTotalSales(Sales);
		int[] col = new int[4];
		for(int i = 0; i<Sales.length; i++ ){
		
			for(int j=0; j< Sales[0].length; j++){
			
			
				System.out.println(Sales[j][i]);
				
				
			}
		
		}
		
	}
	public static void printTotalSales(int[][] Sales){
		System.out.println("\n\n\tTotal Sales");
		System.out.print("\t\t\tSP1\tSP2\tSP3\tSP4");
		System.out.println("\t\t\t\t\t\t\t|Product Totals");
		System.out.print("\t---------------------------------------------------------------\n");
		//print out the two-d array
		int colTotal =0;
		int[] col = new int[4];
		for(int i = 0; i<Sales.length; i++ ){
			System.out.printf("\tProduct: %d",i+1);
			int total =0;
			for(int j=0; j< Sales[0].length; j++){
				System.out.printf("\t%d",Sales[i][j]);
				//total sales per product
				total+=Sales[i][j];
				//System.out.println("\n\n-----------------"+i+j);
				//colTotal += Sales[j][i];
				
			}
			//col[i] = colTotal;
			colTotal = 0;
			System.out.printf("\t|%d\n",total);	
		}
		System.out.print("\t-------------------------------------------------\n");
		System.out.print("\tTotals\t");
		int total = 0;
		//total sales per sales person, col stays the same row changes
		for(int j=0; j<Sales[0].length; j++){
			for(int i = 0; i<Sales.length; i++ ){
				total+=Sales[i][j];
			}
			System.out.printf("\t%d",total);
			total = 0;
		}
		System.out.print("\n\n");
		for(int k = 0; k< col.length; k++){
			System.out.println(col[k]);
		}
	}
	
}
