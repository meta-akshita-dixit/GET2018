package oop_Session1;

/**
 * 
 * @author Akshita Dixit
 * This class is responsible for initializing atomic element i.e. the 
 * elements which doesn't have any more tags inside it. 
 *
 */
public class AtomicElement extends Element{
	
	/**
	 * 
	 * @param id of the element
	 * @param lassName contains name of the class the element belongs
	 * 
	 * constructor to initialization of values
	 */
	public AtomicElement(String id, String className) {
	
		// calling parent class for initialization
		super(id,className);
	}
	

}
