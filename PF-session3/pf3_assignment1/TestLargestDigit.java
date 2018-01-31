package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestDigit 
{
	

	@Test
	public void testSuccess () 
	{
		LargestDigit test = new LargestDigit ();
		assertEquals (2, test.largestDigit (2));
	}

	@Test
	public void testSuccess2 () 
	{
		LargestDigit test = new LargestDigit ();
		assertEquals (9, test.largestDigit (1257369));
	}
	
	@Test
	public void testSuccess3 () 
	{
		LargestDigit test = new LargestDigit ();
		assertEquals (4, test.largestDigit (444));
	}
	
	@Test
	public void testFailure () 
	{
		LargestDigit test = new LargestDigit ();
		assertNotEquals (6, test.largestDigit (444658));
	}
}
