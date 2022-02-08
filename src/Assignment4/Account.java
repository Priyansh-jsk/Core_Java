package Assignment4;

public class Account extends Thread {
	double amount = 1000;

	Account(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void withdraw(double withdrawAmt) {
		Thread t = Thread.currentThread();
		if (getAmount() >= withdrawAmt) {
			System.out.println("Account balance in Withdraw time of " + t.getName() + " is " + getAmount());
			amount = getAmount() - withdrawAmt;
			System.out.println(withdrawAmt + " Amount debited by " + t.getName() + " and current amount is " + getAmount());
		} else {
			System.out.println(" No more amount balance left for " + t.getName());
		}
	}
}