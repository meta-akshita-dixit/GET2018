package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLargestDigit 
{
	LargestDigit test = new LargestDigit ();

	@Test
	public void test1 () 
	{
		assertEquals (2, test.largestDigit (2));
	}

	@Test
	public void test2 () 
	{
		assertEquals (9, test.largestDigit (1257369));
	}
	
	@Test
	public void test3 () 
	{
		assertEquals (4, test.largestDigit (444));
	}
}
