package fisglobal;

public class Student {
	
	private int hallTicketNumber;
	
	private String name;
	
	private String branch;
	
	 static String collge;
	 
	 
	 // function(){
	 
	//  }
	
	 Student(){
		
		 System.out.println("Inside the zero paramter contructor...");
	 }

	 Student(String name){
		 this();
		 this.name=name;
		 branch="cse";
		 showStudentData();
		 System.out.println("Inside the one paratmeter constructor....");
	 }
	
	 Student(String name, String branch){
		 this.name=name;
		 this.branch=branch;
		 System.out.println("Inside the two parameter construtor constructor....");
	 }
	 
	public String getCollge() {
		int x;
		return collge;
	}

	public void setCollge(String collge) {
		this.collge = collge;
	}

	// below code is static block code
	static 
	{
		System.out.println("Inside the static block...");
	}
	
	
	// below code is non static block code
	{
		System.out.println("Inside the non static block");
	}

	public int getHallTicketNumber() {
		return hallTicketNumber;
	}

	public void setHallTicketNumber(int hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void showStudentData() {
		
			System.out.println("HtNo: "+hallTicketNumber);
			System.out.println("Name: "+name);
			System.out.println("Branch: "+branch);
			System.out.println("College "+collge);
	}
	
	public static void registration() {
		System.out.println("College registration is done with name;");
	}

}
