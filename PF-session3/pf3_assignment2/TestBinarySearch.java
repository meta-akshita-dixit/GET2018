package assignment_2_b;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch 
{
	BinarySearch test;
	int arr[],arr1[];
	@Before
	public void toBegin()
	{
		test = new BinarySearch();
		arr = new int [] {2, 5, 8, 9, 10, 55, 77};
	}

	@Test
	public void test() 
	{
		assertEquals(0,test.binarySearch(arr, 88, 0, arr.length-1));
	}

}
