package Application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Employee;

public class ConstructorWithOtherObjectApplication {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application/constructoruWithOtherObjectContext.xml");
		Employee employee=(Employee) applicationContext.getBean("employee");
		System.out.println("Employee : "+ employee);
	}
}
