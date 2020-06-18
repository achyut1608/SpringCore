package Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.QuestionPaper;

public class ConstructorWithMapApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application/constructorWithMapContext.xml");
		QuestionPaper questionPaper = (QuestionPaper)applicationContext.getBean("questionPaper");
		System.out.println(questionPaper);
	}
}
