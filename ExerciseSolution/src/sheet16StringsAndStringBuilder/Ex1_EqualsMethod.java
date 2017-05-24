package sheet16StringsAndStringBuilder;

public class Ex1_EqualsMethod {
	public static void main(String[] args) {
		
		String strA = "Monday";
		String strB = new String("Monday");
		
		String strC = "Tuesday";
		String strD = strC;
		
		String strE = new String("Tuesday");
		/*a) using == show that strA and strB do not refer to the same object*/
		System.out.println("\n\ta) "+(strA == strB));
		/*b) using == show that strC and strD do refer to the same object*/
		System.out.println("\tb) "+(strC == strD));
		/*c) Using .eguals() show that strA and strB contain the same letters 
		 * AND strC and strD contain the same letters
		 **/
		System.out.println("\tc) "+(strA.equals(strB)));
		System.out.println("\t"+(strC.equals(strD)));
		/*d)Using == show that strD and strE do not refer to the same object*/
		System.out.println("\td)"+(strD == strE));
	}
}
