/**
 * This class has test cases to verify the code for joining two arrays.
 *
 * @version 1 23 Jan 2018
 * @author Akshita Dixit
 */
package assignment6;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJoinArrays {

	JoinArrays ja=new JoinArrays();//object of class JoinArrays used for invoking method join.
	@Test
	public void test() {                 //test case1
		int a[] = {1,2,3,5,7,45,67};
	    int asize = a.length;
	 
	    int b[] = {2,4,5,6,8,55};
	    int bsize =b.length;
	 
	    int c[]=new int[asize+bsize];
	    c=ja.join(a, asize, b, bsize, c);
	}
	@Test
	public void test1() {                //test case2
		int a[] = {1,2,3,5,7,45,67,69,99};
	    int asize = a.length;
	 
	    int b[] = {2,4,5,6,8,55};
	    int bsize =b.length;
	 
	    int c[]=new int[asize+bsize];
	    c=ja.join(a, asize, b, bsize, c);
	}
}
