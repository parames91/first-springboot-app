package com.cts.microcredential.premiumpay.PremiumPayment.FormBean;

public class TransactionResponseBean {

	private String policyNum;
	
	private String custId;
	
	private int transactionId;
	
	private String paymentStatus;

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public TransactionResponseBean(String policyNum, String custId, int transactionId, String paymentStatus) {
		super();
		this.policyNum = policyNum;
		this.custId = custId;
		this.transactionId = transactionId;
		this.paymentStatus = paymentStatus;
	}
	
	
}
