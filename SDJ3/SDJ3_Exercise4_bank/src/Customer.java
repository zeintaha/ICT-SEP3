
public class Customer {
	private String name;
	private String cpr;
	private Account account;

	public Customer(String name, String cpr, Account account) {
		this.name = name;
		this.cpr = cpr;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public String getCpr() {
		return cpr;
	}

	public void setCpr(String cpr) {
		this.cpr = cpr;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String toString() {
		return "Customer [Name =" + name + ", CPR=" + cpr + ", Account Details=" + account.toString() + "]";
	}

}
