package sheet12Xenum;



public class Order {
	private int orderNumber;
	public static int numberOfOrders;
	private Coffee[] coffees;
	
	public Order(){
		numberOfOrders++;
	}
	public Order(int orderNumber, Coffee[] coffees){
		numberOfOrders++;
		this.orderNumber = orderNumber;
		this.coffees = coffees;
	}
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Coffee[] getCoffees() {
		return coffees;
	}
	public void setCoffees(Coffee[] coffees) {
		this.coffees = coffees;
	}
	public double calculatePrice(){
		
		double cost = 0;
		for(Coffee c: coffees){
			
			cost += c.getPrice();
			
		}
		
		return cost;
	}
	public String toString(){
		String text = "Coffees: ";
		for(int i=0; i<coffees.length; i++){
			text+=coffees[i];
			if(i < coffees.length - 1)
				text += ", ";
			
		}

		return "\nOrder Number: "+this.orderNumber+"\n"+text+"\nCost: "+calculatePrice();
	}
}
