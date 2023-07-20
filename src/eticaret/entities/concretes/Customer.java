package eticaret.entities.concretes;

public class Customer {
     public Customer() {
	}
	int id;
     String name;
     String lastName;
     String password;
     String email;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Customer(int id, String name, String lastName, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
     
}
