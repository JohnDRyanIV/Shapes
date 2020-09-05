package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.Square;

public class TestSquareLogic {

	final double SIDE_LENGTH = 7;
	Square square = new Square(SIDE_LENGTH);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPerimeterSquare() {
		System.out.println("Inside testPerimeterSquare()");
		assertFalse(square.returnPerimeter() != 4*SIDE_LENGTH);
		square.setSide(12);
		assertFalse(square.returnPerimeter() != 48);
	}
	
	@Test
	public void testAreaSquare() {
		System.out.println("Inside testAreaSquare()");
		assertTrue(square.returnArea() == SIDE_LENGTH * SIDE_LENGTH);
		square.setSide(12);
		assertTrue(square.returnArea() == 144);
	}

}
