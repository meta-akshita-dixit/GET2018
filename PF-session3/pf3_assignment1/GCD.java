
/**
 * This class has method to find the greatest common divisor of two numbers.
 *
 * @version 1 24 Jan 2018
 * @author Akshita Dixit
 */

package pf3_assignment1;

public class GCD {
	
	/**
	 * This methods takes two arguments and finds the gcd of two numbers.
	 * @param x
	 * @param y
	 * @return
	 */
	int gcd(int x, int y)
	{
		if(y!=0)                                       
			return gcd(y , x % y);                       /* it is a recursive call each time passing the second number as 
			                                                first parameter and the remainder of x/y as second till y!=0*/
		else
			return x;
	}

	
}
