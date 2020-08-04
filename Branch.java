import java.util.ArrayList;

//Need to be able to add a new customer 
//and initial transaction amount
//Needs to add additional transactions for customer 
//for specific branch
//Arraylist of customers
public class Branch {
	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public void getCustomers() {
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("Customers");
			System.out.println("----------");
			System.out.println("#." + (i + 1) + " " + customers.get(i).getName());
		}
	}

	public void getCustomerTransactions(int i) {
		Customer customer = this.customers.get(i);
		// Show Transactions of customer
	}
}
