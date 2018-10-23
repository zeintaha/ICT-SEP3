package dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.customer.Customer;

public class CustomerDAOService extends UnicastRemoteObject
      implements CustomerDAO
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private DatabaseHelper<Customer> helper;

   public CustomerDAOService(String jdbcURL, String username, String password)
         throws RemoteException
   {

      this.helper = new DatabaseHelper<>(jdbcURL, username, password);
   }

   private static class CustomerMapper implements DataMapper<Customer>
   {
      @Override
      public Customer create(ResultSet rs) throws SQLException
      {
         String cpr = rs.getString("cpr");
         String name = rs.getString("name");
         String address = rs.getString("address");
         return new Customer(cpr, name, address);
      }
   }

   @Override
   public Customer create(String cpr, String name, String address)
         throws RemoteException
   {
      helper.executeUpdate("INSERT INTO Customer VALUES (?, ?, ?)", cpr, name,
            address);
      return new Customer(cpr, name, address);
   }

   @Override
   public Customer read(String cpr) throws RemoteException
   {
      CustomerMapper mapper = new CustomerMapper();
      Customer cust = helper.mapSingle(mapper,
            "SELECT * FROM Customer WHERE name = ?;", cpr);

      return cust;
   }

   @Override
   public void delete(Customer customer) throws RemoteException
   {
      helper.executeUpdate("DELETE FROM Customer WHERE cpr = ?",
            customer.getCpr());
   }

   @Override
   public void update(Customer customer) throws RemoteException
   {
      helper.executeUpdate(
            "UPDATE Customer set name = ?, address = ? WHERE cpr = ?",
            customer.getName(), customer.getAddress(), customer.getCpr());
   }

}
