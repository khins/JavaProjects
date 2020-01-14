// Fig. 3.1 Account.java
// Account class that contains a name instance variable and methods to set and get its value
// adds Account class with a double instance variable balance and a constructor and deposit method that perform validation
public class Account {
	private String name; 
	private Double balance;
	
	public Account(String name, Double balance) {
		this.name = name;
		if (balance > 0.0)
			this.balance = balance;
		else
			this.balance = 0.0;
	}
	
	public void deposit(Double depoistAmount) {
		if (depoistAmount > 0.0)
			this.balance = this.balance + depoistAmount;
	}
	
	public Double getBalance() {
		return this.balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name; 
	}
}
