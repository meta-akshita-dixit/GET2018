package oop_Session1;
/**
 *  Anchor is a HTML tag, in this we denote Anchor as "A"
 *  Anchor is type of Atomic Element
 * @author Akshita Dixit
 *
 */
public class A extends AtomicElement {
	
	// Attribute of Anchor tag
	String href;
	
	/**
	 *  Constructor to initialize the values
	 * @param id of the tag
	 * @param href contains hyperlink reference attribute for the tag
	 * @param className contains name of the class the tag belongs
	 */
	A(String id, String href, String className){
		
		// calling parent class for initialization
		super(id,className);
		
		// initializing the value
		this.href= href;
	
	}
}
