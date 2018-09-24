package model;

public class TestHashTable
{
   public static void main(String[] args)
   {
      Exechange h = new Exechange();
      h.setExechange(100, 200, 1);
      System.out.println(h.getDollarValue());
      Account account = new Account("kr", 1000, 123456789);
      account.deposite(100, "dollar");
 


   }
}
