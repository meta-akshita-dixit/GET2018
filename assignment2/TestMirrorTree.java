package assignment2;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class contains test cases to check various possiblities
 * of mirror trees.
 * @author Akshita Dixit
 *
 */
public class TestMirrorTree {
	
	//object of BTNode to create tree on left side
	BTNode rootLeft;
	//object of BTNode to create tree on right side
	BTNode rootRight;
	CompareTree ct = new CompareTree();
	
	/**
	 * this test case checks success when two trees are mirror of 
	 * each other
	 */
	@Test
	public void testMirrorTreeSuccess() {
		rootLeft = new BTNode(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new BTNode(10);
		rootRight.addItemReverse(30);
		rootRight.addItemReverse(6);
		rootRight.addItemReverse(31);
		rootRight.addItemReverse(28);
		rootRight.addItemReverse(8);
		rootRight.addItemReverse(4);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	/**
	 * this test case checks success when two trees are not mirror of 
	 * each other
	 */
	@Test
	public void testNotMirrorTreesSuccess() {
		rootLeft = new BTNode(10);
		rootLeft.addItem(6);
		rootLeft.addItem(30);
		rootLeft.addItem(4);
		rootLeft.addItem(8);
		rootLeft.addItem(28);
		rootLeft.addItem(31);
		rootRight = new BTNode(10);
		rootRight.addItemReverse(30);
		rootRight.addItemReverse(6);
		rootRight.addItemReverse(31);
		rootRight.addItemReverse(28);
		rootRight.addItemReverse(8);
		assertFalse(ct.compareMirrorTree(rootLeft, rootRight));
	}
	
	/**
	 * this test case checks success when two trees are
	 * null.
	 */
	@Test(expected = NullPointerException.class)
	public void testNullTreesSuccess() {
		rootLeft = new BTNode((Integer) null);
		rootRight = new BTNode((Integer) null);
		assertTrue(ct.compareMirrorTree(rootLeft, rootRight));
	}
	

}
