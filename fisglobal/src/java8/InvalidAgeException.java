package java8;

public class InvalidAgeException extends RuntimeException {
	
	public InvalidAgeException() {
		super("Age is either >100 or < 0");
	}

}
