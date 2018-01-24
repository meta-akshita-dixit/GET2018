package assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRemovingDuplicate {
     
    RemovingDuplicates rmdu = new RemovingDuplicates();
    
	@Test
	public void test() {
		int arr[]={1,2,3,4,5,2,3,7,6};
		int expecteedArr[]={1,2,3,4,5,7,6};
		assertArrayEquals(expecteedArr,rmdu.removeDuplicate(arr));
	}

}
