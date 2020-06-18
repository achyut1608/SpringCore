package Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Employee;

public class ConstructorWithInheritingApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application/constuctorWithInheriting.xml");
		Employee employee1 = (Employee)applicationContext.getBean("employee1");
		Employee employee2 = (Employee)applicationContext.getBean("employee2");
		System.out.println(employee1);
		System.out.println(employee2);
	
	}
}
