package pf3_assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGCD {

	GCD g = new GCD();
	@Test
	public void test() {
		assertEquals(1,g.gcd(2, 1));
	}
	@Test
	public void test1() {
		assertEquals(6,g.gcd(12, 18));
	}
	@Test
	public void test2() {
		
		assertEquals(1,g.gcd(100, 3));
	}
}
