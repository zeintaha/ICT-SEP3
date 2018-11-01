package dao;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTheDatabaseHelper
{
   public static void main(String[] args) throws RemoteException, SQLException
   {

      
      


          // Create a variable for the connection string.
          String connectionUrl = "jdbc:sqlserver://dbserversep3.database.windows.net:1433;database=moviedb;user=dbserveradmin@dbserversep3;password=n5*SFSVSSG&1!x;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";

          try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
              String SQL = "select * from Ticket";
              ResultSet rs = stmt.executeQuery(SQL);

              // Iterate through the data in the result set and display it.
              while (rs.next()) {
                  System.out.println(rs.getString("name"));
              }
          }
          // Handle any errors that may have occurred.
          catch (SQLException e) {
              e.printStackTrace();
          }
      }
     
   

}
