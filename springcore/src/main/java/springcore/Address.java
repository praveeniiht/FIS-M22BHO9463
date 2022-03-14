package springcore;

public class Address {
	
	int dno;
	String street;
	String city;
	public Address() {
		
	}
	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	

}
