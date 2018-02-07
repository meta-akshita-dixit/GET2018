package oop_Session1;

/**
 *  This class is responsible for initializing atomic element i.e. the 
 * elements which doesn't have any more tags inside it. 
 * @author Akshita Dixit
 */
public class AtomicElement extends Element{
	
	/**
	 * constructor to initialization of values
	 * @param id of the element
	 * @param className contains name of the class the element belongs
	 */
	public AtomicElement(String id, String className) {
	
		// calling parent class for initialization
		super(id,className);
	}
}
