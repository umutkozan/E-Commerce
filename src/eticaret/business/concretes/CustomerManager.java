package eticaret.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaret.business.abstracts.CustomerCheckService;
import eticaret.business.abstracts.CustomerService;
import eticaret.business.abstracts.VerificationService;
import eticaret.dataaccess.abstracts.CustomerDao;
import eticaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
 CustomerCheckService customerCheckService;
 VerificationService mailverificationService;
 CustomerDao customerDao;
       
public CustomerManager(CustomerCheckService customerCheckService, VerificationService verificationService,
				CustomerDao customerDao) {
			super();
			this.customerCheckService = customerCheckService;
			this.customerDao = customerDao;
		}
@Override
public void singUp(Customer customer) {
	//CustomerCheckManager'da bulunan isValid operasyonu bilgiler true oluyor 
			//Bu bilgilerin tümünün doğru olması duurmunda email doğrulama mail'i gönderiliyor 
			if (customerCheckService.isValid(customer) == true) {
				System.out.print(customer.getName() + " kullanıcısı başarıyla sisteme eklendi.\n");
				mailverificationService.sendToVerifyMail(customer.getEmail());

			}
		}
@Override
public void singIn(Customer customer) {
	// doğrulama mailine tıklamış oluyoruz gibi düşünüyoruz.
			mailverificationService.verifyMail(customer.getEmail());
			//  isVerificated komutunu çağırarak buraya gönderilen kullanıcının 
			//mail adresinin doğrulanan maillerin içinde olup olmadığını kontrol ediyoruz.
			if (customerDao.getEmail(customer.getEmail()) && customerDao.getPassword(customer.getPassword())
					&& mailverificationService.checkVerifyAccount(customer.getEmail()) == true) {
				System.out.println("Kullanıcı girişi başarıyla yapıldı.");
				//kullanıcı bilgileri doğru ama mail doğrulanmadıysa uyarı veriyoruz.
			} else if (mailverificationService.checkVerifyAccount(customer.getEmail()) == false) {
				System.out.println("Kullanıcı bilgileri doğru. Fakat mail adresi doğrulanmadığı için giriş yapılamıyor.");
			} else {
				System.out.println("Kullanıcı bilgileri yanlış, lütfen kontrol ediniz.");
			}
		}

	
}


	
            

