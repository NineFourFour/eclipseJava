package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex7ComparingWords {
	public static void main(String[] args) {
		
		/*Exercise 7 – Comparing Words

		Ask the user to input two words and output whether the second word precedes or follows the first word lexicographically. 

		E.g. Sample running program:
		Enter a word: 	Hello
		Enter another word: Help
		Hello precedes Help

		Enter a word: 	Banana
		Enter another word: Apple
		Banana follows Apple

		Tip: this can be achieved (the long way) by converting each String into a character array and comparing each character,
		or use the compareTo() method in the String class (the shorter and more recognized way). Go to the String class in the
		API for a description of the compareTo() method.
		
		*
		*
		*Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings. 
		*The character sequence represented by this String object is compared lexicographically to the character sequence 
		*represented by the argument string. The result is a negative integer if this String object lexicographically precedes 
		*the argument string. The result is a positive integer if this String object lexicographically follows the argument string. 
		*The result is zero if the strings are equal; compareTo returns 0 exactly when the equals(Object) method would return true.
		*
		*hello is before help so a negative number
		*Banana is after apple so you get a positive number
		*/
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\tEnter first word: ");
		String firstString = input.next();
		System.out.println("\n\tEnter another word: ");
		String secondString = input.next();
		
		int difference = firstString.compareToIgnoreCase(secondString);
		//System.out.println(difference);
		if(difference< 0)
			System.out.printf("\n\t%s precedes %s",firstString, secondString);
		else if(difference >0)
			System.out.printf("\n\t%s follows %s",secondString, firstString);
		else
			System.out.printf("\n\t%s is equal to %s",firstString, secondString);
	
	
		
		
		
		input.close();
	}
}
