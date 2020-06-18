package setterApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterPojo.Employee;

public class SetterIntroductionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplication/setterIntroduction.xml");
		Employee employee = (Employee)applicationContext.getBean("employee");
		System.out.println(employee);
	}

}
