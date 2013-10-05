package org.businessobjects.testing;

public interface BankProxy {

	public long auth(CCInfo ccInfo, long amount);
	public int capture(long transactionID);
	public int refund(long transationID, long amount);
	
}
