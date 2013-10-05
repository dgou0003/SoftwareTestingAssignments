package org.businessobjects.testing;

public class PaymentProcessor implements BankProxy{

	@Override
	public long auth(CCInfo ccInfo, long amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capture(long transactionID) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int refund(long transationID, long amount) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int processPayment(CCInfo ccInfo, long amount){
		return 0;
		
	}
	
	public int verifyOnline(CCInfo ccInfo){
		return 0;
	}
	
	public boolean verifyLuhn(String creditCardNumber){
		return false;
	}
	
	
	

}
