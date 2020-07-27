
public class HealthyBurger extends BaseBurger{
	
	//Could and should be done with array or some other data struc
	
	private BurgerAddition ba1;
	private BurgerAddition ba2;
	private BurgerAddition ba3;
	private BurgerAddition ba4;
	private BurgerAddition ba5;
	private BurgerAddition ba6;
	

	
	public HealthyBurger() {
		super(6, "Brown Rye", false);
		this.setBasePrice(4);
	}
	
	public void printNameAndPrice() {
		if(ba1.getName() !="" && ba1.getPrice() >= 0) {
			System.out.println(ba1.getName() + " ----- " + ba1.getPrice());
		}
		if(ba2.getName() !="" && ba2.getPrice() >= 0) {
			System.out.println(ba2.getName() + " ----- " + ba2.getPrice());
		}
		if(ba3.getName() !="" && ba3.getPrice() >= 0) {
			System.out.println(ba3.getName() + " ----- " + ba3.getPrice());
		}
		if(ba4.getName() !="" && ba4.getPrice() >= 0) {
			System.out.println(ba4.getName() + " ----- " + ba4.getPrice());
		}
		
		if(ba5.getName() !="" && ba5.getPrice() >= 0) {
			System.out.println(ba5.getName() + " ----- " + ba5.getPrice());
		}
		if(ba4.getName() !="" && ba6.getPrice() >= 0) {
			System.out.println(ba6.getName() + " ----- " + ba6.getPrice());
		}
		System.out.println("The total price is " + this.getBasePrice() + this.getTotalAdditionPrice());
	}
	
	
	
	
	@Override
	public void addAddition(String name, double price) {
		if(this.getAdditionCount() + 1 <= this.getMaxAdditons()) {
			if(this.getAdditionCount() <= 0) {
				ba1.setName(name);
				ba1.setPrice(price);
			}else if(this.getAdditionCount() == 1) {
				ba2.setName(name);
				ba2.setPrice(price);
			}else if(this.getAdditionCount() == 2) {
				ba3.setName(name);
				ba3.setPrice(price);
			}else if (this.getAdditionCount() == 3) {
				ba4.setName(name);
				ba4.setPrice(price);
			}else if (this.getAdditionCount() == 4) {
				ba4.setName(name);
				ba4.setPrice(price);
			}else if (this.getAdditionCount() == 5) {
				ba4.setName(name);
				ba4.setPrice(price);
			}
			this.setAdditionCount(this.getAdditionCount() + 1);
			this.setTotalAdditionPrice(this.getTotalAdditionPrice() + 2);
		}else {
			System.out.println("Reached max limit of sides");
		}
	}
	
}
