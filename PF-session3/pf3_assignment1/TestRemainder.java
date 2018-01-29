package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemainder {

	
		Remainder r = new Remainder();
		@Test
		public void test(){
			int expectedResult = 0;
			assertEquals(expectedResult,r.rem(2, 1));
		}
		@Test
		public void test1(){
			int expectedResult = 2;
			assertEquals(expectedResult,r.rem(2, 0));
		}
		@Test
		public void test2() {
			int expectedResult = 1;
			assertEquals(expectedResult,r.rem(100, 3));
		
	}

}
