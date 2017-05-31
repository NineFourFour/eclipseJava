package sheet12CustomerPizzaArray;

public class Pizza {
	private String[] toppings;
	private PizzaSize pizzaSize;
	//private double price;
	
	public Pizza(){

	}
	public Pizza(String[] toppings, PizzaSize pizzaSize){
		this.toppings = toppings;
		this.pizzaSize = pizzaSize;
	}
	public void setToppings(String[] toppings){
		this.toppings = toppings;
	}
	public String[] getToppings(){
		return this.toppings;
	}
	public void setDiameter(int diameter){
		this.pizzaSize.diameter = diameter;
	}
	public int getDiameter(){
		return this.pizzaSize.getDiameter();
	}
	public double calculatePrice(){
		return this.pizzaSize.getPrice() + this.pizzaSize.getPricePerTopping() * this.toppings.length;
	
	}
	public void displayToppings(){
		System.out.println();
		for(String s: this.toppings){
			System.out.print(" "+s);
		}
	}
	public String toString(){
		String toppings = new String();
		for(String s: this.toppings){
			toppings += s+" ";
		}
		return "Size: "+this.pizzaSize.getDiameter()+" inch Base Price: €"+this.pizzaSize.getPrice()+" Price per Topping: €"+this.pizzaSize.getPricePerTopping()+"\n"+toppings+"\n\n";
	}
	/*public static void main(String[] args) {
		int ps = PizzaSize.SIZE_12.diameter;
		double ppt = PizzaSize.SIZE_12.pricePerTopping;
		System.out.print(ps+"\t"+ppt);
		String[] toppings = {"PineApple","RedPepper","Spinach","Pepperoni","Meatballs"};
		Pizza firstPizza = new Pizza(toppings,PizzaSize.SIZE_15);
		System.out.print("\n"+firstPizza.pizzaSize.price+"\t"+firstPizza.pizzaSize.diameter+"\t"+firstPizza.pizzaSize.pricePerTopping);
		System.out.print("\n"+firstPizza.calculatePrice());
		firstPizza.displayToppings();
		System.out.println("\n\n"+firstPizza.toString());
	}*/
}
