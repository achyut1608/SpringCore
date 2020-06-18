package setterApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterPojo.WithMap2;

public class SetterIntroductionWithMap2Application {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplication/setterIntroductionWithMap2Context.xml");
		WithMap2 withMap2 = (WithMap2) applicationContext.getBean("withMap2");
		System.out.println(withMap2);
		
	}
}
