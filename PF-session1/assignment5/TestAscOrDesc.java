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
	AscOrDesc checkSort;                 //object of the class AscOrDesc to use for further reference.
	int arr[],arr1[],arr2[];             //three arrays for three test cases.
	@Before
	public void toBegin1()               //before testing the case defining the array.
	{
		checkSort=new AscOrDesc();
		arr=new int[]{-1,2,3,4,5,6,7,8};
	}

	@Test
	public void test1() {
		assertEquals(1,checkSort.ascOrDesc(arr));
	}

	@Before
	public void toBegin2()               //before testing the case defining the array.
	{
		checkSort=new AscOrDesc();
		arr1=new int[]{8,7,6,5,4,-3,2,1};
	}

	@Test
	public void test2() {               //it fails as it is unsorted and here is being checked for descending order.
		assertEquals(2,checkSort.ascOrDesc(arr1));
	}
	
	@Before
	public void toBegin3()              //before testing the case defining the array.
	{
		checkSort=new AscOrDesc();
		arr2=new int[]{1,2,4,5,6,7,3};
	}

	@Test
	public void test3() {
		assertEquals(0,checkSort.ascOrDesc(arr2));
	}

}



