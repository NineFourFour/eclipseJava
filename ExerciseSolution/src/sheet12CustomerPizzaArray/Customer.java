package sheet12CustomerPizzaArray;

public class Customer {
	String name;
	String address;
	String phone;
	Pizza[] pizzas;
	//double totalCost;
	
	public Customer(){
		super();
	}
	public Customer(String name, String address, String phone, Pizza[] pizza){
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pizzas = pizza;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setaddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return this.phone;
	}
	public void setPizza(Pizza[] pizza){
		this.pizzas = pizza;
	}
	public Pizza[] getPizza(){
		return this.pizzas;
	}
	public double getTotalCost(){
		double totalCost = 0.0;
		for(Pizza p: this.pizzas){
			totalCost += p.calculatePrice();
		}
		return totalCost;
	}
	public String toString(){
		String pToString = new String();
		for(Pizza p: this.pizzas){
			
			pToString += p.toString();
		}
		return "Customer\nName: "+getName()+"\nAddress: "+getAddress()+"\nPhone: "+getPhone()+"\n\n"+pToString+"\nTotal: €"+getTotalCost();
	}

}
