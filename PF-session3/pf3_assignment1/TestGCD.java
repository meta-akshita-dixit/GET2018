package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCD {

	
	@Test
	public void testSuccess() {
		GCD g = new GCD();
		assertEquals(1,g.gcd(2, 1));
	}
	@Test
	public void testSuccess1() {
		GCD g = new GCD();
		assertEquals(6,g.gcd(12, 18));
	}
	@Test
	public void testSuccess2() {
		GCD g = new GCD();
		assertEquals(1,g.gcd(100, 3));
	}
	
	@Test
	public void testFailure() {
		GCD g = new GCD();
		assertNotEquals(2,g.gcd(100, 3));
	}
}

