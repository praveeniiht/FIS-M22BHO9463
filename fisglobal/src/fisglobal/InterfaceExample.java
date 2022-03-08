package fisglobal;

interface Shop{
	int x=10;  // constants it is a final variable
	void selectGoods();
	void payment();
	public default void generateOtp() {
		// TODO Auto-generated method stub
		System.out.println("Enter OTP for completing the trasnactions..");
		
	}
	public abstract void shipment(); 
	
		public static void registration() {
			System.out.println("Shop must be registered first ...");
		}
}

class ManualShops implements Shop{

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println("Goods are to be selected from shop only");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Payment is through cash only");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("Goods should carry on your own");
		
	}

	
	
}

class CreditDebitShops implements Shop{

	@Override
	public void selectGoods() {
		// TODO Auto-generated method stub
		System.out.println("Goods can be selected through www.shop.com");
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("Debit or Credit cards are accepted..");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		System.out.println("It can be done through dtdc ");
		
	}
	@Override
	public void generateOtp() {
		// TODO Auto-generated method stub
		System.out.println("enter the grid values on your credit/debit card..");
		
	}

	
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shop.registration();
		
		CreditDebitShops shop1 = new CreditDebitShops();
		
		shop1.selectGoods();
		shop1.payment();
		shop1.generateOtp();
		shop1.shipment();
		
		ManualShops shop2 = new ManualShops();
		shop2.selectGoods();
		shop2.payment();
		shop2.shipment();
		

	}

}
