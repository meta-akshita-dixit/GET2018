package assignment_2;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class contains test cases to check various possiblities
 * of mirror trees.
 * @author Akshita Dixit
 *
 */
public class TestmirrorTree {

	//object of Node to create tree on left side
	Node<Integer> rootLeft;
	//object of Node to create tree on right side
	Node<Integer> rootRight;
	CompareTrees<Integer> ct = new CompareTrees<Integer>();
	
	/**
	 * this test case checks success when two trees are mirror of 
	 * each other
	 */
	@Test
	public void testMirrorTreeSuccess() {
		rootLeft = new Node<>(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new Node<>(10);
		rootRight.addItem(30);
		rootRight.addItem(6);
		rootRight.addItem(31);
		rootRight.addItem(28);
		rootRight.addItem(8);
		rootRight.addItem(4);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	/**
	 * this test case checks success when two trees are not mirror of 
	 * each other
	 */
	@Test
	public void testNotMirrorTreesSuccess() {
		rootLeft = new Node<>(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new Node<>(10);
		rootRight.addItem(30);
		rootRight.addItem(6);
		rootRight.addItem(31);
		rootRight.addItem(28);
		rootRight.addItem(8);
		assertFalse(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	/**
	 * this test case checks success when two trees are
	 * null.
	 */
	@Test
	public void testNullTreesSuccess() {
		rootLeft = new Node<>((Integer) null);
		rootRight = new Node<>((Integer) null);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
}
