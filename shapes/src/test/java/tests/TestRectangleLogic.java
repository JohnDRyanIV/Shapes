package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.Rectangle;

public class TestRectangleLogic {
	
	final double LENGTH = 8;
	final double WIDTH = 12;
	Rectangle rectangle = new Rectangle(LENGTH, WIDTH);
	Rectangle default_rectangle = new Rectangle();		// Using default constructor
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testRectanglePerimeter() {
		System.out.println("Inside testRectanglePerimeter()");
		assertFalse(rectangle.returnPerimeter() != 2*LENGTH + 2*WIDTH);
		rectangle.setLength(12);
		rectangle.setWidth(10);
		assertTrue(rectangle.returnPerimeter() == 44);
	}
	
	@Test
	public void testRectangleArea() {
		System.out.println("Inside testRectangleArea()");
		assertTrue(rectangle.returnArea() == LENGTH * WIDTH);
		rectangle.setLength(12);
		rectangle.setWidth(10);
		assertFalse(rectangle.returnArea() != 120);
	}
	
	@Test
	public void testDefaultLengthWidthNotNull() {
		System.out.println("Inside testDefaultLengthWidthNotNull()");
		assertNotNull(default_rectangle.getLength());
		assertNotNull(default_rectangle.getWidth());
	}

}
