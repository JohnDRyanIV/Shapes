package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRectangleLogic {
	
	final double LENGTH = 8;
	final double WIDTH = 12;
	Rectangle rectangle = new Rectangle(LENGTH, WIDTH);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testRectanglePerimeter() {
		System.out.println("Inside testRectanglePerimeter()");
		assertEquals(rectangle.getPerimeter(), 2*LENGTH + 2*WIDTH);
	}
	
	@Test
	public void testRectangleArea() {
		System.out.println("Inside testRectangleArea()");
		assertTrue(rectangle.getArea() == LENGTH * WIDTH);
	}

}
