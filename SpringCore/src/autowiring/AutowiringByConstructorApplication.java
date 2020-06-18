package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringByConstructorApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowiring/autowiringByConstructorContext.xml");
		A a = (A)applicationContext.getBean("a");
		a.display();
	}
	
}
