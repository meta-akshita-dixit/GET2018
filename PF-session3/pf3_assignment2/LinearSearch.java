
/**
 * This class has method to find a number x in an array using linear search.
 *
 * @version 1 25 Jan 2018
 * @author Akshita Dixit
 */

package pf3_assignment2;

public class LinearSearch {
 
	/**
	 * This method returns the position of the number to be searched i.e x.
	 * @param arr
	 * @param x
	 * @param pos
	 * @return
	 */
	int linearSearch(int arr[], int x, int pos)
	{
		if(pos==arr.length)                       //if index is out of bound
			return 0;
		if(arr[pos]==x)                           //when x is found in the array return position of x.
			return pos;
		return linearSearch(arr,x,pos+1);        //recursive call for searching by incrementing the position 
	}
	
}
