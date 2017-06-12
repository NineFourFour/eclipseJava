package sheet16StringsAndStringBuilder;

public class Ex2replace {
	public static void main(String[] args) {
		System.out.println("\n\tExercise2\n");
		System.out.println("\n\tString todayMenu = \"Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.\"");
		System.out.println("\n\ta)	Using method from the string class, change ‘Wednesday’ to ‘Thursday’. Print the new string.\n"
				+ "\tb)	Change ‘turkey’ to ‘beef’ and print the new string.\n"
				+ "\tc)	Now add the following to the end of the menu: “Jelly and ice cream for dessert”.\n"
				+ "\td)	The ice cream is all gone, so the end of the string should now read: Jelly for dessert.");

		
		
		String todayMenu = "Wednesday’s Menu: Roast turkey with homemade turkey gravy, potatoes and veg of the day.";
		
		todayMenu = todayMenu.replace("Wednesday", "Thursday");
		System.out.print("\n\ta)"+todayMenu);
		todayMenu = todayMenu.replace("turkey", "Beef");
		System.out.print("\n\tb)"+todayMenu);
		todayMenu = todayMenu.replace('.', ',');
		todayMenu = todayMenu+" Jelly and Ice Cream for Desert";
		System.out.print("\n\tc)"+todayMenu);
		todayMenu = todayMenu.replace(" and Ice Cream", "");
		System.out.print("\n\td)"+todayMenu);
		
		Integer x = 7;
		int y = 2;
		
		System.out.println("\n\n"+(x *= x));
		System.out.println(y*=y);
		System.out.println(y*=y);
		System.out.println(x-=y);
		
		
	}
}
