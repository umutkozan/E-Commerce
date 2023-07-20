package eticaret.business.concretes;

import java.util.ArrayList;
import java.util.List;




public class MailVerificationManager implements eticaret.business.abstracts.VerificationService {

	CustomerCheckManager customerCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email + " basariyla dogrulandi.");		
	}

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " kullanıcıya doðrulama mail'i gönderildi.");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

	

}