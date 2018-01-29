package assignment_2_b;

public class BinarySearch 
{
	int mid;
	int binarySearch (int []arr, int x, int first, int last)
	{
		mid = ((first + last - 1) / 2);
		if ( ( (first == last) || (first + 1 == last)) && (arr [mid] != x))
			return -1;
		else if (arr[mid]>x)
			return binarySearch (arr, x, first, mid-1);
		else if (arr[mid]==x)
			return mid+1;
		else 
			return binarySearch (arr, x, mid+1, last);
	}
	public static void main(String args[])
	{
		BinarySearch test = new BinarySearch();
		int arr[] = new int [] {2, 5, 8, 9, 10, 55, 77};
		int num = test.binarySearch(arr, 8, 0, arr.length);
		System.out.print(num);
	}
}
