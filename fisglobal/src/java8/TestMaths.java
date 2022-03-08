package java8;

@FunctionalInterface
interface Maths{
	public int add(int a, int b);
	

}

interface Circle{
	public double calArea(int radius);
}
/*
 * public interface Runnable{
 * 
 * 	public void run();
 * 
 * }
 * 
 */


public class TestMaths {
	
	public static void main(String args[]) {
		
	// Maths m = new Maths();
		
		Circle cr = r->3.141*r*r;
		
		Maths m = (a,b)->a+b;
		System.out.println(m.add(10,200));
		System.out.println("The circle area for radius 5 is : "+cr.calArea(5));
		
	//	MyThread mt = new MyThread();
		Runnable mt = ()->{
			for(int i=100;i<=200;i++)
				System.out.println(i);
		};
	
		Thread t = new Thread(mt);
		t.start();
	}
}
