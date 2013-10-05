package org.businessobjects.testing;

public class Transaction {
	
	private long id;
	private CCInfo info;
	private long amount;
	private String state;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public CCInfo getInfo() {
		return info;
	}
	public void setInfo(CCInfo info) {
		this.info = info;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	

}
