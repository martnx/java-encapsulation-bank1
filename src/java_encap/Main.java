package java_encap;
import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	static AccountDatabase database = new AccountDatabase();
	public static void main(String[] args) {
		
		BankAccount bank = new BankAccount(null, 0, 0);
		System.out.print("Welcome of the Bank of the Java");
		System.out.println("\n1. Check Balance\n2. Deposit Balance \n3. Withdraw balance\n");
		
		System.out.print("Enter Number: ");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1: checkBalance(); break;
		case 2: depositBalance(); break;
		case 3: withdrawBalance(); break;
		
		}
		
	}

	public static void checkBalance() {
		database.checkBalance();
	}

	private static void depositBalance() {
		System.out.println("Deposit Balance");
		System.out.print("Enter amount to deposit: ");
		int amount = scan.nextInt();
		if(amount >= 0) {
			int newBalance = database.depositBalance(amount);
			System.out.println("Deposit successfully New Balance: " + newBalance);
			
		}else {
			System.out.println("Enter valid input");
		}
		
	}
	
	private static void withdrawBalance() {
		System.out.println("Withdraw Balance");
		System.out.print("Enter amount to withdraw: ");
		int amount = scan.nextInt();
		
		int newBalance = database.withdrawBalance(amount);
		System.out.println("Withdraw successfully new balance: " + newBalance);			
		
		
	}

}
