
//<Md.> <Mashrafi>
//Rubin
//Kayli
//APCS1 pd<p>

//HW<9> -- <Bank Account>

//<2017>-<10>-<2>    

public class BankAccount {

	public String acctHolderName; // Needs to be a String as it is a series of chars
	public long acctNumber;	// Needs to be long b/c it is a 9-digit number, which goes beyond capacities of an integer	
	public double acctBalance; // Needs to be a double b/c it has a floating-point, and using float would give us an error, so double was our only option
	private short acctPIN;    // Doesn't have to be short, but is most effective as it is only 4-digits and falls within the boundaries of a short
	private String acctPassword; // Needs to be a String as it is a series of chars
	

	public BankAccount() {
		acctHolderName = "John Doe";
		acctNumber = 123456789L;
		acctBalance = 50.00;
		acctPIN = 1234;
		acctPassword = "lettuce";
		System.out.println("Default values set! Use appropriate methods to change them.");
	}
	// Here we have a default constructor, that gives the bank account a generic name and password, and the rest of the details as well

	public BankAccount(String name, String password, short PIN, long accountNumber) {
		acctHolderName = name;
		acctPassword = password;
		acctBalance = 50.00;
		acctPIN = PIN;
		acctNumber = accountNumber;
	}
	// The overloaded ones take in a name, password, and PIN parameter, allowing the user to choose those elements when making their BankAccount


	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		// Possible to create an object of a class within its own class file - important note			

		System.out.println(bank.printInfo());

		bank.changeName("21 Savage");
		System.out.println(bank.printInfo());

		bank.changeAccountNumber(192381913L);
		System.out.println(bank.printInfo());	

		bank.changePassword("hehexd");
		System.out.println("New Password: " + bank.acctPassword);

		bank.changePIN((short)1183);
		System.out.println("New PIN: " + bank.acctPIN);

		// Above code equivalent to this line :
		// BankAccount bank = new BankAccount("21 Savage","hehexd", 1183, 192381913L);
		// Overloaded constructor use is optional if one knows what they want their values to be set when they make the BankAccount object
	
		System.out.println(bank.depositCash(150.00));
		System.out.println(bank.withdrawCash(400.00));

		System.out.println(bank.withdrawCash(100.00));	

		System.out.println(bank.depositCash(-10.00));
		System.out.println(bank.depositCash(10.18));

		bank.changePIN((short)1183);
		System.out.println("New PIN: " + bank.acctPIN);

	} 

	// Our main method banks out and prints the output of the various methods used to change the attributes of instance variables, which are written below


	public String printInfo() {
		return acctHolderName + "\n" + acctBalance + "\n" + acctNumber + "\n";
	}
	
	// Our printInfo() method only returns the name, balance, and acctNumber becaues it wouldn't make sense for it to return "sensitive" info like a password or PIN


	public String depositCash(double cash) {
		if (cash > 0){
			acctBalance += cash;
			return cash + " has been deposited. \nYour new balance is " + acctBalance + "\n";
		} else { 
			return "Cannot deposit that amount, " + cash + "\n";
		}
	}
		
	public String withdrawCash(double cash) {
		if (cash <= acctBalance) {
			acctBalance -= cash;
			return cash + " has been withdrawn. \nYour new balance is " + acctBalance + "\n";
		}else {
			return "Cannot withdraw that much, " + cash + "\n";
		}
	}

	// We make our methods return Strings instead of booleans because it's easier for the user to see whether their amount was deposited, and is more informative
	// than a "True" or "False" just printing out.


	public void changeName(String name) {
		acctHolderName = name;	
	}

	public void changePIN(short PIN) {
		acctPIN = PIN;
	}
	
	public void changePassword(String password) {
		acctPassword = password;
	}
	
	public void changeAccountNumber(long accountNumber) {
		acctNumber = accountNumber;
	}

	// These are all void because they all simply modify a value, and the variables can easily be checked afterwards by printing them individually or by the printInfo()
	// method.
}
