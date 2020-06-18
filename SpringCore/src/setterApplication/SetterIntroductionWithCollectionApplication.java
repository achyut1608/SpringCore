package setterApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterPojo.Question;

public class SetterIntroductionWithCollectionApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplication/setterIntroductionWithCollectionContext.xml");
		
		Question question = (Question)applicationContext.getBean("question");
		System.out.println(question);
	}
}
