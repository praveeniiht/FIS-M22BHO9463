package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyEmpNameSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return -e1.name.compareTo(e2.name);
	}
	
}

class MyEmpDesgSort implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.desg.compareTo(e2.desg);
	}
	
}

public class EmployeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("sunil","clerk");
		Employee e2 = new Employee("mahesh","manager");
		Employee e3 = new Employee("ashok","salesman");
		ArrayList<Employee> emps = new ArrayList();
		emps.add(e3); 
		emps.add(e2); 
		emps.add(e1);
		MyEmpNameSort mes = new MyEmpNameSort();
		System.out.println("Sorted based on name");
		//Collections.sort(emps,mes);
		Collections.sort(emps,(s1,s2)->s1.name.compareTo(s2.name));
		System.out.println(emps);
		
		
		System.out.println("Sorted based on desg");
		MyEmpDesgSort meg = new MyEmpDesgSort();
		//Collections.sort(emps,meg);
		Collections.sort(emps,(s1,s2)->s1.desg.compareTo(s2.desg));
		System.out.println(emps);
		

	}

}
