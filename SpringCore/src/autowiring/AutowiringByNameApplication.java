package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByNameApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring/autowiringByNameContext.xml");
		A a = (A) applicationContext.getBean("a");
		a.display();
	}
}
