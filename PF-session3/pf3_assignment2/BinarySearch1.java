
/**
 * This class has method to find a number x in an array using binary search.
 *
 * @version 1 25 Jan 2018
 * @author Akshita Dixit
 */
package pf3_assignment2;


public class BinarySearch1 
{
	int mid;
	/**
	 * This method returns the position of the number to be searched i.e x.
	 * @param arr
	 * @param x
	 * @param first
	 * @param last
	 * @return
	 */
	int binarySearch (int []arr, int x, int first, int last)
	{
		if(arr[0] > x || arr[arr.length - 1] < x)            //if x is smaller than the smallest element of arr or greater than
			return -1;                                       //largest element of arr.
			
		
		if ( (first < last) && (last <= arr.length))         //to check with all the elements of arr
		{
			mid = (first + last - 1)/2;
			if (arr [mid] == x)                              //if x is equal to the middle element of arr
				return mid+1;
			else if (arr [mid] > x)                          //if x is less than middle value of arr
				return binarySearch (arr, x, first, mid);
			else if (arr [mid] < x)                          //if x is less than middle value of arr
				return binarySearch (arr, x, mid+1, last);	
		}
		   return -1;
	}
}





