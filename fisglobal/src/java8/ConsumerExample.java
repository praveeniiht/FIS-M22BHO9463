package java8;

import java.util.function.Consumer;

class Emp{
	int empid;
	String name;
	String dept;
	String desg;
	public Emp() {
		
	}
	public Emp(int empid, String name, String dept, String desg) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
	}
}

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<Integer> c = n-> System.out.println("The square is  :"+n*n);
		c.accept(9);
		
		Consumer<Emp> c1 = e1-> {
			System.out.println("Employee Id : "+e1.empid);
			System.out.println("Name : "+e1.name);
			System.out.println("Department : "+e1.dept);
			System.out.println("Designation : "+e1.desg);
		};
			
		
		Emp e1 = new Emp(1001,"Kumar","Manager","Finance");
		Emp e2 = new Emp(1002,"Sunil","Clerk","Accounts");
		Emp e3 = new Emp(1003,"Anil","Salesman","Marketing");
		
		
		c1.accept(e3);
		
		
		
		

	}

}
