
/**
 * This class has method to method that finds the largest digit in a number.
 *
 * @version 1 24 Jan 2018
 * @author Akshita Dixit
 */

package pf3_assignment1;

public class LargestDigit 
{
	int largest = 0;                                //to compare each digit with previous digit
	
	/**
	 * This is a recursive method that finds the largest digit in a number.
	 * @param n
	 * @return
	 */
	int largestDigit (int n)
	{
		if (n <= 0)
			return largest;
		if (n % 10 > largest)                      //Comparison of next 
			largest = n % 10;                      //if n%10>largest ,the value of n%10 will be assigned to largest
		return largestDigit (n / 10);              //recursive call of function with n/10 as parameter.
	}
}
