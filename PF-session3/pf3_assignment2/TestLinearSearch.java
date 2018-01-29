package pf3_assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestLinearSearch {

	LinearSearch l = new LinearSearch();
	int pos = 0;
	int arr[], arr1[], x, x1;
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
	@Before
	public void begin1()
	{
	    arr1 = new int[]{2,5,8,9,10, 77, 55, 11};
		x1 = 77;
	}
	@Test
	public void test1() {
		int expectedResult = 5;
		assertEquals(expectedResult,l.linearSearch(arr1,x1,pos));
	}

}
