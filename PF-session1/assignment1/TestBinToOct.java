/**
 * This class has two methods that are used to convert binary to octal.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */

package assignment1;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestBinToOct {
	@Test
	public void testConversionSuccess() {
		assertEquals(65,BinToOctal.convertBinaryToOctal(110101));
	}
	@Test
	public void testConversionFailure() {                                            //false test case
		assertNotEquals(1,BinToOctal.convertBinaryToOctal(100001));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testConversionNegative() {                                            
		assertNotEquals(1,BinToOctal.convertBinaryToOctal(-2));
	}

}
