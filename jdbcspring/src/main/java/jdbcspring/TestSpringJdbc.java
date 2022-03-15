package jdbcspring;

import java.util.Iterator;
import java.util.List;
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
		
		/*
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter state");
		String state=sc.next();
		*/
	//	System.out.println("Enter pid");
	//	int pid=sc.nextInt();
	//	Persons person = new Persons(name,city,state,pid);
	//	String result = dao.insertPerson(person);
	//	String result = dao.deletePerson(pid);
	//	System.out.println(result);
		
		List<Persons> persons = dao.getAllPersons();
		persons.forEach(System.out::println);
		
		List<Users> users = dao.getAllUsers();
		Iterator itr =  users.iterator();
		while(itr.hasNext())
		{
			Users u= (Users) itr.next();
			System.out.println(u.getUsername()+" "+u.getPassword()+" "+u.getRoles());
		}
	}

}
