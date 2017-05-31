package sheet12CustomerPizzaArray;

public class Test {
	public static void main(String[] args) {
	
		String[] topping1 = {"PineApple","RedPepper","Spinach","Pepperoni","Meatballs"};
		String[] topping2 = {"Mozzorella","jalapeno Peppers","Bacon","Chicken"};
		String[] topping3 = {"Onions", "Olives","Spinach","Pistachios", "Coriander","Basil","Smoked Gouda","Vension","Chorizo"};
		String[] topping4 = {"Mozzarella", "Pizza Sauce","Pepperoni","Sliced Black Olives"};
		String[] topping5 = {"Pepperoni","Italian Sausage","Ham","Bacon","Seasoned Pork","Beef"};
		String[] topping6 = {"Garlic","Parmesan", "Bacon", "Mushrooms","Spinch"};
		
		Pizza onePizza = new Pizza(topping1, PizzaSize.SIZE_7);
		Pizza twoPizza = new Pizza(topping2, PizzaSize.SIZE_9);
		Pizza threePizza = new Pizza(topping3, PizzaSize.SIZE_15);
		Pizza quesadillas12 = new Pizza(topping4, PizzaSize.SIZE_12);
		Pizza meatLovers15 = new Pizza(topping5, PizzaSize.SIZE_15);
		Pizza baconAlfredo12 = new Pizza(topping6, PizzaSize.SIZE_12);
		//onePizza.setDiameter(24);
		
		Pizza[] arrayOfPizza = {onePizza, twoPizza, threePizza};
		Customer newCustomer = new Customer("Hannibal Lecter","23 new Avenue Boston", "555-345-6789",arrayOfPizza);
		System.out.println(newCustomer.toString());
		System.out.println();
		Pizza[] pizzaTwoArray = {quesadillas12,meatLovers15,baconAlfredo12};
		Customer secondCustomer = new Customer();
		secondCustomer.setName("Dexter Morgan");
		secondCustomer.setaddress("2100 Seaview Road Miami");
		secondCustomer.setPhone("555-1234-696987");
		secondCustomer.setPizza(pizzaTwoArray);
		System.out.println(secondCustomer);
				
	}
}

