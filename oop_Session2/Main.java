package oop_Session2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String args[]) throws IOException{
		List<Participant> participantList = new ArrayList<>();
		
		IOFile read = new IOFile("C:\\Users\\admin\\workspace\\OOP\\src\\oop_Session2\\input.txt");
		read.readQuestion();
		
		List<Question> questionList = read.getQuestionList();
		
		Participant p1 = new Participant();
		participantList.add(p1);
		Participant p2 = new Participant();
		participantList.add(p2);
		
		String[] arr1 = new String[] {"1","communication","I'm the best"};
		String[] arr2 = new String[] {"2","communication/Delivery Process","I'm the best"};
		
		int i = 0;
		for (Question q : questionList){
			p1.setParticipantAnswer(q, arr1[i]);
			p2.setParticipantAnswer(q, arr2[i++]);
		}

		Calculation calc = new Calculation();
		for(Participant p : participantList){
			for(Map.Entry m : p.getAnswerList().entrySet()){
				Question ques = (Question) m.getKey();
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
		for(Question q : questionList){
			if(q.getType().equalsIgnoreCase("single")){
				System.out.println((LinkedHashMap<String, String>) (q.getResultObject().getResultPercentage()));
			}
		}
		read.writeAnswer(participantList);
		
		/*for(Question q : questionList){
			if(q.getType().equalsIgnoreCase("single")){
				System.out.print(q.getQuestion() + ",");
				System.out.print(q.getType() + ",");
				System.out.println(q.getQuestionOptions());
				HashMap<String, String> answer = q.getRes().getResult();
				for(Entry<String, String> m : answer.entrySet()){
					System.out.println("\t" + m.getKey() + " - " + m.getValue());
				}
			}
		}*/
		System.out.println("before");
		for(Question q : questionList){
			System.out.println(q.getType() + ", " + q.getQuestion() + ", " +q.getQuestionOptions());
		}
		
		SortQuestion s = new SortQuestion();
		questionList = s.sortQuestion(questionList);
		System.out.println("after");
		for(Question q : questionList){
			System.out.println(q.getType() + ", " + q.getQuestion() + ", " +q.getQuestionOptions());
		}
	}
}