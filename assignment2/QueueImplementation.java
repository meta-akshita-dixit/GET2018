package assignment2;

import java.util.Arrays;

/**
 * This class contains various methods to show implementation of queue
 * @author Akshita Dixit
 *
 */
public class QueueImplementation<T> {
	
	//array of object type
	T[] queueArray ;
	int rear, front;
	
	/**
	 * constructor to initialize array and front and rear
	 */
	public QueueImplementation() {
		queueArray = (T[]) new Object[0];
		 this.front = -1;
		 this.rear = -1;
	}

	/**
	 * method to add element in the queue
	 * @param item -object to be added
	 */
	public void enqueue(T item) {

		//new temporary array
		T[] newArray;
		
	    //copies existing array to temp array
		newArray = Arrays.copyOf(queueArray, queueArray.length+1);
		
		//adding element at the end of the list
		 if(this.front == -1) {
			 this.front++;
			 this.rear++;
			 newArray[this.front] = item;
		 } else {
			 newArray[++this.rear] = item;
		 }
		 
		//Referencing arraylist to reflect updated array
		queueArray = newArray;
				
	}
	 
	 /**
	  * method to remove element from the queue
	  * @return object dequeued
	  */
	 public T dequeue() {
		 
		T item = null;
		
		//boundary condition
		if(front == -1 || front > rear) {
			throw new ArrayIndexOutOfBoundsException();
		} else if(front <= rear) {
			item = queueArray[front];
			front++;
		}
		return item;
	 }
	 
	 /**
	  * method to get the object at front of queue
	  * @return object at front
	  */
	 public T getFront( ) {
		 
		 T item = null;
		 
		//boundary condition
		 if(front == -1 || front > rear) {
				throw new ArrayIndexOutOfBoundsException();
			} else if(front <= rear){
				item = queueArray[front];
			}
		return item;
	 }
	 
	 /**
	  * method to empty the queue by making front and rear -1
	  */
	 public void makeEmpty( ) {
		 
		while(front < rear) {
			
			//boundary condition
			if(front == -1) {
				
				throw new ArrayIndexOutOfBoundsException();
				
			} else if(front <= rear) {
				
				front++;
			}
			front = rear = -1;
		}
	 }
	  
	 /**
	  * method to get value of rear
	  * @return int value of rear
	  */
	  public int getRear() {
			return rear;
	  }
	  
	  /**
	   * method to get object from the queue
	   * @param index - position of element to be searched
	   * @return
	   */
	  public T getElement(int index) {
		  
		  return queueArray[index];
	  }
	  
	  /**
	   * method to get the queue of objects
	   * and copy it in another array
	   * @return
	   */
	  public T[] getQueue(T[] arr) {
		  for(int i = 0; i < this.queueArray.length; i++) {
			  arr[i] = this.queueArray[i];
		  }
		  return arr;
	  }
	  
	  /**
	   * method to get the queue of objects for direct implementation 
	   * @return array
	   */
	  public T[] getQueue() {
		  return this.queueArray;
	  }
	  
	  /**
	   * method to get size of queue
	   * @return length of queue
	   */
	  public int size() {
		  return this.queueArray.length;
	  }
}
