package sheet10Inheritance_enum;


public class CoffeeTest2 {
	public static void main(String[] args) {
		Coffee2 cup = new Coffee2();
		cup.size = Coffee2.CoffeeSize1.EVENMOREMILK;// enclosed class name required
		System.out.printf("Inside the class, cup.size = Coffee2.CoffeeSize1 : %s",cup.size);
	}
	
	
}
