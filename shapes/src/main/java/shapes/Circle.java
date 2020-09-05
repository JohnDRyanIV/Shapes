package shapes;
import static java.lang.Math.*;

public class Circle {
	
	private double radius;
	
	// Default constructor
	public Circle() {
		setRadius(3);
	}
	
	public Circle(double r) {
		setRadius(r);
	}
	
	// Returns the circle's circumference
	public double returnCircumference() {
		return 2 * Math.PI * getRadius();
	}
	
	// Returns the circle's area
	public double returnArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}
	
	// Getters - Setters
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
