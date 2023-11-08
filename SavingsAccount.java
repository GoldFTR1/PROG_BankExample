
public class SavingsAccount extends MainAccount {

	double interestrate;
	double time;

	public SavingsAccount(double balance, String owner, double interestrate, double time) {
		super(balance, owner);
		this.interestrate = interestrate;
		this.time = time;
	}

	public void interest() {
		// if x time has passed, balance+=interestrate*balance/100;
	}

}
