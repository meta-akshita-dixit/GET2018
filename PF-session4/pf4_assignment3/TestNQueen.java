package pf4_assignment3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import assignment4.TestFCFS;

public class TestNQueen {

	NQueen n = new NQueen();
	TestFCFS f = new TestFCFS();
	int arr[][], arr2[][], arr3[][];
	int expArr[][];
	@Before
	public void begin() {
		arr = new int[][]{{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
		expArr = new int[][]{{0,1,0,0},
				{0,0,0,1},
				{1,0,0,0},
				{0,0,1,0}};
		
			
	}
	@Test
	public void test() {
		assertTrue(n.nQueen(arr, 0, arr.length));
		assertTrue(f.isArrayEqual(expArr,n.boardStatus(arr)));
	}

	@Before
	public void begin1() {
		arr2 = new int[][]{{0,0,0},
			{0,0,0},
			{0,0,0}};
			
	}
	@Test
	public void test1() {
		assertTrue(n.nQueen(arr2, 0, arr2.length));
	}
	
	@Before
	public void begin3() {
		arr3 = new int[][]{{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}};
			
	}
	@Test
	public void test3() {
		assertTrue(n.nQueen(arr3, 0, arr3.length));
	}

}
