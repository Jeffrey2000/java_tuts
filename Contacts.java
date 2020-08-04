
public class Contacts {
	private String name, phoneNumber;
	
	public Contacts(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
