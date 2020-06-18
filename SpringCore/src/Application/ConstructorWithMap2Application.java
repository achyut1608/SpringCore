package Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.QuestionPaperWithUser;

public class ConstructorWithMap2Application {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application/constructorWithMap2Context.xml");
		
		QuestionPaperWithUser user = (QuestionPaperWithUser)applicationContext.getBean("questionPaper");
		System.out.println(user);
	}
}
