package Pojo;

import java.util.HashMap;
import java.util.Map;

public class QuestionPaperWithUser {
	String subject;
	Map<String,User> map = new HashMap<>();
	
	QuestionPaperWithUser(String subject,Map<String,User> map){
		this.subject = subject;
		this.map = map;
	}
	
	public String toString() {
		return "Subject : "+ subject + " Map : "+map;
	}
	
}

class User {
	
	String name,email;
	
	User(String name,String email){
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return "name:"+name+",email : " + email;
	}
}