package pf3_assignment2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch1
{
	BinarySearch1 test;
	int arr[],arr1[];
	@Before
	public void toBegin()
	{
		test = new BinarySearch1();
		arr = new int [] {2, 5, 8, 9, 10, 55, 77};
	}

	@Test
	public void test() 
	{
		assertEquals(7,test.binarySearch(arr, 77, 0, arr.length));
	}
	@Before
	public void toBegin1()
	{
		test = new BinarySearch1();
		arr1 = new int [] {2, 5, 8, 9, 10, 55, 77};
	}

	@Test
	public void test1() 
	{
		assertEquals(-1,test.binarySearch(arr1, 88, 0, arr.length));
	}

}