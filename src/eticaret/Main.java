package eticaret;

import eticaret.business.concretes.CustomerCheckManager;
import eticaret.business.concretes.MailVerificationManager;
import eticaret.dataaccess.concretes.HibernateCustomerDao;
import eticaret.entities.concretes.Customer;
import eticaret.business.concretes.CustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setName("Umut");
		customer1.setLastName("Kozan");
		customer1.setEmail("umutkkozan@hotmail.com");
		customer1.setPassword("123456");
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setName("Ugur");
		customer2.setLastName("Kerim");
		customer2.setEmail("umutkkozan@gmail.com");
		customer2.setPassword("123456");
		
		Customer customer3 = new Customer();
		customer3.setId(3);
		customer3.setName("Alpay");
		customer3.setLastName("Kozan");
		customer3.setEmail("umutkkozan@gmail.com");
		customer3.setPassword("123456");

		CustomerManager customerManager = new CustomerManager(new CustomerCheckManager(),
				new MailVerificationManager(),new HibernateCustomerDao());
		
		customerManager.singUp(customer1);
		customerManager.singUp(customer2);
		
	
		
	}

}