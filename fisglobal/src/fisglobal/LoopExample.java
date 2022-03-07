package fisglobal;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {10,20,30,40,50};
		int a=1;
		
		while(a<=10) {
			System.out.println("Inside the loop");
			a++;
		}
		
		do {
			System.out.println("Inside the do while loop");
			a++;
		}while(a<=10);
		
		for(int i=0;i<10;i++)
			System.out.println("inside the for loop");
		
		for(int x: nums)
			System.out.println(x);
		
	}

}
