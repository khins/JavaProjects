// Prefix increment and postfix increment operators
public class Increment {

	public static void main(String[] args) {
		
		int c = 5; 
		System.out.printf("c before post increment: %d%n", c);
		System.out.printf("  postincrementing: %d%n", c++);
		System.out.printf(" c after postincrementing: %d%n", c);
		
		System.out.println();
		
		c = 5; 
		
		System.out.printf("c before preincrement: %d%n", c);
		System.out.printf("  preincrementing: %d%n", ++c);
		System.out.printf(" c after preincrementing: %d%n", c);
	}

}
