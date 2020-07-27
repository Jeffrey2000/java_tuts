
public class BaseBurger {

	
	private String breadType;
	private boolean meat;
	private int MAX_ADDITIONS;
	private int additionCount;
	private double totalAdditionPrice;
	private double basePrice;
	
	//Could and should be done with array or some other data structure
	private BurgerAddition ba1;
	private BurgerAddition ba2;
	private BurgerAddition ba3;
	private BurgerAddition ba4;
	
	
	public BaseBurger(int additions, String breadType, boolean meat) {
		this.MAX_ADDITIONS = additions;
		this.breadType = breadType;
		this.meat = meat;
		this.basePrice = 10;
	}
	
	public BaseBurger(String breadType, boolean meat) {
		this(4, breadType, meat);
	}
	
	public int getMaxAdditons() {
		return this.MAX_ADDITIONS;
	}
	
	public boolean getMeat() {
		return this.meat;
	}
	
	public void setBasePrice(double price) {
		this.basePrice = price;
	}
	
	public void setMeat() {
		this.meat = !this.meat;
	}
	
	
	
	public int getAdditionCount() {
		return this.additionCount;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}
	
	public double getTotalAdditionPrice() {
		return this.totalAdditionPrice;
	}
	
	
	public void setAdditionCount(int count) {
		this.additionCount = count;
	}
	
	public void setTotalAdditionPrice(double price) {
		this.totalAdditionPrice = price;
	}
	
	public void addAddition(String name, double price) {
		if(this.getAdditionCount() + 1 <= this.MAX_ADDITIONS) {
			if(this.getAdditionCount() == 0) {
				ba1 = new BurgerAddition(name, price);
			}else if(this.getAdditionCount() == 1) {
				ba2 = new BurgerAddition(name, price);
			}else if(this.getAdditionCount() == 2) {
				ba3 = new BurgerAddition(name, price);
			}else if (this.getAdditionCount() == 3) {
				ba4 = new BurgerAddition(name, price);
			}
			this.additionCount+=1;
			this.totalAdditionPrice+=5;
		}else {
			System.out.println("Reached max limit of sides");
		}
	}
	
	//Clearly violating SRP but still
	public void printNameAndPrice() {
		if(ba1.getName() !=null && ba1.getPrice() >= 0) {
			System.out.println(ba1.getName() + " ----- " + ba1.getPrice());
		}
		if(ba2.getName() !=null && ba2.getPrice() >= 0) {
			System.out.println(ba2.getName() + " ----- " + ba2.getPrice());
		}
		if(ba3.getName() !=null && ba3.getPrice() >= 0) {
			System.out.println(ba3.getName() + " ----- " + ba3.getPrice());
		}
		
//		if(ba4.getName().isEmpty() == false && ba4.getPrice() > 0) {
//			System.out.println(ba4.getName() + " ----- " + ba4.getPrice());
//		}
//	

		System.out.println("The total price is " + this.getBasePrice() + this.getTotalAdditionPrice());
	}
	
}
