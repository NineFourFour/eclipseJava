package sheet11InheritancePayroll;

public abstract class Fruit {
	int product;
	public Fruit(int product){
		this.product = product;
	}
	public int getProduct(){
		return this.product;
	}
	
}
class Apple extends Fruit{
	public Apple(){
		super(5);
	}
}
class Orange extends Fruit{
	String color;
	public Orange(int product, String color){
		super(product);
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}




