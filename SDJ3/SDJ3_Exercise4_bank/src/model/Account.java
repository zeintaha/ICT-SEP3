package model;

import java.io.Serializable;
import java.rmi.RemoteException;

public class Account implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String currency;
   private double balance;
   private long accountNumber;
   private Exechange exechange = new Exechange();

   public Account(String currency, double balance, long accountNumber)
   {
      this.currency = currency;
      this.balance = balance;
      this.accountNumber = accountNumber;

   }

   public String getCurrency()
   {
      return currency;
   }

   public double getBalance()
   {
      return balance;
   }

   public void setBalance(double balance)
   {
      this.balance = balance;
   }

   public long getAccountNumber()
   {
      return accountNumber;
   }

   public void deposite(double amount, String currency)
   {

      if (currency.equalsIgnoreCase(getCurrency()))
      {

         this.balance += amount;
      }
      else
      {
         exechange.exechangeTheCurrencyDeposite(this, amount, currency);

     }
      System.out.println(" now the balance is " + this.balance);

   }

   public void withdraw(double amount, String currency)
   {

      if (this.getCurrency().equalsIgnoreCase(currency))
      {

         this.balance -= amount;
      }
      else
      {
         this.exechange.exechangeTheCurrencyWithdraw(this, amount, currency);
      }
      System.out.println(" now the balance is " + this.balance);
   }

   public void transfer(RemoteCustomer toCustomer, double amount,
         String currency) throws RemoteException
   {

      if (!(currency.equals("dk")))
      {
         exechange.exechangeTheCurrencyTransfere(this, amount, currency);
         this.balance -= amount;
         toCustomer.getAccount().balance += amount;

         System.out.println(" now the balance is " + this.balance);
      }
      else if (currency.equals("dk"))
      {
         this.balance -= amount;
         toCustomer.getAccount().balance += amount;
      }
   }

   public String toString()
   {
      return "[Currency=" + currency + ", Balance=" + balance + ", Number="
            + accountNumber + "]";
   }

}
