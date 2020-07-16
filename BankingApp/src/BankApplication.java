import java.util.Scanner;

public class BankApplication {
	//static userDataBase dataBase = new userDataBase();
	//function that will prompt the user for a customer name and customer Id and create a new user
	/*public static void userPrompt() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please provide you customer name: ");
			String customerName = scanner.next();
			System.out.println("Please provide you customer id: ");
			String customerId = scanner.next();
			dataBase.add(customerName, customerId);
			
	}*/
	
	public static void main(String[] args) {
		//userPrompt();
		BankAccount account = new BankAccount("Erick", "1");
		account.showMenu();
	}
	
	
}