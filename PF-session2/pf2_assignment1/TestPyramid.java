package pf2_assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPyramid {
	
	
	@Test
	public void testPattern() {
		   Pyramid p = new Pyramid();
		   int n=5;
		   String expected[];
		   expected = new String[]{"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		   assertArrayEquals(expected,p.pyramid(n));
	}

	

	@Test
	public void testNumbers() {
		   Pyramid p = new Pyramid();
		   String number;
		   int n=5;
		   number = new String("123454321");
		   assertEquals(number,p.numbers(5, n));
	}
	@Before
	public void beforeSpaces(){
		
	}
	

	@Test
	public void testSpaces() {
		   int n=5;
		   Pyramid p = new Pyramid();
		   String space;
		   space = new String("    ");
		   assertEquals(space,p.spaces(1, n));
	}

}
