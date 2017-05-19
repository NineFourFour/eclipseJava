package sheet8BankAccount;

//import sheet4Arrays.Ex3SumOfTwoArrays;

public class BankAccount {
	String name;
	String address;
	int accountNumber;
	double balance;
	
	static double interestRate = 7;
	static int numberOfAccounts = 0;
	static int accountNum = 40005100;
	
/*default constructor has the same access modifier as the class
 * 					  has no arguments
 * 					  includes a no-arg call to the super constructor, super()*/
	public BankAccount(){
		super();
		accountNum++;
		numberOfAccounts++;
	}
	public BankAccount(double despoit){
		this();
		this.balance = despoit;
	}
	public BankAccount(String name, String address, double balance){
		accountNum++;
		numberOfAccounts++;
		this.accountNumber = accountNum;
		this.balance = balance;
		this.name = name;
		this.address = address;
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	
	public void depositMoney(double deposit){
		this.balance += deposit;
	}
	public void withdrawMoney(double withdraw){
		this.balance = this.balance - withdraw;
	}
	
	public void addInterest(){
		this.balance = this.balance + (this.balance*(interestRate/100));
		
	}
	public double withdrawAll(){
		double withdraw = this.balance;
		this.balance  = 0;
		return withdraw;
	}
	public String toString(){
		return ""+this.name+" "+this.address+" "+this.balance+" "+this.accountNumber;
		
	}
		
	
}
