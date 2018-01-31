package pf3_assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestLinearSearch {

	LinearSearch l = new LinearSearch();
	int pos = 0;
	int arr[], x, x1;
	@Before
	public void begin()
	{
		arr = new int[]{2,5,8,9,10, 77, 55};
		x = 88;
	}
	@Test
	public void test() {
		int expectedResult = 0;
		assertEquals(expectedResult,l.linearSearch(arr,x,pos));
	}
	
	@Test
	public void test1() {
		int expectedResult = 5;
		x1 = 77;
		assertEquals(expectedResult,l.linearSearch(arr,x1,pos));
	}

}
