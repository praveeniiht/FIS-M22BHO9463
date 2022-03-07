package fisglobal;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(1001,"Kumar","Manager");
		Address addr = new Address(302,"MG Road","Bangalore");
		emp.showData(addr);

	}

}
