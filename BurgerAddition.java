
public class BurgerAddition {
	private double price;
	private String name;
	
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public BurgerAddition(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
}
