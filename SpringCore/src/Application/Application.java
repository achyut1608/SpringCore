package Application;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Student;

public class Application {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application/applicationContext.xml");
		Student student  = (Student)applicationContext.getBean("studentBean");
		System.out.println(student);
		 
	}
}
