package sheet8BankAccount;

//import sheet4Arrays.Ex3SumOfTwoArrays;

public class BankAccount {
	private String name;
	private String address;
	private int accountNumber;
	private double balance;
	
	private static final double interestRate = 7;
	public static int numberOfAccounts = 0;
	public static int accountNum = 40005100;
	
/*
 *  default constructor has the same access modifier as the class has no-arguments constructor
 *
 * */
	/*no-args constructor, accountNum and numberOfAccounts are incremented every time an object is created*/
	private BankAccount(){	
		accountNum++;
		numberOfAccounts++;
	}
	public BankAccount(double despoit){
		this();
		this.balance = despoit;
	}
	public BankAccount(String name, String address){
		this();
		this.accountNumber = accountNum;
		this.balance = 0;
		this.name = name;
		this.address = address;
	}
	public BankAccount(String name, String address, double balance){
		this();
		this.accountNumber = accountNum;
		this.balance = balance;
		this.name = name;
		this.address = address;
	}
	
	public int getAccountNumber(){
		return this.accountNumber;
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
	
	public double depositMoney(double deposit){
		if(deposit < 0)
			System.out.println("Invalid amount");
		else
			this.balance += deposit;
		return this.balance;
	}
	public void withdrawMoney(double withdraw){
		if(withdraw > this.balance)
			System.out.println("Insurfficient  funds");
		else
			this.balance-= withdraw;
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
