package oop_Session1;

/**
 * Span is a HTML tag
 * Span is type of Composite Element
 * @author Akshita Dixit
 * 
 */
public class Span extends CompositeElement{
	
	/**
	 * Constructor for initializing values
	 * @param id - id of the tag
	 * @param className - name of the class of the tag
	 */
	Span(String id, String className){
		
		// calling parent class for initialization
		super(id , className);
	}
}

