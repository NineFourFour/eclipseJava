package sheet12Xenum;

public enum Coffee {

	AMERICANO(2.50),
	FLAT_WHITE(2.75),
	LATTE(2.75),
	SKINNY_LATTE(2.75),
	MOCHA(2.90),
	CAPPUCCINO(2.90),
	ESPRESSO(2.00);
	
	private double price;
	
	Coffee(double price){
		this.price = price;
	}
	public double getPrice(){
		return this.price;
	}
}
