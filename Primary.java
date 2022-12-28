package banking;

public class Primary {

	public static void main(String[] args) {
		bankaccount Al = new bankaccount("Al");
		Al.deposit(1000.00);
		bankaccount Dillon = new bankaccount("Dillon");
		Dillon.deposit(600.00);
		Al.transfer(250.00, Dillon);
		Dillon.withdraw(150);
		Dillon.withdraw(900);
		System.out.println(Dillon.getBalance());
	}

}
