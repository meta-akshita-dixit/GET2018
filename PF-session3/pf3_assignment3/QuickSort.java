
/**
 * This class has method to sort the array in ascending order.This code implements quick sort algorithm.
 *
 * @version 1 25 Jan 2018
 * @author Akshita Dixit
 */
package pf3_assignment3;

public class QuickSort {
	
	    /**
	     * This method returns the index from where the array is one side smaller and 
	     * other side greater than the pivot.
	     * @param arr
	     * @param first
	     * @param last
	     * @return
	     */
	    int partition(int arr[], int first, int last)
	    {
	        int pivot = arr[last]; 
	        int iterator = (first-1);                                 // index of smaller element
	        for (int counter=first; counter < last; counter++)
	        {
	                                                                 /* If current element is smaller than or
	                                                                    equal to pivot*/
	            if (arr[counter] <= pivot)
	            {
	                iterator++;
	                int temp = arr[iterator];                        // swap arr[i] and arr[j]
	                arr[iterator] = arr[counter];
	                arr[counter] = temp;
	            }
	        }
	 
	                                                                // swap arr[i+1] and arr[last] (or pivot)
	        int temp = arr[iterator+1];
	        arr[iterator+1] = arr[last];
	        arr[last] = temp;
	 
	        return iterator+1;
	    }
	 
	 
	    /**
	     * this method is a recursive method.It sorts the array that has been partitioned
	     * into two halves by the partition method , till the complete array gets sorted.
	     * @param arr
	     * @param first
	     * @param last
	     * @return
	     */
	    int[] sort1(int arr[], int first, int last)
	    {
	        if (first < last)
	        {
	             int index = partition(arr, first, last);          //index is partitioning index, arr[index] is 
	                                                               // now at right place 
	            
	             arr = sort1(arr, first, index-1);                 // Recursively sort elements before                              
	             arr = sort1(arr, index+1, last);                  // partition and after partition
	                                     
	        }
	        return arr;
	    }
	 
	}

