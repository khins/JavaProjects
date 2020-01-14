// Creating and manipulating an Account object
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		//	Using the Account constructor to initialize the name instance variable when each Account object is created
		Account account1 = new Account("John Doe", 50.00);
		Account account2 = new Account("Jane Dough", -7.53);
		
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n", account1.getName(), account2.getBalance());
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: ");
		double depoistAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depoistAmount);
		account1.deposit(depoistAmount);
		
		//display balances
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: ");
		depoistAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depoistAmount);
		account2.deposit(depoistAmount);
		
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
	}

}
