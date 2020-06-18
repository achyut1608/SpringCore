package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autowiring.A;

public class AutoWiringByTypeApplication {
	public static void main(String []args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring/autoWiringByTypeContext.xml");
		A a = (A) applicationContext.getBean("a");
		a.display();
	}
}
