import java.util.Scanner;

public class Email {
	//private variables to maintain encapsulation
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int defaultPasswordLength = 10;
	private String email;
	private String companySuffix = "compania.com";
	
	//Constructor will need first name and last name
	public Email (String firstName, String lastName){
		this.firstName	= firstName;
		this.lastName = lastName;
		
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call a method asking for department - it'll return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is:" + this.password);
	
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
		//System.out.println("You email is: " + email);
	}
	
	//Ask for department
	private String setDepartment() {
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Department codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code:");
		int department = scanner1.nextInt();
		scanner1.close();
		switch(department) {
			case 1:
				return "Sales";
			case 2: 
				return "Development";
			case 3:
				return "Accounting";
			default:
				return "";
		}		
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand); 
		}
		return new String (password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCap(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//get mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	//get alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Name: " + firstName + " " + lastName + " Company email: " + email + "Mailbox Capacity: " + mailboxCapacity + " mb";
	}
	
}
