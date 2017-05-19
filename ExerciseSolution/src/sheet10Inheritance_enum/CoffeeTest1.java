package sheet10Inheritance_enum;

public class CoffeeTest1 {
	public static void main(String[] args) {
		Coffee drink = new Coffee();
		drink.size = CoffeeSize.EVENBIGGER;
		System.out.printf("\n\tCoffee size drink = %s", drink.size);
	}
}
