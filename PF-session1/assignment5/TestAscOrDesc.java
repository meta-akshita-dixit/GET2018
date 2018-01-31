/**
 * This class has test cases to verify the code for finding is the given array is unsorted,ascending or in descending order.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */
package assignment5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAscOrDesc 
{

	@Test
	public void testSuccessAsc() {
		AscOrDesc checkSort;                 
		int arr[]; 
		checkSort=new AscOrDesc();
		arr=new int[]{-1,2,3,4,5,6,7,8};
		assertEquals(1,checkSort.ascOrDesc(arr));
	}


	@Test
	public void testFail() { 
		AscOrDesc checkSort;                 
		int arr1[]; 
		arr1=new int[]{8,7,6,5,4,-3,2,1};
		checkSort=new AscOrDesc();//it fails as it is unsorted and here is being checked for descending order.
		assertNotEquals(2,checkSort.ascOrDesc(arr1));
	}
	
	

	@Test
	public void testSuccessUnsorted() {
		AscOrDesc checkSort;                 
		int arr2[]; 
		arr2=new int[]{1,2,4,5,6,7,3};
		checkSort=new AscOrDesc();
		assertEquals(0,checkSort.ascOrDesc(arr2));
	}

}







