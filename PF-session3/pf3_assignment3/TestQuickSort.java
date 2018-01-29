package pf3_assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort {

	QuickSort test;
	int arr[],arr1[];
	@Before
	public void toBegin()
	{
		test = new QuickSort();
		arr = new int [] {2,5,8,9,10, 77, 55, 11};
		arr1 = new int [] {2, 5, 8, 9, 10, 11, 55, 77};
	}

	@Test
	public void test() 
	{
		assertArrayEquals(arr1,test.sort1(arr, 0, arr.length-1));
	}
	@Before
	public void toBegin1()
	{
		test = new QuickSort();
		arr = new int [] {};
		arr1 = new int [] {};
	}

	@Test
	public void test1() 
	{
		assertArrayEquals(arr1,test.sort1(arr, 0, arr.length-1));
	}
}
