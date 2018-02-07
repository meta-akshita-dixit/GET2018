package oop_Session1;
/**
 * Abstract class which contains methods to find details of tag
 * @author Akshita Dixit
 */
abstract class Element {
	
	// id of tag
	String id;
	
	// class of tag
	String className;
	
	/**
	 * Constructor for initializing values
	 * @param id - id of the tag
	 * @param className - name of the class of the tag
	 */
	public Element(String id, String className) {
		
		// initializing id
		this.id = id;
		
		// initializing class name
		this.className = className;
	}
	
	/**
	 * returns id of a particular tag
	 * @return id of the tag
	 */
	public String getId() {
		
		return id;
	}
	
	/**
	 * returns class name of a particular tag
	 * @return classname of the tag
	 */
	public String getClassName() {
		
		return className;
	}

	/**
	 * for checking instance of element
	 * @return
	 */
	public boolean has_instance() {
		
		// by default value is false
		return false;
	}

		
}
