package oop_Session1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * this class represents Document object model 
 * has various method to get details of the tag
 * @author Akshita Dixit
 * 
 */
public class DOM{
	
	// List containing tags in DOM
	List<Element> element = new ArrayList<Element>();

	/**
	 * for adding element in DOM
	 * @param a
	 */
	void add(Element a){
		
		// adding element
		element.add(a);
	}
	
	/**
	 *  
	 * Searches element by ID
	 * @param id contains the id of the tag that has to be returned
	 * @returns Element object containing the tag of the id that was passed
	 *
	 */
	Element findElementByID (String id) throws Exception{
		
		if(Integer.valueOf(id) == null){
			throw new Exception("ID can not be negative");
			
		}
		
		//checks if id is negative
		if(Integer.valueOf(id) < 0){
			throw new Exception("ID can not be negative");
			
		}
		// loop for elements in DOM
		for( Element tag : element) {
			
			// calling function for checking id
			Element return_tag = returnElementById(tag , id);
			
			// checking return_tag if null or not
			if(return_tag != null){
				
				// returns return_tag
				return return_tag;
			}
				
		}
		// if element not found returns null
		return null;
	}
	
	/**
	 * 
	 * Searches element by ID in Composite element list
	 * @param tag is the element object that has to checked for the passed id
	 * @param id contains the id of the tag that has to be returned
	 * @return Element object containing the tag of the id that was passed
	 *
	 */
	Element checkIdInComposite(Element tag, String id){
		
		// loop to check id of element in list of composite element
		for(Element tagInList: ((CompositeElement) tag).tagList()) {
			
			// calling function for checking id
			Element return_tag = returnElementById(tagInList , id);
			
			// checking return_tag if null or not
			if(return_tag != null){
				
				// return tag
				return return_tag;
			}
	
		}
		
		// if element not found returns null
		return  null;
	}
	
	/**
	 * 
	 * method that checks the passed tag's id with the id passed as parameter
	 * @param tag is the element object that has to checked for the passed id
	 * @param id contains the id of the tag that has to be returned
	 * @return Element object containing the tag of the id that was passed
	 */
	private Element returnElementById(Element tag, String id) {
		
		// checks tag id
		if ( id == tag.getId()) {
			
			// return tag
			return tag;
		}
	
		// check if tagInList is a composite element or not
		if(tag.has_instance()) {
			
			// recursive call for checking list of tagInList element
			Element return_tag = checkIdInComposite(tag, id);
			
			// checks if return_tag is null or not
			if (return_tag != null){
				
				// returns tag
				return return_tag;
			}
		}
		
		// if element not found then return null
		return null;
	}

	/**
	 * Searches element by class name
	 * @param className contains name of class whose tag has to be searched
	 * @returns Element's List-list of elements having same class as passed
	 * 
	 */
	List<Element> findElementByClass(String className) {
		
		// list contains element of same class
		List<Element> list = new ArrayList<Element>();
		
		// loop for checking DOM element class name
		for( Element tag : element) {
			
			// add elements to return list
			list.addAll(AddElementByClass(tag , className));
		}
		
		// returns list
		return list;
	}
	
	/**
	 *
	 * checks if the classname of the tag is same as parameter classname 
	 * then adds in the list
	 * @param tag contains the tag name whose classname will be compared with 
	 *        passed classname
	 * @param className contains name of class whose tag has to be searched
	 * @return list containing tags
	 */
	private List<Element> AddElementByClass(Element tag,
			String className) {
		
		// List contains tags
		List<Element> list = new ArrayList<Element>();
		
		// checks tag's class name
		if ( className == ((Element) tag).getClassName()) {
			
			// add the tag into list
			list.add(tag);
			
		}  
		
		//checks instance
		if(tag.has_instance()) {
			
			// calling recursive function to check list if composite element
			list.addAll( checkClassInComposite(tag, className) );
		}
		
		// returns list
		return list;
	}

	/**
	 * This is a recursive method to find element by Class
	 * @param tag contains the tag name whose classname will be compared with 
	 *        passed classname.
	 * @param className contains name of class whose tag has to be searched
	 * @return list containing tag having same classname
	 */
	List<Element> checkClassInComposite(Element tag, String className) {
		
		// list containing tags
		List<Element> list = new ArrayList<Element>();
		
		// loop to check class name of element in list of composite element
		for(Element tagInList: ((CompositeElement) tag).tagList()) {
			
			// add returned tags to list
			list.addAll(AddElementByClass(tagInList , className));
			
		}
		// returns list
		return  list;
	}
	
	/**
	 * To get the list of elements of the DOM in hierarchical form
	 * @return the list of the hierarchy of elements
	 */
	public List<String> displayDOM(){
		// list contains String of DOM hierarchy
		List<String> hierarchy = new ArrayList<String>();
		
		// loop for adding string into hierarchy
		for (Element tag : element) {
			
			// checks instance of composite element
			if(tag.has_instance()){
				hierarchy.add("<" + tag.getClass().getSimpleName() + " id='"+tag.getId()+"'>");
				hierarchy.addAll( displayDomRecursive(tag, 1) );
				hierarchy.add("</" + tag.getClass().getSimpleName() + ">");
			} else {
				hierarchy.add("<" + tag.getClass().getSimpleName() +  " id='"+tag.getId()+"'>");
			}
		}
		
		// returns list
		return hierarchy;
	}
	/**
	 * Recursive function to find the hierarchy of elements
	 * @param element - the composite element
	 * @param count - counts the hierarchy, upto what level the element is
	 * @return - the list
	 */
	private List<String> displayDomRecursive(Element tag, int count){
		
		// loop for adding string into hierarchy
		List<String> hierarchy = new ArrayList<String>();
		
		// loop for adding string of composite elements into hierarchy
		for (Element ele : ((CompositeElement) tag).tagList()) {
			
			// checks instance of composite element
			if(ele.has_instance()){
				hierarchy.add(generate_spaces(count)+"<" + ele.getClass().getSimpleName() + " id='"+ele.getId()+"'>");
				hierarchy.addAll( displayDomRecursive(ele, count + 1) );
				hierarchy.add(generate_spaces(count)+"</" + ele.getClass().getSimpleName() + ">");
			} else {
				hierarchy.add(generate_spaces(count)+"<" + ele.getClass().getSimpleName() + " id='"+ele.getId()+"'>");
			}
		}
		
		// returns list
		return hierarchy;
	}
	/**
	 * Counts the spaces to be printed to maintain hierarchy
	 * @param count- counts spaces
	 * @return string of spaces
	 */
	protected String generate_spaces(int count){
		
		String space="";
		
		// loop for adding spaces
		while(count != 0){
			space += "    ";
			count--;
		}
		
		// return spaces
		return space;
	}
}
