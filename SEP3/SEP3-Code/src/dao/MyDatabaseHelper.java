package dao;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MyDatabaseHelper<T>
{
   private String jdbcURL;
   private String username;
   private String password;

   public MyDatabaseHelper(String jdbcURL, String username, String password)
         throws RemoteException
   {
      this.jdbcURL = jdbcURL;
      this.username = username;
      this.password = password;
      try
      {
         DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
      }
      catch (SQLException e)
      {
         throw new RemoteException("No JDBC driver found", e);
      }
   }

   public Connection getConnection() throws SQLException
   {
      if (username == null)
      {
         return DriverManager.getConnection(jdbcURL);
      }
      else
      {
         return DriverManager.getConnection(jdbcURL, username, password);
      }
   }

   public Statement getStatementObjcet() throws SQLException
   {
      Statement statement = getConnection().createStatement();
      return statement;

   }

   public ResultSet executeQuery(String query) throws SQLException
   {
      ResultSet rs = getStatementObjcet().executeQuery("select name from bank.customer");
    while(rs.next()) {
       System.out.println(rs.getString("name"));
    }
      return rs;
   }
   
 
}
