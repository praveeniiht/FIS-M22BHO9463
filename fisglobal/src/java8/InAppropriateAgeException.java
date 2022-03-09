package java8;

public class InAppropriateAgeException extends RuntimeException{
	
	public InAppropriateAgeException() {
		super("Age is less than 18....");
	}

}
