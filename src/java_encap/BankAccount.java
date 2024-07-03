package java_encap;

public class BankAccount {
	
	private String accountHolder;
	private double balance;
	private int accountNumber;
	
	BankAccount(){
		
	}
	//Need to complete the details. Because doesn't allowed them
	BankAccount(String accountHolder,
				int balance,
				int accountNumber){
		
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.accountNumber = accountNumber;
		
			
	}
	//Setter method
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
		
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//Getters method
	public String getAccountHolder() {
		return accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
}
