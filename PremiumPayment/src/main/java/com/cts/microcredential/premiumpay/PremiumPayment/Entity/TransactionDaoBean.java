package com.cts.microcredential.premiumpay.PremiumPayment.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transaction", schema = "mysqldb")
public class TransactionDaoBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transid")
	private int transId;
	
	@ManyToOne
	@JoinColumn(name = "policynumber")
	private PolicyDaoBean policyNum;
	
	@Column(name = "paidamount")
	private String paidAmount;
	
	@Column(name = "cardnum")
	private String cardNum;
	
	@Column(name = "cardexpiry")
	private String cardExpiry;
	
	@Column(name = "cvv")
	private String cvv;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "statusmessage")
	private String statusMessage;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public PolicyDaoBean getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(PolicyDaoBean policyNum) {
		this.policyNum = policyNum;
	}

	public String getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(String paidAmount) {
		this.paidAmount = paidAmount;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public String toString() {
		return "TransactionDaoBean [transId=" + transId + ", policyNum=" + policyNum + ", paidAmount=" + paidAmount
				+ ", cardNum=" + cardNum + ", cardExpiry=" + cardExpiry + ", cvv=" + cvv + ", status=" + status
				+ ", statusMessage=" + statusMessage + "]";
	}
	
}
