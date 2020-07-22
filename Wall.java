
public class Wall {
	private double width, height;
	
	public Wall() {}
	public Wall(double width, double height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public void setWidth(double width) {
		if(width < 0)
			this.width= 0;
		else
			this.width = width;
	}
	
	public void setHeight(double height) {
		if(height < 0)
			this.height = 0;
		else
			this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return this.getHeight() * this.getWidth();
	}
}
