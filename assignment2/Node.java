package assignment_2;

/**
 * this class creates the tree using the given methods
 * @author Akshita Dixit
 */
public class Node<T> {
	
	public T data;
	public Node<T> left;
	public Node<T> right;
	
	/**
	 * constructor to initailize the node
	 * @param data
	 */
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	/**
	 * recursive method to add node
	 * @param item
	 */
	public void addItem(T item){
		if(this.left == null) {
			this.left = new Node<T>(item);
		} else if(this.right == null) {
			this.right = new Node<T>(item);
		} else {
			if(this.left.left == null || this.left.right == null) {
				this.left.addItem(item);
			} else if(this.right.right!=null) {
				this.left.addItem(item);
			} else {
				this.right.addItem(item);
			}
		}
	}
}




