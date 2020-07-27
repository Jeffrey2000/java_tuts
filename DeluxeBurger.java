
public class DeluxeBurger extends BaseBurger{
	private BurgerAddition ba1 = new BurgerAddition("Chips", 6);
	private BurgerAddition ba2 = new BurgerAddition("Drink", 3);
	private int maxAdditions;
	
	public DeluxeBurger(int addition, String breadType, boolean meat) {
		super(2, breadType, false);
		this.setBasePrice(3);
	}
	
	@Override
	public void addAddition(String name, double price) {
		System.out.println("No additions can be added");
	}
	
	@Override
	public void printNameAndPrice() {
		if(ba1.getName() !="" && ba1.getPrice() >= 0) {
			System.out.println(ba1.getName() + " ----- " + ba1.getPrice());
		}
		if(ba2.getName() !="" && ba2.getPrice() >= 0) {
			System.out.println(ba2.getName() + " ----- " + ba2.getPrice());
		}
		System.out.println("The total price is " + this.getBasePrice() + this.getTotalAdditionPrice());
	}
	
}
