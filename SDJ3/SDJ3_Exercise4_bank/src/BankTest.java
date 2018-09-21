
public class BankTest {

	public static void main(String[] args) {
		
		Account account1 = new Account("dkk",500,20277);
		Customer customer1 = new Customer("Taha", "102030-0056", account1);
		
		Account account2 = new Account("dkk",300,20235);
		Customer customer2 = new Customer("Fadi", "092031-1017", account2);
		
		CustomerList customers = new CustomerList();
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);
		
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		System.out.println(customers.getCustomerByCpr("092031-1017").toString());
		System.out.println(customers.getCustomerByCpr("102030-0056").toString());
		System.out.println(customers.getAllCustomers());
		
		account1.deposite(112, "dkk");
		account2.withdraw(112, "dkk");
		account1.transfer(customer2, 33);
		
		System.out.println(customer1.toString());
		System.out.println(customer2.toString());
		
		

	}

}
