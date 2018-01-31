
/**
 * This class has method to find the longest subsequence in the given array.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */

package assignment3;

import java.util.Arrays;

public class LongestSequence 
{
	 public int[] longestSequence(int input[])
	{
		int counter=1,pos,count=0,position=0;                  
		int size=input.length;
		 if(size == 0)                                             //when array is empty
			 return input;
		for(int loopCounter=0; loopCounter < size; loopCounter++)
		{
			pos=loopCounter;                                   //initializing pos with loopCounter
			if(loopCounter == size-1)                          //checking if the end of array has ben reached
				break;
			while(input[loopCounter]<input[loopCounter+1])     //to check id the next element is greater than current or not.
			{
				counter++;                                     //to track no of elements in longest sequence.
				loopCounter++;
				if(loopCounter == size-1)
					break;
			}
			if(counter > count)                                 //to find the longest of all the possible sequences.
			{
				position=pos;
				count=counter;
			}
			counter=1;
		}
		return Arrays.copyOfRange(input, position, position + count);
	}
}
