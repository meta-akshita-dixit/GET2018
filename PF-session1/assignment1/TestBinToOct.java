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
	BinToOctal test =new BinToOctal();
	@Test
	public void test() {
		assertEquals(65,test.convertBinaryToOctal(110101));
	}
	@Test
	public void test2() {                                            //false test case
		assertEquals(1,test.convertBinaryToOctal(100001));
	}
}