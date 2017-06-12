package sheet16StringsAndStringBuilder;

import java.util.Scanner;

public class Ex1_EqualsMethod {
	public static void main(String[] args) {
		
		String strA = "Monday";
		String strB = new String("Monday");
		
		String strC = "Tuesday";
		String strD = strC;
		
		String strE = new String("Tuesday");
		System.out.println("\n\tExercise1\n\n\tString strA = \"Monday\"\n\tString strB = new String(\"Monday\");"
				+ "\n\tString strC = \"Tuesday\";\n\tString strD = strC;\n\tString strE = new String(\"Tuesday\");");
		
		
		String strF = "Mon"+"day";
		
		
		
		
		/*a) using == show that strA and strB do not refer to the same object*/
		System.out.println("\n\ta)strA == strB\t"+(strA == strB)+"\n");
		
		/*b) using == show that strC and strD do refer to the same object*/
		System.out.println("\tb)strC == strD\t"+(strC == strD)+"\n");
		
		/*c) Using .eguals() show that strA and strB contain the same letters 
		 * AND strC and strD contain the same letters
		 **/
		System.out.println("\tc)strA.equals(strB)\t"+(strA.equals(strB))+"\n");
		System.out.println("\tc.1)strC.equals(strD)\t"+(strC.equals(strD))+"\n");
		
		/*d)Using == show that strD and strE do not refer to the same object*/
		System.out.println("\td)strD == strE\t"+(strD == strE)+"\n");
		
		/*f) Test to see if c and d contain the same letters*/
		System.out.println("\tf)strC.equals(strD)\t"+strC.equals(strD)+"\n");
		
		//g)
		/*see if f is equivalent to strA or strB*/
		System.out.println("\tg) strF == strA: "+ (strF == strA));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
