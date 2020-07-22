
public class VipCustomer {
	private String name, email;
	private double creditLimit;
	
	public VipCustomer() {
		this("John Doe", "johndoe@gmail.com", 0.00);
	}
	
	public VipCustomer(String name, String email) {
		this(name, email, 0.00);
	}
	
	public VipCustomer(String name, String email, double creditLimit) {
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public double getCreditLimit() {
		return this.creditLimit;
	}
}
