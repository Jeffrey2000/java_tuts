
public class Car {
	//private fields used for encapsulation
	private int doors; 
	private int wheels;
	private String model, engine, colour;
	//setters and getters
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("porsche") || validModel.equals("jailbroken tesla"))
			this.model = model;
		else
			this.model = "Unknown";
	}
	
	public String getModel() {
		return this.model;
	}
	
}
