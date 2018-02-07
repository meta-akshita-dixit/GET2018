package oop_Session1;

/**
 * @author Akshita Dixit
 * Image is a HTML tag, in this we denote Image as "img"
 * Image is type of Atomic Element
 * 
 */
public class Img extends AtomicElement {
	
	// Attribute of Image tag
	String src;
	
	/**
	 * Constructor to initialize the values
	 * @param id of the tag
	 * @param src source of image
	 * @param className of the tag
	 */
	Img(String id, String src, String className){
		
		// calling parent class for initialization
		super(id , className);
		
		// initializing the value
		this.src = src;
	}
}
