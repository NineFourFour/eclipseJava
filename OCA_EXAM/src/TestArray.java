
public class TestArray {
	static int [] empty;
	static int []arrayNew = {};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestArray ta = new TestArray();
		
		//int [] nums = new int[]; will not compile
		int [] nums = new int[4];
		
		
		//System.out.println(empty.length);// get null point exception length 0
		System.out.println(empty);//null
		System.out.println(arrayNew);//[I@15db9742
		//System.out.println(arrayNew[0]); ArrayIndexOutOfBounds
		System.out.println(arrayNew.length);// 0
		
		boolean [] bl = new boolean[4];
		for(int i=0, j=0; i<bl.length; j++, i++)
			do{
				System.out.println(bl[i]+"["+i+"]"+" "+j);//false
				j++;
			}while(j < bl.length);
	/*false[0] 0
	 *false[0] 1
	 *false[0] 2
	 *false[0] 3
	 *false[1] 5
	 *false[2] 7
	 *false[3] 9
	*/		
		//int [][] TwoD = new int[][];will not compile
		int [][] TwoD = new int[4][];
		/*
		 * 					two = [0][1][2][3]
		 * 							
		 
		for(int i=0; i<TwoD.length; i++){
			for(int j=0; j<TwoD[i].length; j++)
				System.out.print(TwoD[i][j]);
		}
		get a java.lang.NullPointerException
		*/
		int [][] TwoD1 = new int[4][3];
		for(int i=0; i<TwoD1.length; i++){
			for(int j=0; j<TwoD1[i].length; j++)
				System.out.print(TwoD1[i][j]);
		}
		/* 012345678901
		 * 000000000000
		 */
		/*
		 *  i = 1d array
		 *  p = 2d array
		 *  g = 3d array
		 *  
		 */
		int [] i = {7}, p[]= {{1,3,4},{5,6,7}}, g[][] = {{{1,9},{2,7}},{{2,3},{5,6,7,8}},{{9,8,7},{34,45,49},{56,57,58,59}},{},{{99999}}};
		
		System.out.println(i[0]);//7
		System.out.println(p[0][2]);//4
		System.out.println(g[0][0][1]);//9
		System.out.println(g[0][1][1]);//7
		System.out.println(g[1][1][1]);//6
		System.out.println(g[2][1][1]);//45
		System.out.println(g[2][2][3]);//59
		System.out.println(g[4][0][0]);//99999
		
		
		
		
		
		
		
		
		
		
	}

}
