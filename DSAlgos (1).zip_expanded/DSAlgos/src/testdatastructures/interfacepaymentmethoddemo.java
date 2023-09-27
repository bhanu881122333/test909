package testdatastructures;

public class interfacepaymentmethoddemo {
	
	
	public static void makepayment(Paymentmethod pm) {
		
		
		pm.pay();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		Paymentmethod pm=new UPI();
		
		makepayment(pm);
		
		
	}

}
