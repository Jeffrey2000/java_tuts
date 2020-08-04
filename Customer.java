import java.util.ArrayList;

//Arraylist of doubles (transaction)
//Name and arraylist of doubles
public class Customer {
	private String name;
	private ArrayList<Double> transactions = new ArrayList<Double>();

	public Customer(String name, double transaction) {
		if (!name.isEmpty())
			this.name = name;
		// Demonstration of autoboxing
		this.transactions.add(Double.valueOf(transaction));
	}

	public Customer(String name) {
		this(name, 10.00);
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Double> getTransactions() {
		return this.transactions;
	}
}
