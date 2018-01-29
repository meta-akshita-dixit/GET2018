
/**
 * This class has method to find the remainder when x is divided by y.
 *
 * @version 1 24 Jan 2018
 * @author Akshita Dixit
 */

package pf3_assignment1;

public class Remainder {

	/**
	 * this is a recursive method to find the remainder when x is divided by y.
	 * @param x
	 * @param y
	 * @return
	 */
	int rem(int x, int y)
	{
		if( x >=0 && y > 0)                               //mandatory condition for dividing two nos.
		{
			if(x > y)
				return rem(x - y, y);                     //recursive call by each time reducing x by y and keeping y as second param.
			else if(x == y)                               //condition when x is completely divisible by y.
				return 0;
			else 
				return x;                                 //when x<y then x is the remainder.
		}
		else
			return x;                                    //if y=0;
	}
}
