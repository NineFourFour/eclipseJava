package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		
		
		/*Exercise 8 – Character and Word Count

		Ask the user to input a sentence.  Output the number of characters with spaces, 
		the number of characters without spaces and the number of words in the sentence.

		E.g. Sample running program:
		Enter a sentence: C# is a programming language developed by Microsoft.
		Words: 				8
		Characters (with spaces): 		52
		Characters (without spaces):		45

		Tips: it might be useful to convert the String into a character array and loop through the characters.  
		Also, the String class has a split() method which splits up a String into a String array 
		(this might be useful for doing a word count).  For example:

		String sentence = "Today is Thursday";
		// Split up the sentence into separate Strings, 
		// using a space as the separator. 
		String [] words = sentence.split(" ");

		The words array contains three elements as follows;

		sentence  
		Today	is	Thursday*/

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String inputString = input.nextLine();
		System.out.println(inputString = inputString.intern());
		
		
		
		String[] words = inputString.split(" ");
		System.out.println("Number of words: "+words.length);
		char[] inputStringCharArray = new char[inputString.length()];
		
		for(int i=0; i< inputString.length(); i++){
			inputStringCharArray[i] = inputString.charAt(i);
		}
		int counter=0;
		for(int i=0; i< inputString.length(); i++){
			if (inputStringCharArray[i] == ' ')
				counter++;
		}
		System.out.println("Characters with spaces: "+inputStringCharArray.length);
		System.out.println("Characters without spaces: "+(inputStringCharArray.length-counter));
			
		
		input.close();
		

	}
}
