package model;
import java.io.Serializable;
import java.util.ArrayList;

public class CustomerList implements Serializable
{
   ArrayList<Customer> customers;

   public CustomerList()
   {
      customers = new ArrayList<Customer>();
   }

   public void addCustomer(Customer customer)
   {
      customers.add(customer);

   }

   public void removeCustomer(Customer customer)
   {
      customers.remove(customer);

   }

   public Customer getCustomerByCpr(String cpr)
   {
      Customer customer = null;
      for (int i = 0; i < customers.size(); i++)
      {
         if (customers.get(i).getCpr().equals(cpr))
         {
            customer = customers.get(i);
         }

      }
      return customer;

   }

   public ArrayList<Customer> getAllCustomers()
   {
      return customers;
   }
  
      
      
      
      
      
   }


