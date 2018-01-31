package pf2_assignment2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestTraingle {

	
	@Test
	public void testPattern() {
		   Triangle t = new Triangle();
		   String expected[];
		   expected = new String[]{"12345", " 1234", "  123", "   12", "    1"};
		   int n=5;
		   assertArrayEquals(expected,t.triangle(n));
	}
	
	@Test
	public void testNumbers() {
		   Triangle t = new Triangle();
		   int n=5;
		   String number;
		   number = new String("123");
		   assertEquals(number,t.numbers(3, n));
	}

	@Test
	public void testSpaces() {
		   int n=5;
		   Triangle t = new Triangle();
		   String space;
		   space = new String("  ");
		   assertEquals(space,t.spaces(3, n));
	}

}





