

package pf2_assignment1;
/**
 * This class has three methods to generate spaces,numbers and the final pattern.
 *    1
 *   121
 *  12321
 * 1234321
 *123454321
 * 1234321
 *  12321
 *   121
 *    1
 * @version 1 24 Jan 2018
 * @author Akshita Dixit
 */
public class Pyramid {
	

	/**
	 * This method is calculating the required spaces for each row of the given pattern.
	 * @param row
	 * @param n
	 * @return
	 */
	  String spaces(int row , int n)
	  {
		  String space = "";
		  if(row < n)                                                                 //for upper half of the pattern
		  {
			  int sp = n - row;                                                       /*sp stores the number of spaces for
			                                                                            particular row.*/
			  
			  for(int counter = 0; counter < sp; counter++)
			  {
				  space = space + " ";                                                //space is a string that contains the spaces for that particular row.
			  }
		  }
		  else                                                                        //for lower half of the pattern
		  {
              int sp = row - n;                                                       //sp stores the number of spaces for particular row.
			  for(int counter = 0; counter < sp; counter++)
			  {
				  space = space + " ";                                                /*space is a string that contains the 
				                                                                       spaces for that particular row.*/
			  }
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
		  if (row < n) //for upper half of the pattern
		  {
		      int noOfDigits = 2 * row -1;                                                /*noOfDigits stores the number of
		                                                                                  digits to be printed for particular row.*/
		      for(int counter = 1 ,i = 1; counter <= noOfDigits; counter++)
		      {
		    	  if (counter <= noOfDigits / 2 +1)                                       //for the increasing part of the digits in a row
		    		  number = number + counter;                                          /*number is a string that contains the digits
		    		                                                                       for that particular row.*/
		    	  else                                                                    //for the decreasing part of the digits in a row
		    	  {
		    		 number = number + (counter - i - 1);
		    		  i=i+2;
		          }
		    		  
		    	  
		      }
		  } 
		  else                                                                            //for lower half of the pattern
		  {
			  int noOfDigits = 2 * ((n - row) + n) -1;
			  int i = 1;
			  for(int counter = 1; counter <= noOfDigits; counter++)
			  {
			   	  if (counter <= noOfDigits / 2 +1)
			   		  number = number + counter;
			   	  else
			   	  {
			   		  number = number + (counter - i - 1);
			    	  i=i+2;
			      }
			  }
		   }
		   
		   return number;
	   }
	  
	  /**
	   * This method generates the final pattern using the above two methods.
	   * @param n
	   * @return
	   */
	   String[] pyramid(int n)
	   {
		   int size = (2 * n) - 1;
		   String resultPyramid[]=new String[size];
		   for (int counter = 1; counter <= size; counter++)
		   {
			   resultPyramid[counter-1] = spaces(counter , n) + numbers(counter , n);        /*strings returned by spaces and numbers method are
			                                                                                  concatenated to store in the resultant string array.*/
		   }
		   
		   return resultPyramid;
	   } 
	   
}
