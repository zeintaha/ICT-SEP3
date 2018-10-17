package dao;

public class MainClass
{
  

   public static void main(String[] args) throws Exception
   {
      final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=bank";
      final String USERNAME = "postgres";
      final String PASSWORD = "0940";
   
   CustomerDAO cust = new CustomerDAOService(JDBC_URL, USERNAME, PASSWORD);
   cust.create("012544", "fadi", "Horsens");
   System.out.println(" done");
    
   }

}
