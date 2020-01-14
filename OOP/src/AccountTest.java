// Creating and manipulating an Account object
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		//	Using the Account constructor to initialize the name instance variable when each Account object is created
		Account account1 = new Account("John Doe");
		Account account2 = new Account("Jane Dough");
		
		System.out.printf("Account1 is: %s%n", account1.getName());
		System.out.printf("Account2 is: %s%n", account2.getName()); 
		
		

	}

}
