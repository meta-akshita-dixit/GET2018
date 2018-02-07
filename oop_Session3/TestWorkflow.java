package oop_Session3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestWorkflow {
	
	//this object shows the complete workflow hence needs to be global
	Workflow w = new Workflow("MetaCube hiring process");
	
	/**
	 * This method initializes the State Linked list which is to be used in 
	 * every test case.
	 */
	@Before
	public void beginWorkflow(){
        State startState = new State("start");
		w.addState(startState);
		State hrReviewstate = new State("hr Review");
		w.addState(hrReviewstate);
		State l1_Interview_State = new State("l1 Interview");
		w.addState(l1_Interview_State);
		State l2_Interview_State = new State("l2 Interview");
		w.addState(l2_Interview_State);
		State management_Interview_State = new State("management Interview");
		w.addState(management_Interview_State);
		State offer_state = new State("offer");
		w.addState(offer_state);
		w.setStartState();
		
	}
	
	/**
	 * This test case checks if the candidate has been selected 
	 */
	@Test
	public void testSelectedSuccess() {
		
		Event event1 = new Event("hr process");
		w.transition_step(event1);
		Event event2 = new Event("hr ok");
		w.transition_step(event2);
		Event event3 = new Event("l1 ok");
		w.transition_step(event3);
		Event event4 = new Event("l2 ok");
		w.transition_step(event4);
		Event event5 = new Event("management ok");
		w.transition_step(event5);
		List<Transition> actual_object = w.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("Selected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList("Selected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewmanagement Interviewl2 ok" , 
				 "management Interviewoffermanagement ok"));
		assertEquals(expected,actual);
		
		
	}

	/**
	 * this test case shows that candidate has been rejected
	 */
	@Test
	public void testRejectedSuccess() {
		Event event1 = new Event("hr process");
		w.transition_step(event1);
		Event event2 = new Event("hr ok");
		w.transition_step(event2);
		Event event3 = new Event("l1 ok");
		w.transition_step(event3);
		Event event4 = new Event("l2 reject");
		w.transition_step(event4);
		
		List<Transition> actual_object = w.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList("rejected","starthr Reviewhr process" ,"hr Reviewl1 Interviewhr ok" ,
				 "l1 Interviewl2 Interviewl1 ok" , "l2 Interviewl2 Interviewl2 reject"));
		assertEquals(expected,actual);
		
		
	}
	
	/**
	 * this test case is a negative test case for rejection
	 */
	@Test
	public void testRejectFailure() {
		Event event1 = new Event("hr process");
		w.transition_step(event1);
		Event event2 = new Event("hr ok");
		w.transition_step(event2);
		Event event3 = new Event("l1 ok");
		w.transition_step(event3);
		Event event4 = new Event("l2 reject");
		w.transition_step(event4);
		
		List<Transition> actual_object = w.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList());
		assertNotEquals(expected,actual);
		}
	
	/**
	 * this test case shows the exception test that can occur
	 */
	@Test(expected=NullPointerException.class)
	public void testException() {
		Event event1 = new Event(null);
		w.transition_step(event1);
		Event event2 = new Event("hr ok");
		w.transition_step(event2);
		Event event3 = new Event("l1 ok");
		w.transition_step(event3);
		Event event4 = new Event("l2 reject");
		w.transition_step(event4);
		
		List<Transition> actual_object = w.getTransition_list();
		List<String> actual = new ArrayList<String>() ;
		actual.add("rejected");
		for(Transition se : actual_object) {
			actual.add(se.initialState.stateName + se.finalState.stateName + se.event.eventName);
		}
		List<String> expected = new ArrayList<String>();
		 expected.addAll(Arrays.asList());
		assertNotEquals(expected,actual);
		
		
	}
	
	
}
