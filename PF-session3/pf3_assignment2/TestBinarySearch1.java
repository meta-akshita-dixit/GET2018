package pf3_assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch1
{
	

	@Test
	public void testSuccess() 
	{
		BinarySearch1 test;
		test = new BinarySearch1();
		int arr[];
		arr = new int [] {2, 5, 8, 9, 10, 55, 77};
		assertEquals(7,test.binarySearch(arr, 77, 0, arr.length));
	}

	@Test
	public void testFailure() 
	{
		BinarySearch1 test;
		test = new BinarySearch1();
		int arr[];
		arr = new int [] {2, 5, 8, 9, 10, 55, 77};
		assertEquals(-1,test.binarySearch(arr, 88, 0, arr.length));
	}

}
