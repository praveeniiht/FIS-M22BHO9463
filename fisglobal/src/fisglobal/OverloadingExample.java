package fisglobal;

class FuncTest{
	public int test(int a, int b) {  // 2050
		System.out.println("inside the two int parameters...");
		return 0;
	}
 public char test(int c, String d){  //3056
	 System.out.println("inside the one int and one string  parameters...");
	 return 'a';
 }
   public void test(float x, String y){   //6798
	   System.out.println("inside the one float and one string  parameters...");
   }
}


public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FuncTest f = new FuncTest();
		f.test(2.4f,"Kumar");
		f.test(10,20);
		f.test(6, "Kishore");

	}

}
