package setterApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterPojo.Collection2;
import setterPojo.Question;

public class SetterIntroductionWithCollection2Application {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplication/setterIntroductionWithCollection2Context.xml");
		Collection2 collection2 = (Collection2)applicationContext.getBean("collection2");
		System.out.println(collection2);
	}
}
