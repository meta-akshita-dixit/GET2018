package assignment4;

import java.util.NoSuchElementException;

/**
 * This class is used  to make a doubly linked list
 * @author Akshita Dixit
 */
public class DoublyLinkedList {
	
	//Contains the address of starting node of the list
	Node startNode;		
	//Contains the address of last node of the list
	Node lastNode;							
	
	/**
	 * used to add an element at the end of the list
	 * @param data - the data to be added
	 */
	void addElement(int data) {
		
		//making a new node
		Node newNode = new Node();			
		newNode.data = data;
		//adding the node when list is empty 
		if(startNode == null) {
			startNode = newNode;
		} else { //when the node is not the first node
			newNode.previous = lastNode;
			lastNode.next = newNode;
		}
		lastNode = newNode;
	}
	
	/**
	 * used to add element at a particular position
	 * @param data - the data to be added
	 * @param position - the position at which the data is to be added
	 */
	void addElement(int data,int position) {
		
		Node start = startNode;
		int i ;
		
		//used to traverse the list to the required position
		for(i = 1; (i < position - 1) && (start != null); i++) {
			start = start.next;
		}
		
		//checking for index out of bound 
		if((start != null) && (i <= position)) {
			Node newNode = new Node();
			newNode.data = data;
			
			//For adding element at the start of the list
			if(position == 1) {
				newNode.previous = null;
				newNode.next = start;
				start.previous = newNode;
				startNode = newNode;				
			} else {
				//check to add element at the ending of the list
				if(start != lastNode) {
					start.next.previous = newNode;
					newNode.next = start.next;	
				} else {
					lastNode = newNode;
					newNode.next = null;
				}
				start.next = newNode;
				newNode.previous = start;
			}
		} else { 
			//exception for the case position is larger than the list
			throw new ArrayIndexOutOfBoundsException(i);
		}
	}
	
	/**
	 * this function is used to remove data from the linked list
	 * @param data - data to be removed from the list
	 */
	void removeByData(int data) {
		
		Node start = startNode;
		//Searching for the data to be removed
		while(start.next != null) {
			if(start.data == data) {
				break;
			}
			start = start.next;
		}
		if((start == lastNode) && (start.data != data)) {
			throw new NoSuchElementException();
		}
		if(start == startNode) {
			startNode = start.next;
		}
		if(start != lastNode) {
			start.previous.next = start.next;
			start.next.previous = start.previous;
		} else {
			start.previous.next = null;
		}
	}
	
	/**
	 * this function is used to remove data at a particular position in the list
	 * @param position - position from which data is to be removed
	 */
	void removeByPosition(int position) {
		
		Node start = startNode;
		int i;
		// Used to traverse the list to the position needed 
		for(i = 1; (i < position) && (start != null) ; i++) {
			start = start.next;
		}
		// checking for index out of bound 
		if((start != null) && (i <= position)) {
			start.previous.next = start.next;
			start.next.previous = start.previous;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * used to return a data at a particular position
	 * @param position - position at which data have to be returned
	 * @return
	 */
	public int getDataByPosition(int position) {
		
		Node start = startNode;
		int i;
		//Use to traverse till the position
		for(i = 1; (i < position)&&(start != null) ; i++) {
			start = start.next;
		}
		//Checking for index out of bound
		if((start != null) && (i <= position)) {
			return start.data;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	/**
	 * Function used to reverse the list
	 */
	public void reverseLinkedList() {
		
		int size = getSize();
		Node start = startNode;
		Node last = lastNode;
		int temp;
		//Used to swap the first and last element of the list
		for(int i = 0; i < (size / 2); i++) {
			//swapping logic
			temp = start.data;
			start.data  = last.data;
			last.data = temp;
		
			start = start.next;
			last = last.previous;
		}
	}
	
	/**
	 * private function used to get the size of the list
	 * @return size of list
	 */
	private int getSize() {
		
		int size= 0 ;
		Node start = startNode;
		while(start != null) {
			size++;
			start = start.next;
		}
		return size;
	}
	
	/**
	 * This function is used to sort the list
	 */
	public void sortLinkedList() {
		
		int size = getSize();
		Node start = startNode.next;
		
		//insertion sort is used to sort this list out
		for (int i=1; i < size; ++i)
        {
            int key = start.data;
            //temporary node
            Node j = start.previous;
            while (j != null && j.data > key)
            {
                j.next.data = j.data;
                j = j.previous;
            }
            j.next.data = key;
            start = start.next;
        }
	}
	
	/**
	 * Function used to show the list
	 * @return linked list
	 */
	int[] show() {
		
		int size = getSize();
		Node tempStart = startNode;
		//temp array used to store the link list	
		int[] linkList = new int[size];					
		
		//initializing the array
		for(int i = 0; i < size; i++) {
			linkList[i] = tempStart.data;
			tempStart = tempStart.next;
		}
		return linkList;
	}
	
}
