package persistenceTier.test;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import persistenceTier.connection.ConnectionManager;

public class Testconnection
{
   public static void main(String[] args) throws RemoteException, SQLException
   {

          try (Connection con = ConnectionManager.getInstance().getConnection(); Statement stmt = con.createStatement();) {
              String SQL = "select * from customer";
              
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
