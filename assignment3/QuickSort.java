package assignment3;
/**
 * QuickSort class consists of two methods which are used to
 * perform the quick sort required
 * @author 
 */
public class QuickSort {
	
    /**
     * This method is used to sort the partitions and return the partition element index
     * @param arr the array to be sorted
     * @param low the lowest index
     * @param high the last index
     * @return  partition index
     */
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high]; 
        //index of smaller element
        int i = (low - 1);                                  
        for (int j=low; j<high; j++)
        {
            //If current element is smaller than or equal to pivot
            if (arr[j] <= pivot)
            {
                i++;
 
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
 
        return i+1;
    }
 
 
    /**
     * 
     * @param arr array to be sorted
     * @param low starting index of the array
     * @param high ending index of the array 
     * @return arr sorted array
     */
    int[] sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            //pi is partitioning index, arr[pi] is now at right place 
            int pi = partition(arr, low, high);
            // Recursively sort elements before
            // partition and after partition
	            sort(arr, low, pi-1);
	            sort(arr, pi+1, high);
	        }
	        return arr;
	    }
}
