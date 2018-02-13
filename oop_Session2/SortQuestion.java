package oop_Session2;

import java.util.ArrayList;
import java.util.List;

/**
 * this class sorts the questions in the question list using selection sort algorithm
 * @author Akshita Dixit
 *
 */
public class SortQuestion {
		
	/**
	 * method sorts the question list
	 * @param questionList- list of question objects
	 * @return list - sorted list
	 */
	public List<Question> sortQuestion(List<Question> questionList){
		List<Question> listOfQuestions = new ArrayList<>();
			
		/*Sort the question using selection sort concept*/
		for(int i = 0; i < questionList.size() - 1; i++){
			String temp = questionList.get(i).getQuestion();		//stores the question string
			Question tempQuestion = questionList.get(i);			//stores the object of question
				
			/*finds the smallest element*/
			for(int j = i+1; j < questionList.size(); j++){
				
				if( questionList.get(j).getQuestion(). compareToIgnoreCase(temp) < 0){
					temp = questionList.get(j).getQuestion();
					tempQuestion = questionList.get(j);
				}
			}
			listOfQuestions.add(tempQuestion);				//add smallest element in the list
			questionList.remove(tempQuestion);
		}
		listOfQuestions.addAll(questionList);				//add remaining element to the list
		return listOfQuestions;
	}
}

