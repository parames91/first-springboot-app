package com.cts.microcredential.premiumpay.PremiumPayment.FormBean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class TransactionFormBean {
	
	@NotNull(message = "Customer should not be Null or Blank")
	@NotBlank(message = "Customer should not be Null or Blank")
	private String custId;
	
	@NotNull(message = "Policy should not be Null or Blank")
	@NotBlank(message = "Policy should not be Null or Blank")
	private String policyNum;
	
	@NotNull(message = "Due Amount should not be Null or Blank")
	@NotBlank(message = "Due Amount should not be Null or Blank")
	private String dueAmount;
	
	@NotNull(message = "Card number should not be Null or Blank")
	@NotBlank(message = "Card number should not be Null or Blank")
	private String cardNo;
	
	@NotNull(message = "Card Expiry should not be Null or Blank")
	@NotBlank(message = "Card Expiry should not be Null or Blank")
	private String cardExpiry;
	
	@NotNull(message = "CVV should not be Null or Blank")
	@NotBlank(message = "CVV should not be Null or Blank")
	private String cvv;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public String getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(String dueAmount) {
		this.dueAmount = dueAmount;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	

}
