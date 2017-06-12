package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex4ReverseInput {
	public static void main(String[] args) {
		System.out.println("\n\n\n\tExercise4\n");
		
		
		System.out.println("\n\tAsk the user to input a sentence, now print it out in reverse."
				+ "\n\tTips: you could convert the String to a character array and use a for loop "
				+ "\n\tthat counts backwards to print the content of the array, or you could use the "
				+ "\n\tcharAt() method from the String class inside a loop. To convert a String to a character "
				+ "\n\tarray:char [] letters = myString.toCharArray()");

		
		
		Scanner input = new Scanner(System.in);
		System.out.println("\nReverse a sentence\nEnter sentence here: ");
		String s = input.nextLine();
		char[] cArray = new char[s.length()];
		//System.out.println(s.length());
		for(int i=s.length()-1, j=0; i>-1;j++, i--){
			//System.out.println("i : "+i);
			//System.out.println("cArray[i]: "+cArray[i]);
			cArray[j] = s.charAt(i);
			//System.out.println("cArray[i]: "+cArray[i]);
		}
		/*to convert a char array back to a string: str = String.valueOf(cArray)
		 * if you use toString method then you get a location in memory*/
		String charArrayToString = String.valueOf(cArray);
		//String newStringCharArray = new String(cArray);
		//System.out.println(newStringCharArray);
		System.out.println("\n\t"+charArrayToString);
		
		input.close();
		
	}
}
