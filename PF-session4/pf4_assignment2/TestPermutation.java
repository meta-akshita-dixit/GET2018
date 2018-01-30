package pf4_assignment2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestPermutation {

	Permutation p = new Permutation();
	List<String> ls = new ArrayList<String>();
    @Before
    public void begin()
    {
    	ls.add("ABC");
    	ls.add("ACB");
    	ls.add("BAC");
    	ls.add("BCA");
    	ls.add("CBA");
    	ls.add("CAB");
    }
	@Test
	public void test() {
		assertEquals(ls,p.permutation("ABC"));
		
	}

}
