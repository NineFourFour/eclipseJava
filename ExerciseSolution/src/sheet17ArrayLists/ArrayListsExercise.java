package sheet17ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListsExercise {
	public static void main(String[] args) {
		/*String one = "first";
		String two = "Second";
		String three = "Third";
		String four = "Fourth";
		String five = "fifth";
		String six = "sixth";
		String[] stringArray = {one, two, three, four, five, six};
		
		ArrayList<String> newArrayList = new ArrayList<>();
		newArrayList.add(five);
		newArrayList.addAll(0,Arrays.asList(stringArray));
		System.out.println(newArrayList);
		
		
		ArrayList<int[][]> intArray = new ArrayList<>();*/
		
		
		
		
		
		/*Exercise 1*/	
	//a)
		System.out.println("\nExercise 1");
		System.out.println("\nArrayList of names\n\n\n");
		Scanner input = new Scanner(System.in);
		ArrayList<String> newArrayList = new ArrayList<>();
		newArrayList.add("NineFour");
		String[] nineFour = {"Hannibal","Dexter","Flechter","Seven","Mr T","Face","StarLord","CountOne","James T"};
		newArrayList.addAll(Arrays.asList(nineFour));
		System.out.println("\na)"+newArrayList);
	//b)
		/*System.out.println("\nb) Find a name in the list.\nEnter name: ");
		String inputString = input.next();
		
		int index = newArrayList.indexOf(inputString);
		if(index > -1)
			System.out.println("\nName found on the list at index: "+index);
		else
			System.out.println("\nName does not appear in the list");
	//c)
		System.out.println("\nc) Remove a name in the list.\nEnter name: ");
		inputString = input.next();
		index = newArrayList.indexOf(inputString);
		boolean removed = newArrayList.remove(inputString);
		System.out.println(removed);
		if(removed)
			System.out.println("\nItem removed from list");
		else
			System.out.println("\nItem not removed from list");
		System.out.println(newArrayList);
	//d)
		System.out.println("\nd)Change a name in the list\nEnter name to be changed:");
		inputString = input.next();
		System.out.println("\nEnter replacement name:");
		String replace = input.next();
		index = newArrayList.indexOf(inputString);
		newArrayList.remove(inputString);
		newArrayList.add(index, replace);
		System.out.println("\n"+newArrayList);
	//e)*/
		System.out.println("\ne) Number of names in the list: "+newArrayList.size());
		
	//f)
		//Iterator<String> its = newArrayList.iterator();
		System.out.println("\nf) Sorted list: ");
		Collections.sort(newArrayList);
		System.out.println("\nf) "+newArrayList);
	//g)
		System.out.println("\nRemove NineFour at position 7");
		String inputString = newArrayList.get(7);
		boolean removed = newArrayList.remove(inputString);
		
		if(removed)
			System.out.println("g) "+newArrayList);
		
	//h)
		newArrayList.add(0,"Sanata");
		System.out.println("h) "+newArrayList);
		
	//i)
		if(newArrayList.isEmpty())
			System.out.println("i) Array list is empty");
		else
			System.out.println("i) Not empty");
		newArrayList.clear();
		if(newArrayList.isEmpty())
			System.out.println("i) Array list is empty");
		else
			System.out.println("i) Not empty");
		
		boolean x = true;
		String name = null;//
		String other = "";
		/*name is not equal to null so false -- 
		 * !name.equal(other)
		 * name not equal to other == false, not of false is true so x = false
		 * */
		if ((name == null) ? (name != null) : !name.equals(other)) {
		        x =false;
		}
		/*
		 * String name = null;//
		 * String other = "";
		 * name = null is true then 
		 * (name != null) false
		 * output
		 * name: null
		 * x: true*/
		System.out.println("name: "+name);
		System.out.println("x: "+x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
		
	}
}
