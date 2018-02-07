package oop_Session2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestSurvey {
	/*creating all necessary instances*/
	private static List<Participant> participantList ;
	private static IOFile read ;
	private static List<Question> questionList ;
	private static Participant p1 ;
	private static Participant p2 ;
	private static Participant p3 ;
	static int count = 0;
	
	@BeforeClass
	/**
	 * Function that performs all operations before the participants answers the question
	 * operations include -
	 * reading the question and storing it
	 * creation of participants
	 */
	 public static void doBefore() {
		participantList = new ArrayList<>();
		read = new IOFile("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\input.txt");
		try {
			read.readQuestion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		questionList = read.getQuestionList();
		p1 = new Participant();
		p2 = new Participant();
		p3 = new Participant();
		participantList.add(p1);
		participantList.add(p2);
		participantList.add(p3);
	}
	

	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test1PercentageSuccess() {
		System.out.println(count++);
		String[] arr1 = new String[] {"1","communication","feedback"};						//Answers by 1st participant
		String[] arr2 = new String[] {"2","communication/Delivery Process","feedback correct"};	//Answers by 2nd participant		
		String[] arr3 = new String[] {"2","communication/Delivery Process","feedback given"};	//Answers by 3rd participant
		int i = 0;
		//System.out.println("enter loop");
		for (Question q : questionList){
			p1.setParticipantAnswer(q, arr1[i]);
			p2.setParticipantAnswer(q, arr2[i]);
			p3.setParticipantAnswer(q, arr3[i++]);
		}
		Calculation calc = new Calculation();
		//Calculation of the percentage for every option selected
		//this loop is for the number of total participants
		for(Participant p : participantList){
			//loop to iterate through all questions for a particular participant
			for(Entry<Question, String> m : p.getAnswerList().entrySet()){
				Question ques = m.getKey();
				if(ques.getType().equalsIgnoreCase("single")){
					List<String> list = ques.getQuestionType().getOptions();
					for(String s : list){
						if(s.equalsIgnoreCase((String) m.getValue())){
							ques.getResultObject().setResult(s);
						}
					}
					calc.calculate(ques, participantList.size());
				}
			}
		}
		HashMap<Integer,LinkedHashMap<String,String>> actual = new LinkedHashMap<Integer, LinkedHashMap<String,String>>();
		/*Storing expected result*/
		HashMap<Integer,LinkedHashMap<String,String>> expected = new LinkedHashMap<Integer, LinkedHashMap<String,String>>();
		HashMap< String, String> question = new LinkedHashMap< String, String>();
		question.put("1","33%");
		question.put("2","66%");
		question.put("3","0%");
		question.put("4","0%");
		question.put("5","0%");
		expected.put(1,(LinkedHashMap<String, String>)question.clone());
		
		boolean result= false;
		i=1;
		for(Question q : questionList){
			if(q.getType().equalsIgnoreCase("single")){
				actual.put(i++, (LinkedHashMap<String, String>) (q.getResultObject().getResultPercentage()));
			}
		}
		/*Checks if the final answer is true*/
		assertTrue(expected.equals(actual));
	}
	
	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test2SortSuccess() {
		System.out.println(count++);
		List<Question> questionLis ;
		SortQuestion s = new SortQuestion();
		questionLis = s.sortQuestion(questionList);
		List <String> actual = new ArrayList<String>();
		List <String> expected = new ArrayList<String>();
		for(Question q : questionLis){
			actual.add(q.getType() + ", " + q.getQuestion() + ", " +q.getQuestionOptions());
		}
		expected.addAll(Arrays.asList("multi, Areas of improvement, Service Quality/Communication/Delivery Process",
									  "single, overall rating, 1/2/3/4/5","text, Trainee Feedback, null"));
		assertEquals(expected,actual);
	}
	
	
	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test3SortFailure() {
		System.out.println(count++);
		List<Question> questionList1;
		SortQuestion s1 = new SortQuestion();
		questionList1 = s1.sortQuestion(questionList);
		List <String> actual = new ArrayList<String>();
		List <String> expected = new ArrayList<String>();
		for(Question q : questionList1){
			actual.add(q.getType() + ", " + q.getQuestion() + ", " +q.getQuestionOptions());
		}
		expected.addAll(Arrays.asList("multi, Areas of improvement, Service Quality/Communication/Delivery Process",
									  "single, overall rating, ","text, Trainee Feedback, null"));
		assertNotEquals(expected,actual);
	}
	@Test
	/**
	 * This function compares the output files with the expected results
	 */
	public void testFileSuccess() {
		List<String> expected = new ArrayList<String>();
		List<String> actual = new ArrayList<String>();
		expected.addAll(Arrays.asList("Participant 1, 1, communication, feedback","Participant 2, 2, communication/Delivery Process, feedback correct","Participant 3, 2, communication/Delivery Process, feedback given"));
		File file = new File("C:\\Users\\admin\\workspace\\OOPS-session2\\src\\assignment_1\\participant-Result.txt");
		Scanner scanner;
		try {
			scanner = new Scanner (file);
			while (scanner. hasNext ()) 
			{
				actual.add(scanner.nextLine());
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expected,actual);
	}
	
	

}
