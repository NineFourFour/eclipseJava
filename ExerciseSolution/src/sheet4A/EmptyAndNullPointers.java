package sheet4A;

public class EmptyAndNullPointers {
	
	public static void main(String[] args) {
		System.out.println("2D Arrays possible Exam Questions\n\n");
	
		String[][] names={{},{},{}};
		System.out.println(names[0]);
		System.out.println(names.length);
		System.out.println(names[0].length);
		
		String[][] nameOne = new String[3][];
		System.out.println(nameOne[0]);
		//System.out.println(nameOne[0][0]);
		 System.out.println(nameOne.length);
		 //System.out.println(nameOne[0].length);
	}
}
