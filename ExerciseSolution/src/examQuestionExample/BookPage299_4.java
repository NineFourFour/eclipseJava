package examQuestionExample;

public class BookPage299_4 {
	

	
	public static void main(String[] args) {
		
	System.out.println("\n\tQuestion page299 3");
		/*char c = 78;
		char c1 = 0x4e;
		char c2 ='\u004e';
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);*/
		/*need to put the unicode declaration in quotes for it to work*/
		char[] ca = {0x4e, '\u004e', 78};
		for(char c3: ca)
			System.out.print(c3+",");
		/*
		 * output
		 * N,N,N,
		 * 
		 * */
		System.out.println("\n\n\tExercise 4");
						//		0	1
				int[][] a ={{1,2},{3,4}};
				/*assign b with 3 at position 0 and 4 at position 1*/
				int[] b = (int[])a[1];
				
				/*assign the object a 2d array "a" to an Object "o1"
				 * assign */
				Object  o1 = a;
				/*cast the Object to a 2d-Array and assign it to a 2d_Array a2*/
				int [][] a2 = (int[][])o1;
			
				//int[] b2 = (int[])o1;//problem
				/*
				 * ANSWER: you get a class cast exception at runtime because of the 
				 * line above, o1 refers to a 2d-array not a single array
				 * 
				 * */
				System.out.println("\n\nEx4 ans: "+b[1]);
		
	
			
			
	
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
