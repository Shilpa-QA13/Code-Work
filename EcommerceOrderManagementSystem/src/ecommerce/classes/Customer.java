package ecommerce.classes;

public class Customer {
	public String name;
	public String email;
	public String address;
	public Customer(String name,String email,String address) {
		this.name=name;
		this.email=email;
		this.address=address;
	}
	public String get_contact_info() {
		return this.name+" "+this.email+" "+this.address;
	}
	
	

}
