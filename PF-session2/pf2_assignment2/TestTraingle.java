package pf2_assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestTraingle {

	Triangle t = new Triangle();
	String expected[];
	String number, space;
	@Before
	public void beforePattern(){
		expected = new String[]{"12345", " 1234", "  123", "   12", "    1"};
		
	}
	

	@Test
	public void testPattern() {
		   int n=5;
		   assertArrayEquals(expected,t.triangle(n));
	}
	@Before
	public void beforeNumbers(){
		number = new String("123");
	}
	

	@Test
	public void testNumbers() {
		   int n=5;
		   assertEquals(number,t.numbers(3, n));
	}
	@Before
	public void beforeSpaces(){
		space = new String("  ");
	}
	

	@Test
	public void testSpaces() {
		   int n=5;
		   assertEquals(space,t.spaces(3, n));
	}

}


