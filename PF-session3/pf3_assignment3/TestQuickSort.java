package pf3_assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestQuickSort {

	
	@Test
	public void testSuccess() 
	{
		QuickSort test;
		int arr[],arr1[];
        test = new QuickSort();
		arr = new int [] {2,5,8,9,10, 77, 55, 11};
		arr1 = new int [] {2, 5, 8, 9, 10, 11, 55, 77};
		assertArrayEquals(arr1,test.sort1(arr, 0, arr.length-1));
	}
	

	@Test
	public void testSuccess1() 
	{
		QuickSort test;
		int arr[],arr1[];
		test = new QuickSort();
		arr = new int [] {};
		arr1 = new int [] {};
		assertArrayEquals(arr1,test.sort1(arr, 0, arr.length-1));
	}
}
