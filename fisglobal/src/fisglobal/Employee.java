package fisglobal;

public class Employee {
	
	int empId;
	String name;
	String desg;
	//Address address;
	public Employee(int empId, String name, String desg) {
		super();
		this.empId = empId;
		this.name = name;
		this.desg = desg;
		//this.address = new Address(302,"MG Road","Bangalore");
		//this.address=address;
	}
	public void showData(Address address) {
		System.out.println("Name: "+name+" EmpId "+empId+""+desg);
		System.out.println(address.dno+" "+address.street+" "+address.city);
	}
	

}
