
/**
 * This class performs the problem of tower of hanoi using recursion.
 *
 * @version 1 29 Jan 2018
 * @author Akshita Dixit
 */

package pf4_assignment1;
import java.util.ArrayList;
import java.util.List;

class TowerOfHanoi
{
	int totalDisks;                                                           //Variable to store total number of disks.
	
	/**
	 * Constructor to initialize the variable totalDisks
	 * @param n
	 */
	public TowerOfHanoi(int n){
		totalDisks = n;
	}
	List<String> ls = new ArrayList<String>();                                /*list to store the steps that are performed
	                                                                             to reach the destination pole.*/
	
	/**
	 * This method adds the step that is being performed for a particular disk.
	 * @param source
	 * @param dest
	 * @param disk
	 */
  public void move (String source , String dest, int disk)
	{
	   int diskNo = (totalDisks - disk + 1);                                       //to generate the disk no being moved.
	   ls.add("Move Disk " + diskNo + " from " + source + " to " +dest );          //adds the statement to the list
	}
  
  /**
   * This is a recursive method that calls move method to attain final stage i.e from source to destination using temporary pole.
   * @param source
   * @param dest
   * @param temp
   * @param numOfDisks
   * @return
   */
  public List<String> towerOfHanoi(String source ,String dest, String temp, int numOfDisks) 
   {
        if (numOfDisks == 1)                                                        //base condition when n =1 
        {
        	move(source, dest, numOfDisks);
        }
        else 
          {
        	 towerOfHanoi(source, temp, dest, numOfDisks-1 );                       //moves n-1 disks from pole1 to pole2 .
             move(source, dest, numOfDisks);                                        /*moves disk number n from pole1 to pole3  n is the top disk 
                                                                                     number in the source*/
             towerOfHanoi(temp, dest,source, numOfDisks-1);                        //moves n-1 disks from pole2 to pole3
          }
        return ls;
   }  
 

}