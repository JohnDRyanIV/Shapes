package tests;
import static java.lang.Math.*;

import org.junit.Before;
import org.junit.Test;


public class TestCircleLogic {
	final double RADIUS = 5;
	Circle circle = new Circle(RADIUS);
	
	
	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testCircleCircumference() {
		System.out.println("Inside testCircleCircumference()");
		assertEquals(circle.getCircumference(), 2*Math.PI*RADIUS);
	}
	
	@Test
	public void testCircleArea() {
		System.out.println("Inside testCircleArea()");
		assertTrue(circle.getArea() == Math.PI * Math.pow(RADIUS, 2));
	}
}
