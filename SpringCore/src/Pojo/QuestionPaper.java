package Pojo;

import java.util.HashMap;
import java.util.Map;

public class QuestionPaper {
	String subjectName;
	Map<String,String>map = new HashMap<String,String>();
	
	QuestionPaper(String subjectName,Map<String,String> map){
		this.subjectName = subjectName;
		this.map = map;
	}
	
	public String toString() {
		return "SubjectName : "+subjectName+",Questions are : " + map+",";
	}
}
