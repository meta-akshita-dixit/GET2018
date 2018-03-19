package assignment1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * this class contains various test cases to check the conversion
 * @author Akshita Dixit
 *
 */
public class InfixToPostfixTest {

	String infixExpression;
	String postfixExpression;
	InfixToPostfix infixToPostfixObject;
	
	/**
	 * setting up object of infixToPostfix
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		infixToPostfixObject = new InfixToPostfix();
		
	}

	/**
	 * test case to check if the postfix expression is as per
	 * expected
	 */
	@Test
	public void testGetPostfixSuccess() {
		infixExpression = "(( a + b ) - c) * d";
		postfixExpression = "ab+c-d*";
		assertEquals(postfixExpression, infixToPostfixObject.infixToPostfix(infixExpression) );
	}

	/**
	 * negative test case
	 */
	@Test
	public void testGetPostfixFailure() {
		infixExpression = "(( a + b ) - c) * d";
		postfixExpression = "ab+c-d";
		assertNotEquals(postfixExpression, infixToPostfixObject.infixToPostfix(infixExpression) );
	}
}
