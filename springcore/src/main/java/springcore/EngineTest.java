package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EngineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		Engine e = (Engine)context.getBean("eng");
		System.out.println(e);
		
		FisAddress a = (FisAddress)context.getBean("fisaddr");
		System.out.println(a);
		
		/*
		 * FisPerson person = (FisPerson) context.getBean("person1");
		 * System.out.println(person);
		 */
	

	}

}
