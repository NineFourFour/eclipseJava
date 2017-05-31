package sheet17ArrayLists;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
	//b)	
		Trainee t = new Trainee("NineFour", "94 main st", LocalDate.now());
		Trainee t1 = new Trainee("NineFour", "94 main st", LocalDate.now());
		Trainee t2 = new Trainee("Tom", "95 main st", LocalDate.of(1970, Month.APRIL, 2));
		Trainee t3 = new Trainee("Sarah", "96 main st", LocalDate.of(1971, Month.AUGUST, 5));
		Trainee t4 = new Trainee("James", "97 main st", LocalDate.of(1972, Month.DECEMBER, 19));
		
	//c)
		ArrayList<Trainee> listArray = new ArrayList<>();
		Trainee[] tArray = {t, t2, t3, t4}; 
		listArray.addAll(Arrays.asList(tArray));
		System.out.println(listArray);
	
	//d)
		
		if(listArray.contains(t1))
			System.out.println("\n\nd) Equals is overriden\n");
		else
			System.out.println("Equals() is wrong");
		
	//e)
		System.out.println("\ne) change the address of element 3: \n"+listArray);
		Trainee tChange = listArray.get(3);
		//System.out.println("\n\n"+tChange);
		tChange.setAddress("24 bird road");
		//System.out.println("\n\n"+tChange);
		System.out.println(listArray);
	//f)
		Scanner input = new Scanner(System.in);
		System.out.println("\n\nEnter a name on the list: ");
		String inputString = input.next();
		//System.out.println("#4 iterator");
		/*Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		int count = 0;
		for(int i=0; i<listArray.size(); i++){
			
			Trainee tFor = listArray.get(i);
			if(tFor.getName().equals(inputString)){
				System.out.println("\nAddress: "+tFor.getAddress());
				count --;
			}
			count++;
			
		}
		if(count == listArray.size())
			System.out.println("\nName not Found");
		
		System.out.println("\n"+listArray);
	
	//g)remove the trainee from part (f)
	
	
		for(int i=0; i<listArray.size(); i++){
			
			Trainee tFor = listArray.get(i);
			if(tFor.getName().equals(inputString)){
				int index = listArray.indexOf(tFor);
				listArray.remove(index);
			}
			
		}
		
		System.out.println("\ng) Removed element found in array\n"+listArray);
	
		
		
		
		input.close();
	}
}
