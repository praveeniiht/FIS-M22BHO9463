package springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FisSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		GlobalPerson p1 = (GlobalPerson) context.getBean("gp");
		GlobalPerson p2 = (GlobalPerson) context.getBean("gp");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	
	}

}
