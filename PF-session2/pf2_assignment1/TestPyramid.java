package pf2_assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPyramid {
	
	Pyramid p = new Pyramid();
	String expected[];
	String number, space;
	@Before
	public void beforePattern(){
		expected = new String[]{"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		
	}
	

	@Test
	public void testPattern() {
		   int n=5;
		   assertArrayEquals(expected,p.pyramid(n));
	}
	@Before
	public void beforeNumbers(){
		number = new String("123454321");
	}
	

	@Test
	public void testNumbers() {
		   int n=5;
		   assertEquals(number,p.numbers(5, n));
	}
	@Before
	public void beforeSpaces(){
		space = new String("    ");
	}
	

	@Test
	public void testSpaces() {
		   int n=5;
		   assertEquals(space,p.spaces(1, n));
	}

}
