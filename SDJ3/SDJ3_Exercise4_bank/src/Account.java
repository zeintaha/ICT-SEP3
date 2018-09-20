
public class Account {
	private String currency;
	private double balance;
	private long accountNumber;

	public Account(String currency, double balance, long accountNumber) {
		this.currency = currency;
		this.balance = balance;
		this.accountNumber = accountNumber;

	}

	public String getCurrency() {
		return currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void deposite(double amount, String currency) {

		if (currency.equals(this.currency)) {

			this.balance += amount;
		}

	}

	public void withdraw(double amount, String currency) {

		if (currency.equals(this.currency)) {

			this.balance -= amount;
		}

	}

	public void transfer(Customer toCustomer, double amount, String currency) {

		if (currency.equals(this.currency)) {

			this.balance -= amount;
			toCustomer.getAccount().balance += amount;

		}

	}

	public String toString() {
		return "[Currency=" + currency + ", Balance=" + balance + ", Number=" + accountNumber + "]";
	}

}
