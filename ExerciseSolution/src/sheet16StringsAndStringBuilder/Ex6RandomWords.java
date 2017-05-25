package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex6RandomWords {
	public static void main(String[] args) {
		
		/*Exercise 6 – Random Words

		Store some words in an array.  Randomly select one of the words and prompt the user to guess the characters in that word,
		tell the user how many letters are in the word at the beginning of the program.

		Tip, if you have a five element array, the following code will give you a number between 0 and 4:

		int randomNumber = (int)(Math.random()*5);

		and the following code will use the random number to pick one of the array elements from the array called myWords:

		String word = myWords[randomNumer];

		For example, say you have the following words stored in an array:
		clock, chair, keyboard, trousers, printer, whiteboard, etc…..

		E.g. Sample running program:

		A 5 letter word has been chosen at random, please guess a letter: a
		a was found at position 3
		Your next guess: t
		t was not found
		Your next guess: c
		c was found at position 1

		Add a counter to your program that will count the number of incorrect guesses. Now add a loop and allow the user only 8 incorrect guesses.*/

		String[] words = {"System","Scanner","public","protected","increment"};
		Scanner input = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random()*5);
		//System.out.println(randomNumber);
		
		String word = words[randomNumber];
		int incorrectAns=0;
		while(incorrectAns < 8){
			System.out.println("A word has been chosen at random, please guess a letter: ");
			String s = input.next();
			int index = word.indexOf(s);
			if(index > -1)
				System.out.printf("\n\tChar \"%s\" was found at index: %d\n",s,index);
			
			if(index == -1)
				incorrectAns++;
		}
		
		
		
		input.close();
	
	
	
	}
}
