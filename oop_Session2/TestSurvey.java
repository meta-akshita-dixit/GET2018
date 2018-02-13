package oop_Session2;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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

	@Test
	/**
	 * This function simulates the test given by the participants
	 * it also calculates the result and compares it with the expected result
	 */
	public void test1PercentageSuccess() {
		 List<Participant> participantsList ;
		 IOFile read ;
		 List<Question> questionList ;
		 Participant p1 ;
		 Participant p2 ;
		 Participant p3 ;
		
		participantsList = new ArrayList<>();
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
		participantsList.add(p1);
		participantsList.add(p2);
		participantsList.add(p3);
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
		for(Participant p : participantsList){
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
					calc.calculate(ques, participantsList.size());
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
		 List<Participant> participantsList ;
		 IOFile read ;
		 List<Question> questionsList ;
		 Participant p1 ;
		 Participant p2 ;
		 Participant p3 ;
		
		participantsList = new ArrayList<>();
		read = new IOFile("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\input.txt");
		try {
			read.readQuestion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		questionsList = read.getQuestionList();
		p1 = new Participant();
		p2 = new Participant();
		p3 = new Participant();
		participantsList.add(p1);
		participantsList.add(p2);
		participantsList.add(p3);
		String[] arr1 = new String[] {"1","communication","feedback"};						//Answers by 1st participant
		String[] arr2 = new String[] {"2","communication/Delivery Process","feedback correct"};	//Answers by 2nd participant		
		String[] arr3 = new String[] {"2","communication/Delivery Process","feedback given"};	//Answers by 3rd participant
		SortQuestion s = new SortQuestion();
		questionsList = s.sortQuestion(questionsList);
		List <String> actual = new ArrayList<String>();
		List <String> expected = new ArrayList<String>();
		for(Question q : questionsList){
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
		 List<Participant> participantsList ;
		 IOFile read ;
		 List<Question> questionsList ;
		 Participant p1 ;
		 Participant p2 ;
		 Participant p3 ;
		
		participantsList = new ArrayList<>();
		read = new IOFile("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\input.txt");
		try {
			read.readQuestion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		questionsList = read.getQuestionList();
		p1 = new Participant();
		p2 = new Participant();
		p3 = new Participant();
		participantsList.add(p1);
		participantsList.add(p2);
		participantsList.add(p3);
		String[] arr1 = new String[] {"1","communication","feedback"};						//Answers by 1st participant
		String[] arr2 = new String[] {"2","communication/Delivery Process","feedback correct"};	//Answers by 2nd participant		
		String[] arr3 = new String[] {"2","communication/Delivery Process","feedback given"};	//Answers by 3rd participant
		List<Question> questionList1;
		SortQuestion s1 = new SortQuestion();
		questionList1 = s1.sortQuestion(questionsList);
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
		List<Participant> participantsList ;
		 IOFile read ;
		 List<Question> questionsList ;
		 Participant p1 ;
		 Participant p2 ;
		 Participant p3 ;
		
		participantsList = new ArrayList<>();
		read = new IOFile("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\input.txt");
		try {
			read.readQuestion();
		} catch (IOException e) {
			e.printStackTrace();
		}
		questionsList = read.getQuestionList();
		p1 = new Participant();
		p2 = new Participant();
		p3 = new Participant();
		participantsList.add(p1);
		participantsList.add(p2);
		participantsList.add(p3);
		String[] arr1 = new String[] {"1","communication","feedback"};						//Answers by 1st participant
		String[] arr2 = new String[] {"2","communication/Delivery Process","feedback correct"};	//Answers by 2nd participant		
		String[] arr3 = new String[] {"2","communication/Delivery Process","feedback given"};	//Answers by 3rd participant
		int i = 0;
		//System.out.println("enter loop");
		for (Question q : questionsList){
			p1.setParticipantAnswer(q, arr1[i]);
			p2.setParticipantAnswer(q, arr2[i]);
			p3.setParticipantAnswer(q, arr3[i++]);
		}
		try {
			read.writeAnswer(participantsList);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		List<String> expected = new ArrayList<String>();
		List<String> actual = new ArrayList<String>();
		expected.addAll(Arrays.asList("Participant 1, 1, communication, feedback","Participant 2, 2, communication/Delivery Process, feedback correct","Participant 3, 2, communication/Delivery Process, feedback given"));
		File file = new File("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\participant-Result.txt");
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
