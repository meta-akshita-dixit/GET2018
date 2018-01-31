

/**
 * This class has methods that remove duplicate elements in the given array.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */


package assignment2;

import java.util.Arrays;

public class RemovingDuplicates 
{
	boolean checkDuplicate(int input[] , int i)
	{
		boolean flag = true;
		for(int loopCounter = 0; loopCounter < i ; loopCounter++)
		{
			if(input[i] == input[loopCounter])           //compares with each element of the array.
			{
				flag = false;
				return flag;
			}
		}
		return flag;
	}
	public int[] removeDuplicate(int input[])
	{
		int i = 0, counter = 0;
		int size = input.length;
		int uniqueArray[] = new int[size];              //array to store unique elements
		while(i < size)
		{
			if(checkDuplicate(input,i))                 //passes array and each element's index to check if it is a duplicate element.
			{
				
				uniqueArray[counter] = input[i];
				i++;
				counter++;
			}
			else
			{
				i++;
				
			}
		}
		return Arrays.copyOfRange( uniqueArray , 0 , counter );
	}

}

