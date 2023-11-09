
public class MainAccount {

	private double balance;
	private String owner;

	public MainAccount(double balance, String owner) {
		super();
		this.balance = balance;
		this.owner = owner;
	}

	public MainAccount() {
	}

	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void withdraw(double sumtowithdraw) {
		// TODO Auto-generated method stub
		balance -= sumtowithdraw;

	}

	public void TopUp() {
		// TODO Auto-generated method stub

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
