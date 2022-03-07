package fisglobal;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = sc.nextInt();
		System.out.println("Enter the Second number");
		b = sc.nextInt();
		System.out.println("Enter the third number");
		c = sc.nextInt();

		if (a < b) {
			if (b < c)
				System.out.println("c is bigger");
			else
				System.out.println("b is bigger");
		} else {
			if (a < c)
				System.out.println("c is bigger");
			else
				System.out.println("a is bigger");
		}

	}

}
