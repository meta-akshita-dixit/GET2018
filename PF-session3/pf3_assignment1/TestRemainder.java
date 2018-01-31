package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemainder {

		@Test
		public void testSuccess(){
			Remainder r = new Remainder();
			int expectedResult = 0;
			assertEquals(expectedResult,r.rem(2, 1));
		}
		@Test
		public void testSuccess1(){
			Remainder r = new Remainder();
			int expectedResult = 2;
			assertEquals(expectedResult,r.rem(2, 0));
		}
		@Test
		public void testSucces3() {
			Remainder r = new Remainder();
			int expectedResult = 1;
			assertEquals(expectedResult,r.rem(100, 3));
		
	}
		@Test
		public void testFailure(){
			Remainder r = new Remainder();
			int expectedResult = 2;
			assertNotEquals(expectedResult,r.rem(20, 30));
		}

}
