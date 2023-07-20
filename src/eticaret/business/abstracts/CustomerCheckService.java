package eticaret.business.abstracts;
import eticaret.entities.concretes.Customer;
public interface CustomerCheckService {
          boolean checkFirstName(Customer customer);
          boolean checkLastName(Customer customer);
          boolean checkMail(Customer customer);
          boolean checkPassword(Customer customer);
          boolean uniqueaMail(Customer customer);
          boolean isValid(Customer customer);
}
