package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex5SearchForALetter {
	public static void main(String[] args) {
		/*Exercise 5 – Search for a Letter
		Write an application that will allow the user to enter a word and a character to search for in that word.  
		If the character is found, print out what position it was found at, if the character was not found print out ‘x was not found’.

		E.g. Sample running program: (run three times):
		Enter a word: Saturday
		Enter a search character: a
		a was found at position 2		 

		Enter a word: Software
		Enter a search character: o
		o was found at position 2	

		Enter a word: Microsoft
		Enter a search character: e
		e was not found

		There are two ways to do this (try both):
		Convert your String to a character array: 
		char [] letters = myString.toCharArray() and loop through the character array testing each character to see if it matches the search character.

		Use the indexOf() method in the String class. 

		Can you amend this program to search for multiple occurrence of the same character? (You will need a loop) 

		For example:
		Enter a word: Saturday
		Enter a search character: a
		a was found at position 2
		a was found at position 6*/
		Scanner input = new Scanner(System.in);
		System.out.println("\n\tEnter you sentence here: ");
		String inputString = input.nextLine();
		
		System.out.println("\n\tEnter a search character: ");
		String charToBeFound = input.next();
		int index = inputString.indexOf(charToBeFound);
		int index1 = inputString.lastIndexOf(charToBeFound);
		System.out.printf("\n\tFirst instance of %s was found at index: %d\n",charToBeFound,index);
		System.out.printf("\n\tLast instance of %s was found at index: %d\n",charToBeFound,index1);
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
