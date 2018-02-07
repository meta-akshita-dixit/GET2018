
/**
 * This class has methods that generate the various possible permutations of a given
 * string using recursion.
 *
 * @version 1 29 Jan 2018
 * @author Akshita Dixit
 */
package pf4_assignment2;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    
	List<String> ls = new ArrayList<String>();//list to store the final list having all combinations.
	
	/**
	 * This method swaps the characters at given indices i.e. index1 and index2 to generate the string.
	 * @param input
	 * @param index1
	 * @param index2
	 * @return
	 */
	String swapChar(String input, int index1, int index2){
		
		//to fetch character at index1
		char charAt_index1 = input.charAt(index1); 
		//to fetch character at index2
		char charAt_index2 = input.charAt(index2);
		//to generate the string that is permutated
        input = input.substring(0, index1) + charAt_index2 + input.substring(index1 + 1);
        input = input.substring(0, index2) + charAt_index1 + input.substring(index2 + 1);
		return input;
	}
	
	/**
	 * This method is a recursive method that generates permutations of input string
	 * for every index using swapChar method.
	 * @param input
	 * @param startIndex
	 * @param size
	 * @return
	 */
	String permutationGenerator(String input, int startIndex, int size){
		
		if(startIndex == size)                          //base condition if end of string has reached
		{
			ls.add(input);                              //adding string in the resultant list
			return input;
		}
		
		for(int counter = startIndex; counter < size; counter++){
			
			//calling the swapChar method to swap the characters
			input = swapChar(input, counter, startIndex); 
			//recursion:for next possible permutation
			permutationGenerator(input, startIndex + 1, size);
			//after reaching last element then backtracking for further possible permutation
			input = swapChar(input, counter, startIndex);
		}
		return input;
	}
	
	/**
	 * This method invokes the permutationGenerator method and returns the resultant list.
	 * @param input
	 * @return
	 */
	public List<String> permutation(String input){
		
		permutationGenerator(input, 0, input.length());
		return ls;
	}
}
