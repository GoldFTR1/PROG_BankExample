
public class CheckingAccount extends MainAccount {

	private int transactionnumber;
	private double fee;

	public CheckingAccount(double balance, String owner, int transactionnumber, double fee) {
		super(balance, owner);
		this.transactionnumber = transactionnumber;
		this.fee = fee;
	}

	@Override
	public void withdraw(double sumtowithdraw) {
		// TODO Auto-generated method stub
		double balance = super.getBalance();
		if (sumtowithdraw > balance) {
			System.out.println("Insuficient funds");
		} else {
			if (transactionnumber > 10) {
				balance -= sumtowithdraw;
				balance -= fee;

			} else {
				balance -= sumtowithdraw;

			}

		}
		super.setBalance(balance);

	}

	public int getTransactionnumber() {
		return transactionnumber;
	}

	public void setTransactionnumber(int transactionnumber) {
		this.transactionnumber = transactionnumber;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
