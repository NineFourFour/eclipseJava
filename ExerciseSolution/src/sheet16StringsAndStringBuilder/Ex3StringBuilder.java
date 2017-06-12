package sheet16StringsAndStringBuilder;

public class Ex3StringBuilder {
	public static void main(String[] args) {
		System.out.println("\n\n\n\tExercise3\n");
		
		
		System.out.println("\n\tRepeat the previous ‘Update the Menu’ exercise but use a StringBuilder instead of a string. "
				+ "\n\tSome method calls will need changing as String and StringBuilder do not have the same methods.");
		
		//a)
			String todayMenu1 = "Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
			StringBuilder sb = new StringBuilder(todayMenu1);
			sb.replace(0, 9, "Thursday");
			System.out.println("\n\ta)"+sb);
		//b)
			/*first occurrence of Beef*/
			sb.replace(23,29, "Beef");
			/*second*/
			sb.replace(42,48, "Beef");
			System.out.println("\n\tb)"+sb);
		//c)
			//sb.deleteCharAt(81);
			/*no need to delete the "dot" after "day" in the string, just over write it*/
			sb.insert(81,", Jelly and IceCream For Desert");
			System.out.println("\n\tc)"+sb);
		//d)
			/*remove "and IceCream" from the string and replace with a space */
			sb.replace(88,101, "");
			System.out.println("\n\td)"+sb);
			
			todayMenu1 = sb.toString();
			
			System.out.println("\n\tsb.toString():\n\t"+todayMenu1);
	}
}
