package assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestSequence 
{
	
	@Test
	public void testSuccess() {
		LongestSequence test;
		int arr[],expectedArr[];
		arr=new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		test=new LongestSequence();
		expectedArr=new int[]{1,2,4,5,6,7,8,9};
		assertArrayEquals(expectedArr,test.longestSequence(arr));
	}

	@Test
	public void testFailure() {
		LongestSequence test;
		int arr[],expectedArr[];
		arr=new int[]{1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		test=new LongestSequence();
		expectedArr=new int[]{1,2,4,5,6,7,9};
		assertNotEquals(expectedArr,test.longestSequence(arr));
	}

	@Test
	public void testSuccessEmpty() {
		LongestSequence test;
		int arr[],expectedArr[];
		arr=new int[]{};
		test=new LongestSequence();
		expectedArr=new int[]{};
		assertArrayEquals(expectedArr,test.longestSequence(arr));
	}
	
	@Test
	public void testSuccessEqualElements() {
		LongestSequence test;
		int arr[],expectedArr[];
		arr=new int[]{1,1,1,1,1,1};
		test=new LongestSequence();
		expectedArr=new int[]{1};
		assertArrayEquals(expectedArr,test.longestSequence(arr));
	}
	
	@Test
	public void testSuccessNegativeElements() {
		LongestSequence test;
		int arr[],expectedArr[];
		arr=new int[]{-1,-3,-2,0,1};
		test=new LongestSequence();
		expectedArr=new int[]{-3,-2,0,1};
		assertArrayEquals(expectedArr,test.longestSequence(arr));
	}
}
