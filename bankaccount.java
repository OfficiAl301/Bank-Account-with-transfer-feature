package banking;

public class bankaccount {
		private double balance;
		private String name;
		public bankaccount(String name) {
			this.name = name;
			balance = 0.0; 
		
	}
public double getBalance() {
return balance;

}
public String getName() {
return name;	

}
public void deposit(double amount) {
	balance += amount;
	System.out.println(name + " has $" + balance);
}

public void withdraw(double amount) {
	if (amount <= balance) {
		balance -= amount;
		System.out.println(name + " has $" + balance);
	}
	else {
		System.out.println("Withdrawal by " + name + " failed");
	}
}
public void transfer(double amount, bankaccount acc) {
if (this.balance < amount) {
	System.out.println("Transfer failed");
}
else {
	this.balance -= amount;
	acc.balance += amount;
	System.out.println("Account of " + this.name + " is now $" + this.balance);
	System.out.println("Account of " + acc.name + " is now $" + acc.balance);
}


}
}