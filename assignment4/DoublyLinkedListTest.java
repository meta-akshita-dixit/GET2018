package assignment4;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;

public class DoublyLinkedListTest {

	DoublyLinkedList linkList;
	/**
	 * this method initializes the linked list
	 */
	@Before
	public void init() {
		
		linkList = new DoublyLinkedList();
		linkList.addElement(1);
		linkList.addElement(8);
		linkList.addElement(3);
		linkList.addElement(4);		
		linkList.addElement(6);
		linkList.addElement(7);
		linkList.addElement(8);
		linkList.addElement(9);
		linkList.addElement(5,5);
	}
	
	/**
	 * this method tests if element is being added successfully or  not
	 */
	@Test
	public void testAddElementSuccess() {
		
		int[] expected = {1,8,3,4,5,6,7,8,9};
		int[] actual = linkList.show();
		assertArrayEquals(expected, actual);
	}

	/**
	 * this method tests if element is being added successfully at the given
	 * position or  not
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testAddElementAtPositionSuccess() {
		linkList.addElement(12, 12);
	}
	
	/**
	 * this method tests if element is being removed successfully or  not
	 */
	@Test
	public void testRemoveElementByDataSuccess() {
		
		linkList.removeByData(9);
		int[] expected = {1,8,3,4,5,6,7,8};
		int[] actual = linkList.show();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * this method tests if element is being removed successfully or  not
	 */
	@Test
	public void testRemoveElementByDataFailure() {
		
		linkList.removeByData(9);
		int[] expected = {1,8,3,4,5,6,7,9};
		int[] actual = linkList.show();
		assertNotEquals(expected, actual);
	}
	
	/**
	 * this method tests if element is to be removed is in list or not
	 */
	@Test(expected = NoSuchElementException.class)
	public void testRemoveElementByDataException() {
		linkList.removeByData(10);
	}
	
	/**
	 * this method tests if element at given position is being removed successfully or not
	 */
	@Test
	public void testRemoveElementByPositionSuccess() {
		
		linkList.removeByPosition(8);
		int[] expected = {1,8,3,4,5,6,7,9};
		int[] actual = linkList.show();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * this method tests if element at given position exists or not and throws exception
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testRemoveElementByPositionException() {
		
		linkList.removeByPosition(11);
	}

	/**
	 * this method tests if element at given position is same as given or not
	 */
	@Test
	public void testDataAtPositionSuccess() {
		
		int expected = 7;
		assertEquals(expected, linkList.getDataByPosition(7));
	}
	
	/**
	 * this method tests reversal of list
	 */
	@Test
	public void testReverseSuccess() {
		
		linkList.reverseLinkedList();
		int[] expected = {9,8,7,6,5,4,3,8,1};
		int[] actual = linkList.show();
		assertArrayEquals(expected, actual);
	}
	
	/**
	 * this method tests sorting of list
	 */
	@Test
	public void testSortSuccess() {
		
		linkList.sortLinkedList();
		int[] expected = {1,3,4,5,6,7,8,8,9};
		int[] actual = linkList.show();
		assertArrayEquals(expected, actual);
	}

}
