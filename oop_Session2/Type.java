package oop_Session2;

import java.util.ArrayList;
import java.util.List;

/**
 * class representing the type of the question 
 * @author Akshita Dixit
 *
 */
public class Type {
	private List<String> optionsList = new ArrayList<>();
	
	/**
	 * Constructor
	 * @param options - list of options
	 */
	public Type (List<String> options){
		this.optionsList = options;
	}

	/**
	 * method to get option list
	 * @return optionList - option list
	 */
	public List<String> getOptions() {
		return this.optionsList;
	}
}
