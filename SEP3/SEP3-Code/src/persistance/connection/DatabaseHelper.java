package persistance.connection;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class DatabaseHelper<T>
{
	private static Connection connection = null;

   public DatabaseHelper()
         throws RemoteException, SQLException
   {
     
     connection = ConnectionManager.getInstance().getConnection();
     try
     {
        DriverManager.registerDriver(
              new com.microsoft.sqlserver.jdbc.SQLServerDriver());
     }
     catch (SQLException e)
     {
        throw new RemoteException("No JDBC driver", e);
     }
   }


   private static PreparedStatement prepare( String sql,
         Object... parameters) throws SQLException
   {

      PreparedStatement stat = connection.prepareStatement(sql);
      for (int i = 0; i < parameters.length; i++)
      {
         stat.setObject(i + 1, parameters[i]);
      }
      return stat;
   }

   public ResultSet executeQuery( String sql,
         Object... parameters) throws SQLException
   {
      PreparedStatement stat = prepare( sql, parameters);
      return stat.executeQuery();
   }

   public int executeUpdate(String sql, Object... parameters)
         throws RemoteException
   {
      try 
      {
         PreparedStatement stat = prepare( sql, parameters);
         return stat.executeUpdate();
      }
      catch (SQLException e)
      {
         throw new RemoteException(e.getMessage(), e);
      }
   }

   public T getSingle(DataMapper<T> mapper, String sql, Object... parameters)
         throws RemoteException
   {
      try 
      {
         ResultSet rs = executeQuery( sql, parameters);
         if (rs.next())
         {
            return mapper.create(rs);
         }
         else
         {
            return null;
         }
      }
      catch (SQLException e)
      {
         throw new RemoteException(e.getMessage(), e);
      }
   }

   public List<T> getList(DataMapper<T> mapper, String sql, Object... parameters)
         throws RemoteException
   {
      try 
      {
         ResultSet rs = executeQuery( sql, parameters);
         LinkedList<T> allObjects = new LinkedList<>();
         while (rs.next())
         {
            allObjects.add(mapper.create(rs));
         }
         return allObjects;
      }
      catch (SQLException e)
      {
         throw new RemoteException(e.getMessage(), e);
      }
   }
}
