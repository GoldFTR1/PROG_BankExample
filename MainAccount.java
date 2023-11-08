
public class MainAccount implements Account {

	private double balance;
	private String owner;

	public MainAccount(double balance, String owner) {
		super();
		this.balance = balance;
		this.owner = owner;
	}

	public MainAccount() {
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void withdraw(double sumtowithdraw) {
		// TODO Auto-generated method stub
		balance -= sumtowithdraw;

	}

	@Override
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
