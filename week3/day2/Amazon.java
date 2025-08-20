package week3.day2;

public class Amazon extends CanaraBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon am=new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.internetBanking();
		am.upiPayments();
		am.recordPaymentDetails();

	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("delivered the package");
		
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("Gpay accepted");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Payment done by card");
		
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Doing online payment");
		
	}

}
