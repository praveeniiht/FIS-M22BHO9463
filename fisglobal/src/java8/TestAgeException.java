package java8;

import java.util.Scanner;

public class TestAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgeTest t= new AgeTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age...");
		int age = sc.nextInt();
		try {
			t.testAge(age);
		}
		catch(InAppropriateAgeException e) {
			System.out.println(e);
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
