
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
			}
		}
		return flag;
	}
	public int[] removeDuplicate(int input[])
	{
		int i = 0;
		int size = input.length;
		while(i < size)
		{
			if(checkDuplicate(input,i))                 //passes array and each element's index to check if it is a duplicate element.
			{
				i++;
			}
			else
			{
				for(int loopCounter = i ; loopCounter < size-1; loopCounter++)
					input[loopCounter] = input[loopCounter + 1];
				size--;
			}
		}
		return Arrays.copyOfRange( input , 0 , size );
	}

}
