package sheet12Xenum;

public class Test {
	
	public static void main(String[] args) {
		
		Coffee[] coffees = {Coffee.AMERICANO,Coffee.FLAT_WHITE, Coffee.CAPPUCCINO};
		Order newOrder = new Order(1234, coffees);
		
		Coffee[] coffee1 ={Coffee.SKINNY_LATTE, Coffee.MOCHA};
		Order order2 = new Order(3456, coffee1);
		
		Order order3 = new Order(4567, new Coffee[]{Coffee.ESPRESSO,Coffee.AMERICANO,Coffee.CAPPUCCINO});
		
		System.out.printf("\nNumber of Orders: %d\n%s\n", Order.numberOfOrders, newOrder);
		System.out.println(order2+"\n");
		System.out.println(order3);

	}
}
