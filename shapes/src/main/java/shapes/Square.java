package shapes;

public class Square {
	
	public double side;

	// Default constructor
	public Square() {
		side = 9;
	}
	
	public Square(double s) {
		setSide(s);
	}
	
	// Returns square's perimeter
	public double returnPerimeter() {
		return 4 * getSide();
	}
	
	// Returns square's area
	public double returnArea() {
		return getSide() * getSide();
	}
	
	
	// Getters - Setters
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	
}
