package dao;

import java.rmi.RemoteException;
import java.sql.SQLException;

public class TestTheDatabaseHelper
{
   public static void main(String[] args) throws RemoteException, SQLException
   {
      final String JDBC_URL = "jdbc:postgresql://localhost:5432/postgres?currentSchema=bank";
      final String USERNAME = "postgres";
      final String PASSWORD = "0940";
      MyDatabaseHelper helper = new MyDatabaseHelper(JDBC_URL,USERNAME,PASSWORD);
      helper.executeQuery(" ");
   }

}
