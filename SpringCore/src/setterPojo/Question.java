package setterPojo;

import java.util.List;

public class Question {
	String question;
	List<String> list;
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	
	public String toString() {
		return "Question : "+question + "List<String> list : " + list;
	}
}
