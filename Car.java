
public class Car extends Vehicle {
	//private fields used for encapsulation
	
	private int doors; 
	private int wheels;
	private String colour;
	private boolean engine;
	private double acceleration;
	
	public Car(String type, double initialVel, int doors, int wheels, boolean engine, String colour) {
		super(type, initialVel);
		this.doors = doors;
		this.wheels = wheels;
		this.engine = engine;
		this.colour = colour;
	}
	
	public Car(String type, double initalVel, int wheels,boolean engine, String colour) {
		this(type, initalVel, 4, wheels, true, colour);
	}

	//setters and getters
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public boolean getEngine() {
		return this.engine;
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public int getWheels() {
		return this.wheels;
	}
	
	public String getColor() {
		return this.colour;
	}
	
	
	public void startEngine() {
		this.engine = true;
		System.out.println("Engine started");
	}
	
	public void accelerate(int val) {
		this.acceleration+=val;
		System.out.println("Car is accelerating");
	}
	
	public void brake() {
		this.acceleration = 0;
		this.engine = false;
	}
	
	public class Golf extends Car {
		public Golf(double initialVel, int wheels, boolean engine, String colour) {
			super("Golf", initialVel, wheels, engine, colour);
		}
		
		@Override
		public void startEngine() {
			super.startEngine();
			System.out.println("Starting engine for golf");
		}
	}
}



