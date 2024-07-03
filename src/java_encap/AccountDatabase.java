package java_encap;

public class AccountDatabase {
	
	String name;
	int accountNumber;
	double balance;
	
	AccountDatabase(){
		
		BankAccount bank = new BankAccount(null, 0, 0);
		
		bank.setAccountHolder("Martin Legaspi");
		bank.setAccountNumber(420);
		bank.setBalance(1000.00);

		name = bank.getAccountHolder();
		balance = bank.getBalance();
		accountNumber = bank.getAccountNumber();
		
	}
	public void checkBalance() {
		System.out.println("Name: " + name);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
	public int depositBalance(int amount) {
		amount += balance;
		return amount;
	}
	
	public int withdrawBalance(int amount) {
		
		int newBalance = (int) this.balance;
		amount = newBalance -= amount;
		System.out.println("NEW BALANCE : " + amount);
		return amount;
	}
	
}
	
	
	
	
