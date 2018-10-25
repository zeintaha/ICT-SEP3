package dao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.user.User;

public class UserDAOService extends UnicastRemoteObject
      implements UserDAO
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private DatabaseHelper<User> helper;

   public UserDAOService(String jdbcURL, String username, String password)
         throws RemoteException
   {

      this.helper = new DatabaseHelper<>(jdbcURL, username, password);
   }

   private static class UserMapper implements DataMapper<User>
   {
      @Override
      public User create(ResultSet rs) throws SQLException
      {
         String cpr = rs.getString("cpr");
         String name = rs.getString("name");
         String address = rs.getString("address");
         return new User(cpr, name, address);
      }
   }

   @Override
   public User create(String cpr, String name, String address)
         throws RemoteException
   {
      helper.executeUpdate("INSERT INTO User VALUES (?, ?, ?)", cpr, name,
            address);
      return new User(cpr, name, address);
   }

   @Override
   public User read(String cpr) throws RemoteException
   {
      UserMapper mapper = new UserMapper();
      User usr = helper.mapSingle(mapper,
            "SELECT * FROM User WHERE name = ?;", cpr);

      return usr;
   }

   @Override
   public void delete(User user) throws RemoteException
   {
      helper.executeUpdate("DELETE FROM User WHERE cpr = ?",
            user.getCpr());
      
   }

   @Override
   public void update(User user) throws RemoteException
   {
      helper.executeUpdate(
            "UPDATE User set name = ?, address = ? WHERE cpr = ?",
            user.getName(), user.getAddress(), user.getCpr());
      
   }


}
