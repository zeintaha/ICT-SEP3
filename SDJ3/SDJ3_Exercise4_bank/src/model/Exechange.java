package model;

import java.util.Hashtable;

public class Exechange
{
   private String dollar = "Dollar";
   private String euro  = " Euro";
   private String dk = " Dansish Crown";
   private double value ;
   
   Hashtable<String, Double> currency; 
    public Exechange(String dollar, double value1,String euro, double value2,String dk, double value3) {
       currency = new Hashtable<String, Double>();
    }
   public double exechangeTheCurrency(Account accunt, double amount, String currency) {
      
      return amount;
   }

}
