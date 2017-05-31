package sheet12CustomerPizzaArray;


public enum PizzaSize {
	
	SIZE_7(7,5,1.0),
	SIZE_9(9,7,1.2),
	SIZE_12(12,9,1.4),
	SIZE_15(15,12,1.6);
	
	int diameter;
	private int price;
	private double pricePerTopping;
	
	PizzaSize(int diameter, int price, double pricePerTopping){
		this.diameter = diameter;
		this.price = price;
		this.pricePerTopping = pricePerTopping;
	}
	public int getDiameter(){
		return this.diameter;
	}
	public int getPrice(){
		return this.price;
	}
	public double getPricePerTopping(){
		return this.pricePerTopping;
	}


}
