package Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Question;

public class ConstructorWithCollectionApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Application/ConstructorWithCollectionContext.xml");
		Question question = (Question)applicationContext.getBean("question");
		System.out.println("Question and answer : " + question);
	}
}
