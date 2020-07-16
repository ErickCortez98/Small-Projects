import java.util.Scanner;

class BankAccount {
	float balance;
	float previousTransaction;//last amount withdrawn or deposited
	String customerName;
	String customerId;
	
	
	BankAccount(String cname, String cid){
		customerName = cname;
		customerId = cid;
	}
	
	void deposit(float amount) {
		//checking amount to not be 0
		if(amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdrawal(float amount) {
		//checking amount to not be 0
		if(amount > 0) {
			balance = balance - amount;
			previousTransaction = - amount;
		}
	}
	
	void getPreviousTransaction() {
		if(previousTransaction > 0) {
			System.out.println("Previous transaction is a deposit of: "+ previousTransaction);
		}else if(previousTransaction < 0) {
			System.out.println("Previous transaction is a withdrawal of " + Math.abs(previousTransaction));
		}else {
			System.out.println("No previous transaction in record");
		}
	}
	
	void showMenu() {
		char option = '\0'; 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID: " + customerId);
		System.out.println("A -  Check Balance");
		System.out.println("B -  Deposit");
		System.out.println("C -  Withdraw");
		System.out.println("D -  Previous Transacion");
		System.out.println("E -  Exit");
		
		while(option != 'E'){
			System.out.println("=======================================");
			System.out.println("Enter an option: ");
			option = scanner.next().charAt(0);
			System.out.println("=======================================");
			
			switch(option) {
				case 'A':
					//printing out the current balance
					System.out.println("Current Balance: " + balance);
					System.out.println("\n");
					break;
				case 'B':
					//getting amount to be deposited and changing the balance
					System.out.println("Amount to be deposited: ");
					deposit(scanner.nextFloat());
					//displaying current balance 
					System.out.println("Current balance after deposit: " + balance);
					break;
				case 'C':
					System.out.println("Amount to be withdrawn: ");
					withdrawal(scanner.nextFloat());
					//displaying current balance 
					System.out.println("Current balance after deposit: " + balance);
					break;
				case 'D':
					getPreviousTransaction();
					break;
				case 'E':
					System.out.println("Exiting bank account application");
					break;
				default:
					System.out.println("Not a valid option, please retry");
					break;
			}
		}
			
		
	}
	
}
