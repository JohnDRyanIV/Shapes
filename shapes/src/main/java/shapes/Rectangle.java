package shapes;

public class Rectangle {
	
	// Class variables
	private double length;
	private double width;
	
	// Default constructor
	public Rectangle() {
		setLength(5);
		setWidth(10);
	}
	
	public Rectangle(double l, double w) {
		setLength(l);
		setWidth(w);
	}
	
	// Returns the rectangle's perimeter
	public double returnPerimeter() {
		return 2 * getLength() + 2 * getWidth();
	}
	
	// Returns the rectangle's area
	public double returnArea() {
		return getLength() * getWidth();
	}
	
	// Getters - Setters
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	
	
}
