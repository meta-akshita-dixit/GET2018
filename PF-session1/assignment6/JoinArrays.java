 
/**
 * This class has a function to join two sorted arrays and store it in a third array.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */
package assignment6;

public class JoinArrays {
	
	public int[] join(int a[],int asize,int b[],int bsize,int c[])
	{
		int indexCounter1=0 , indexCounter2=0 , indexCounter3=0;       //each variable is used to point the current index of the respective arrays.
		 while (indexCounter1 < asize && indexCounter2 < bsize)        //condition to compare until end of one array reached.
		    {
		        if (a[indexCounter1] < b[indexCounter2])
		            c[indexCounter3++] = a[indexCounter1++];
		        else
		            c[indexCounter3++] = b[indexCounter2++];
		    }   
		    while (indexCounter1 < asize)                             //checking for remaining elements in array a.
		        c[indexCounter3++] = a[indexCounter1++];
		 
		    while (indexCounter2 < bsize)                            //checking for remaining elements in array b.     
		        c[indexCounter3++] = b[indexCounter2++];
		return c;
	}

}

