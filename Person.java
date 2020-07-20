
public class Person {
	private String firstName, lastName;
	private int age;
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		if(age < 0 || age > 100)
			age = 0;
		this.age = age;
	}
	
	public boolean isTeen() {
		return (this.age >= 13 && this.age <=19);
	}
	
	public String getFullName() {
		if(this.firstName.isEmpty() && this.lastName.isEmpty())
			return "";
		else if(this.getLastName().isEmpty())
			return this.getFirstName();
		else if(this.getFirstName().isEmpty())
			return this.getLastName();
		else
			return this.getFirstName() + " " + this.getLastName(); 
			
	}
}
