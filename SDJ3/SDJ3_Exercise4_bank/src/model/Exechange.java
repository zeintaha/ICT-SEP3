package model;

import java.io.Serializable;
import java.util.Hashtable;

public class Exechange implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	// we are assuming that the local currency which will be the base for other
	// currencies is kr and its value will be 1 always
	static Hashtable<String, Double> currencies = new Hashtable<String, Double>();

	public void setExechange(double value1, double value2, double value3) {

		this.currencies.put("dollar", value1);
		this.currencies.put("euro", value2);
		this.currencies.put("kr", value3);

	}

	public double getDollarValue() {

		Object value = currencies.get("dollar");
		double num = (double) value;
		System.out.println(currencies.size());
		return num;

	}

	public double getEuroValue() {
		Object number = currencies.get("euro");
		double num = (double) number;
		return num;
	}

	public double exechangeTheCurrencyDeposite(Account account, double amount, String currency) {

		double x = 0;
		if (currency.equalsIgnoreCase("dollar")) {

			x = getDollarValue();
			System.out.println(" the value of x is " + x);
			return amount * x;

		} else if (currency.equalsIgnoreCase("euro")) {

			x = (double) currencies.get("euro");
			System.out.println("done with exchanging method");
			return amount * x;
		}
		return amount;

	}

	public double exechangeTheCurrencyWithdraw(Account account, double amount, String currency) {
		double x = 0;
		if (currency.equalsIgnoreCase("dollar")) {
			x = (double) currencies.get("dollar");
			return amount / x;

		} else if (currency.equalsIgnoreCase("euro")) {

			x = (double) currencies.get("euro");
			return amount / x;
		}
		return amount;

	}

	public double exechangeTheCurrencyTransfere(Account account, double amount, String currency) {
		double x = 0;
		if (currency.equalsIgnoreCase("dollar")) {
			x = (double) currencies.get("dollar");
			return amount * x;

		} else if (currency.equalsIgnoreCase("euro")) {

			x = (double) currencies.get("euro");
			return amount * x;
		}
		return amount;

	}

}
