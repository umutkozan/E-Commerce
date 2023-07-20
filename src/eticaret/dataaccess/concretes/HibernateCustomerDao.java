package eticaret.dataaccess.concretes;

import java.util.List;

import eticaret.dataaccess.abstracts.CustomerDao;
import eticaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Hibernate ile eklendi"+customer.getName());
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getPassword(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
