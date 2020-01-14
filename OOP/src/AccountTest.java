// Creating and manipulating an Account object
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account("jim brown");
		System.out.printf("initial name is %s%n%n", myAccount.getName());
		
		System.out.println("Please enter a name: ");
		
		String theName = input.nextLine();
		
		myAccount.setName(theName);
		
		System.out.printf("Name in object myAccount is: %s%n%n", myAccount.getName());
		
		

	}

}
