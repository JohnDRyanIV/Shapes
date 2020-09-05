package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSquareLogic {

	final double SIDE_LENGTH = 7;
	Square square = new Square(SIDE_LENGTH);
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPerimeterSquare() {
		System.out.println("Inside testPerimeterSquare()");
		assertFalse(square.getPerimeter() != 4*SIDE_LENGTH);
	}
	
	@Test
	public void testAreaSquare() {
		System.out.println("Inside testAreaSquare()");
		assertEquals(square.getArea(), SIDE_LENGTH * SIDE_LENGTH);
	}

}
