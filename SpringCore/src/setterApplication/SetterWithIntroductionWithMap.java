package setterApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import setterPojo.WithMap;

public class SetterWithIntroductionWithMap {
	public static void main(String[]args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("setterApplication/setterApplicationWithMapContext.xml");
		WithMap map = (WithMap) applicationContext.getBean("withMap");
		System.out.println(map);
	}
}
