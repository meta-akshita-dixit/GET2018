
/
/**
 * This class has two methods that are used to convert binary to octal.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */

package assignment1;

public class BinToOctal {
	
	//int decimal=0,i=0,octal=0;
	/**
	 * this method calculates the decimal value of triplets.
	 * @param binary
	 * @return
	 */
   static int toDecimal(int binary)                      
	{
		int decimal=0,i=0;
		while(binary!=0)
		{
			decimal=(int) (Math.pow(2,i)*(binary%10)+decimal);
			binary=binary/10;
			i++;
		}
		return decimal;
	}
   /**
    * this method finally generates octal number using toDecimal function.
    * @param n
    * @return
    */
  static int convertBinaryToOctal(int n)               
	{
	    if(n < 0)                             //negative value of n throws exception
	    {
	    	throw new IllegalArgumentException();
	    }
		int octal=0,i=0;
		while(n!=0)
		{
			octal=(int)(Math.pow(10, i)*(toDecimal(n%1000))+octal);
			n=n/1000;
			i++;
		}
		return octal;
	}
}



