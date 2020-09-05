package tests;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import shapes.Circle;


public class TestCircleLogic {
	
	final double RADIUS = 5;
	Circle circle = new Circle(RADIUS);
	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testCircleCircumference() {
		System.out.println("Inside testCircleCircumference()");
		assertTrue(circle.returnCircumference() == 2*Math.PI*RADIUS);
		circle.setRadius(6);
		assertTrue(circle.returnCircumference() == 12*Math.PI);
	}
	
	@Test
	public void testCircleArea() {
		System.out.println("Inside testCircleArea()");
		assertTrue(circle.returnArea() == Math.PI * Math.pow(RADIUS, 2));
		circle.setRadius(6);
		assertTrue(circle.returnArea() == Math.PI * 36);
	}
}
