package eticaret.business.abstracts;

import java.util.List;
import eticaret.entities.concretes.Customer;


public interface CustomerService {
              void singUp(Customer customer);
              void singIn(Customer customer);
}
