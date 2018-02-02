

package pf2_assignment2;
/**
 * This class has three methods to generate spaces,numbers and the final pattern.
 * 12345
 *  1234
 *   123
 *    12
 *     1
 *
 * @version 1 24 Jan 2018
 * @author Akshita Dixit
 */
public class Triangle {
	
	/**
	 * This method is calculating the required spaces for each row of the given pattern.
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces(int row , int n)
	  {
		      String space = "";
		  
			  int sp = row - 1;                                                      //sp stores the number of spaces for particular row.
			  
			  for(int counter = 0; counter < sp; counter++)
			  {
				  space = space + " ";                                                /*space is a string that contains the spaces for 
				                                                                        that particular row.*/
			  }
		  
		
		  return space;
	  }
	
	/**
	 * This method is calculating the required number string for each row of the given pattern.
	 * @param row
	 * @param n
	 * @return
	 */
	  String numbers(int row ,int n)
	  {
		      String number = "";
		      int noOfDigits = n - row + 1;                                            /*noOfDigits stores the number of digits to be printed 
		                                                                                 for particular row.*/
		      for(int counter = 1 ; counter <= noOfDigits; counter++)
		      {
		    	 
		    		  number = number + counter;                                       /*number is a string that contains the digits
		    		                                                                    for that particular row.*/
		      }
		  
		  
		   return number;
	   }
	   
	  /**
	   * This method generates the final pattern using the above two methods.
	   * @param n
	   * @return
	   */
	   String[] triangle(int n)
	   {
		   String resultTriangle[]=new String[n];
		   for (int counter = 1; counter <= n; counter++)
		   {
			   resultTriangle[counter-1] = spaces(counter , n) + numbers(counter , n);   /*strings returned by spaces and numbers method are concatenated
			                                                                              to store in the resultant string array.*/
		   }
		   
		   return resultTriangle;
	   } 
	   


}
