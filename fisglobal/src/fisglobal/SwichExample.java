package fisglobal;

import java.util.Scanner;

public class SwichExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Enter a string");
		String s = sc.next();
		
		switch(a) {
		case 1: System.out.println("It is a car");break;
		case 2: System.out.println("It is a Bus");break;
		case 3: System.out.println("It is a Scooter");break;
		default: System.out.println("Not in list");
		
		}
		
		
		switch(s) {
		case "MH": System.out.println("Maharastra State");break;
		case "DL": System.out.println("Delhi State");break;
		case "TN": System.out.println("Tamilnadu State");break;
		default: System.out.println("Not in list");
		
		}
		
		

	}

}
