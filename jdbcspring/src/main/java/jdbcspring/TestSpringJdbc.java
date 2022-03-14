package jdbcspring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		PersonsDao dao = (PersonsDao) context.getBean("dao");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter state");
		String state=sc.next();
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		Persons person = new Persons(name,city,state,pid);
		String result = dao.insertPerson(person);
		System.out.println(result);
	}

}
