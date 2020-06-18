package Pojo;

import java.util.List;

public class Question {
	
	String question;
	List<String>answers;
	
	Question(String question,List<String> answer){
		this.question = question;
		this.answers = answer;
	}
	
	public String toString() {
		return "Question "+  question + " Options are : " + answers;
		
	}
}
