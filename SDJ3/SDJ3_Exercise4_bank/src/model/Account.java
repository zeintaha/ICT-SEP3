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

   public Account(String currency, double balance, long accountNumber) throws RemoteException
   {
      this.currency = currency;
      this.balance = balance;
      this.accountNumber = accountNumber;

   }

   public String getCurrency() throws RemoteException
   {
      return currency;
   }

   public double getBalance() throws RemoteException
   {
      return balance;
   }

   public void setBalance(double balance) throws RemoteException
   {
      this.balance = balance;
   }

   public long getAccountNumber() throws RemoteException
   {
      return accountNumber;
   }

   
   
   
   
   public void deposite(double amount, String currency) throws RemoteException
   {

      if (currency.equalsIgnoreCase(getCurrency()))
      {

         this.balance += amount;
      }
      else
      {
    	 
         double newamount = exechange.exechangeTheCurrencyDeposite(this, amount, currency);
         this.balance += newamount;

     }
      System.out.println(" now the balance is " + this.balance);

   }

   
   
   
   public void withdraw(double amount, String currency) throws RemoteException
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

   public String totring() throws RemoteException 
   {
      return "[Currency=" + currency + ", Balance=" + balance + ", Number="
            + accountNumber + "]";
   }

}
