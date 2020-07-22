
public class BankAccount {
	private int accountNumber;
	private double balance;
	private String customerName, email, phoneNumber;
	
	//Can overload constructors to set defaults
	public BankAccount() {
		this("Person", "12", "johndoe@gmail.com", 0.00, 49731762);
	}
	
	//Always should have one major intialisation constructor
	public BankAccount(String customerName, String phoneNumber, String email, double balance, int accountNumber) {
		this.customerName = customerName; //this field is better
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void depositFunds(double funds) {
		double currentMoney = this.getBalance();
		if(funds > 0) {
			currentMoney+=funds;
			this.setBalance(currentMoney);
			System.out.println("New balance " + this.getBalance());
		} else {
			System.out.println("419 detected");
		}
	}
	
	public void withdrawFunds(double funds) {
		double currentMoney = this.getBalance();
		if(currentMoney >=  funds && funds > 0) {
			currentMoney-=funds;
			this.setBalance(currentMoney);
			System.out.println("New balance " + this.getBalance());
		}else {
			System.out.println("You have insufficent funds to complete this action.lol");
		}
	}
	

}
