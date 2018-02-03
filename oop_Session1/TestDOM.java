package oop_Session1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestDOM {

	    static DOM dom;
		static CompositeElement div1;
		static CompositeElement div2;
	 	static CompositeElement div3;
	 	static AtomicElement a;
	 	static AtomicElement img3;
	 	static AtomicElement img1;
	 	static AtomicElement img2;
	 	
	 	@Before
	 	 public void doBefore() {
	 		dom = new DOM();
	 		div1 = new Div("1", "abc");
	 		div2 = new Div("0", "abc");
	 		a = new A("9", "ab", "asa");
	 		div3 = new Div("4", "abcd");
	 		img3 = new Img("6", "ab", "abcd");
	 		img1 = new Img("3", "ab", "abc"); 
	 		img2 = new Img("8", "ab", "abcd"); 
	 		dom.add(div1);
	 		div1.add(div2);
	 		div2.add(a);
	 		div2.add(div3);
	 		div3.add(img3);
	 		dom.add(img1);
	 		div1.add(img2);
	 	}
	 	@Test
	 	public void className_test_success() {
	 		
	 		List<Element> actual2 = dom.findElementByClass("abcd");
	 		List<String> result = new ArrayList<String>();
	 		for ( Element listElement : actual2) {
	  			result.add(listElement.getClass().getSimpleName());
	  		}
	 		List<String> expected = new ArrayList<String>();
	 		expected.addAll( Arrays.asList("Div","Img","Img"));
	 		assertEquals(expected,result);
	 		
	 	}
	 	
	 	@Test
	 	public void className_test_failure() {
	 		
	 		List<Element> actual2 = dom.findElementByClass("abcd");
	 		List<String> result = new ArrayList<String>();
	 		for ( Element listElement : actual2) {
	  			result.add(listElement.getClass().getSimpleName());
	  		}
	 		List<String> expected = new ArrayList<String>();
	 		expected.addAll( Arrays.asList("   "));
	 		assertNotEquals(expected,result);
	 		
	 	}
	 	@Test
	 	public void id_Test_Success() {
	 		
	 		String actual = dom.findElementByID("3").getClass().getSimpleName();
	 		String expected = "Img" ;
	 		assertEquals(expected,actual);
	 		
	 	}
	 	
	 	@Test
	 	public void id_Test_Failure() {
	 		
	 		String actual = dom.findElementByID("3").getClass().getSimpleName();
	 		String expected = "   " ;
	 		assertNotEquals(expected,actual);
	 		
	 	}
	 	
		@Test (expected=ArithmeticException.class)
	 	public void id_Test_Exception() {
	 		
	 		String actual = dom.findElementByID("-1").getClass().getSimpleName();
	 		String expected = "    " ;
	 		assertEquals(expected,actual);
	 		
	 	}
	 	@Test
	 	public void test_Hierarchy() {
	 		
	 		List<String> expected= new ArrayList<String>();
	 		expected.addAll(Arrays.asList("<Div id='1'>","    <Div id='0'>","        <A id='9'>","        <Div id='4'>",
	 									  "            <Img id='6'>","        </Div>","    </Div>","    <Img id='8'>",
	 									  "</Div>","<Img id='3'>" ));
	 		List<String> actual = dom.displayDOM();
	 		assertEquals(expected,actual);
	 		
	 	}
	 

}
