package sheet8BankAccount;


public class BankAccountTest {
	
	public static void main(String[] args) {

		BankAccount one = new BankAccount();
		System.out.printf("\n\tBankAccount : %s", one.toString());
		System.out.printf("\n\tBankAccount number : %d", BankAccount.numberOfAccounts);//access static variable outside class
		System.out.printf("\n\tBankAccountOne number : %d", BankAccount.accountNum);
		one.setAccountNumber(BankAccount.accountNum);
		
		BankAccount two = new BankAccount(12345.90);
		System.out.printf("\n\n");
		two.setAccountNumber(BankAccount.accountNum);
		System.out.printf("\n\tBankAccount number : %d", BankAccount.numberOfAccounts);
		System.out.printf("\n\tAccount balance: %.2f", two.getBalance());
		two.addInterest();
		System.out.printf("\n\tNew balance: %.2f", two.getBalance());
		two.depositMoney(234);
		System.out.printf("\n\tNew balance: %.2f", two.getBalance());
		two.withdrawMoney(34);
		System.out.printf("\n\tNew balance: %.2f", two.getBalance());
		System.out.printf("\n\tBankAccountOne number : %d", one.getAccountNumber());
		System.out.printf("\n\tBankAccountTwo number : %d", two.getAccountNumber());
		System.out.printf("\n\n");
		
		BankAccount three = new BankAccount();
		System.out.printf("\n\tBankAccount number : %d", BankAccount.numberOfAccounts);
		three.setAccountNumber(BankAccount.accountNum);
		three.setName("James");
		three.setBalance(5678);
		System.out.printf("\n\tBankAccountThree number : %d", three.getAccountNumber());
		String s =three.toString();
		System.out.printf("\n\tBankAccountThree : %s", s);
		System.out.printf("\n\nNew Bank Account declared with 3 parameters\n");
		
		BankAccount four = new BankAccount("NineFour", "94 WoodLawn", 949494);
		System.out.printf("\n\tBankAccount number : %d", BankAccount.numberOfAccounts);
		String fourth = four.toString();
		System.out.printf("\n\tBankAccountFour toString : %s\n", fourth);
		String nameFour = four.getName();
		System.out.printf("\n\tBankAccountFour getName : %s", nameFour);
		four.setAddress("45 See More Inn");
		System.out.printf("\n\tBankAccountFour setAddress : %s", four.getAddress());
		four.addInterest();
		System.out.printf("\n\tBankAccountFour AddInterest New balance: %.2f", four.getBalance());
		four.depositMoney(1234);
		System.out.printf("\n\tBankAccountFour: DepositMoney 1234: New balance: %.2f", four.getBalance());
		four.withdrawMoney(1234);
		System.out.printf("\n\tBankAccountFour: WithdrawMoney 1234: New balance: %.2f", four.getBalance());
		double withdrawAll  = four.withdrawAll();
		System.out.printf("\n\tBankAccountFour	 WithdrawAll: %.2f, New balance: %.2f", withdrawAll, four.getBalance());
		fourth = four.toString();
		System.out.printf("\nFour toString : %s\n", fourth);
		
		BankAccount five = new BankAccount(34_000);
		System.out.printf("\n\tBankAccountFiv initiated with deposit of 34,000");
		five.setName("Hannibal");
		System.out.printf("\n\tBankAccountFour setName : %s", five.getName());
		five.setAddress("45 See More Inn");
		System.out.printf("\n\tBankAccountFour setAddress : %s", five.getAddress());
		five.addInterest();
		System.out.printf("\n\tBankAccountFour AddInterest New balance: %.2f", five.getBalance());
		five.depositMoney(1234);
		System.out.printf("\n\tBankAccountFour: DepositMoney 1234: New balance: %.2f", five.getBalance());
		five.withdrawMoney(1234);
		System.out.printf("\n\tBankAccountFour: WithdrawMoney 1234: New balance: %.2f", five.getBalance());
		withdrawAll  = five.withdrawAll();
		System.out.printf("\n\tBankAccountFour	 WithdrawAll: %.2f, New balance: %.2f", withdrawAll, five.getBalance());
		String fifth = five.toString();
		System.out.printf("\nFive toString : %s\n", fifth);
		System.out.printf("\nFive toString : %s\n", fifth);
	}
}
