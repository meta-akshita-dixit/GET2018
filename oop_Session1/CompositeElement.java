package oop_Session1;

import java.util.List;
import java.util.ArrayList;
/**
 * This class is responsible for initializing Composite element i.e. the elements which have more tags inside it. 
 * @author Akshita Dixit
 */
public class CompositeElement extends Element{
	
	// List stores tags inside parent tag
	List<Element> element = new ArrayList<Element>();

	/**
	 * constructor to initialization of values
	 * @param id
	 * @param className
	 */
	public CompositeElement(String id, String className) {
		
		// calling parent class for initialization
		super(id,className);
	}
	
	 /**
	  *  method for adding Tag
	  * @param tag - object of element
	  */
	void add(Element tag){
		
		// Adding tag or element
		element.add(tag);
	}
	
	
	/**
	 * Returns list of tags inside parent tag
	 * @return list of elements
	 */
	List<Element> tagList(){
		
		// returns list of composite element tag
		return this.element;
	}
	
	/**
	 * for checking instance of composite element
	 */
	public boolean has_instance(){
		return true;
	}
	
	
}
