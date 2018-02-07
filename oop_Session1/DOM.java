package oop_Session1;

/**
 * 
 * @author Akshita Dixit
 * Div is a HTML tag
 * Div is type of Composite Element
 */
public class Div extends CompositeElement {
	
	/**
	 * Constructor to initialize the values
	 * @param id - id of the tag
	 * @param className - name of the class of the tag
	 * @return
	 */
	Div(String id, String className){
		
		// calling parent class for initialization
		super(id,className);
	}
}
