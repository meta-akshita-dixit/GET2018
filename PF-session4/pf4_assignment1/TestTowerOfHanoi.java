package pf4_assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestTowerOfHanoi {
	List<String> ls = new ArrayList<String>();
	List<String> ls1 = new ArrayList<String>();
	List<String> ls2 = new ArrayList<String>();
	TowerOfHanoi t,t1,t2 ;
	@Before
	public void begin(){
		  t = new  TowerOfHanoi(1);
	      ls.add("Move Disk 1 from A to B"); 
	      }
	
	@Test
	public void test() {
	        assertEquals(ls,t.towerOfHanoi("A" ,"B","C",1));
	}
	@Before
	public void begin1(){
		  t1 = new  TowerOfHanoi(2);
	      ls1.add("Move Disk 2 from A to C");
	      ls1.add("Move Disk 1 from A to B"); 
	      ls1.add("Move Disk 2 from C to B"); 
	      }
	
	@Test
	public void test1() {
	        assertEquals(ls1,t1.towerOfHanoi("A" ,"B","C",2));
	}
	@Before
	public void begin2(){
		  t2 = new  TowerOfHanoi(3);
	      ls2.add("Move Disk 3 from A to B");
	      ls2.add("Move Disk 2 from A to C");
	      ls2.add("Move Disk 3 from B to C");
	      ls2.add("Move Disk 1 from A to B");
	      ls2.add("Move Disk 3 from C to A");
	      ls2.add("Move Disk 2 from C to B");
	      ls2.add("Move Disk 3 from A to B");
	      }
	
	@Test
	public void test2() {
	        assertEquals(ls2,t2.towerOfHanoi("A" ,"B","C",3));
	}
}
