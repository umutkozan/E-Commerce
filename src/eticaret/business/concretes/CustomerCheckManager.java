package eticaret.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eticaret.business.abstracts.CustomerCheckService;
import eticaret.entities.concretes.Customer;
import java.util.regex.Pattern;

public class CustomerCheckManager implements CustomerCheckService {

	//Aynı mail adresiyle kayıt olmayı engellemek için başarıyla kayıt olan üyelerin mail'lerini bu diziye saklıyoruz.
	 //Daha sonra üyelik işlemi yapmaya çalışan olursa buradaki liste ile karşılaştırıyoruz.
	 List<String>listOfEmail = new ArrayList<String>();
	@Override
	public boolean checkFirstName(Customer customer) {
		 if (customer.getName().isEmpty()) {
			    System.out.println("İsim boş bırakılamaz");
			 	return false;
		 } else 
			 if(customer.getName().length() <3) {
             System.out.println("İsim 2 karakterden küçük olamaz");
             return false;
			 }
		return true;
	}
	@Override
	public boolean checkLastName(Customer customer) {
		if(customer.getLastName().isEmpty()) {
			System.out.println("Soyisim alanı boş bırakılamaz");
			return false;
		}
		return true;
		
	}

	@Override
	public boolean checkMail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		if (customer.getEmail().isEmpty()) {
			System.out.println("E mail alanı boş bırakılamaz");
			return false;
		}else 
			if(pattern.matcher(customer.getEmail()).find() == false) {
				System.out.println("Girilen e mail adresi formata uygun degil. Örnek: ornek@ornek.com");
				return false;
			}
		return true;
	}


	@Override
	public boolean checkPassword(Customer customer) {
		if(customer.getPassword().isEmpty()) {
			System.out.println("Şifre boş bırakılamaz");
		}else 
		if(customer.getPassword().length() < 6){
			 System.out.println("Parola 6 karakterden kısa olamaz");
			 return false;
		}
	
		return true;
	}

	@Override
	public boolean uniqueaMail(Customer customer) {
		boolean result=true;
		if(listOfEmail.contains(customer.getEmail())) {
			System.out.println("Bu mail adresi ile sisteme daha önce kayıt olunmuş, farklı bir mail adresi deneyiniz");
			return false;
		}else {
			result=true;
			listOfEmail.add(customer.getEmail());
		}
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if(checkFirstName(customer) && checkLastName(customer) && checkMail(customer) 
				&& checkPassword(customer) && uniqueaMail(customer) == true){
			return true;
		}
		return false;
	}

}
