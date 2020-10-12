package com.cts.microcredential.premiumpay.fileclaim.bean;

import org.springframework.stereotype.Component;

@Component
public class ClaimSubmitBean {
	
	private String custId;
	
	private String policyNum;
	
	private String claimAmount;
	
	private String reason;
	
	private String additionalComments;
	
	private Object proofDoc;

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the policyNum
	 */
	public String getPolicyNum() {
		return policyNum;
	}

	/**
	 * @param policyNum the policyNum to set
	 */
	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	/**
	 * @return the claimAmount
	 */
	public String getClaimAmount() {
		return claimAmount;
	}

	/**
	 * @param claimAmount the claimAmount to set
	 */
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the additionalComments
	 */
	public String getAdditionalComments() {
		return additionalComments;
	}

	/**
	 * @param additionalComments the additionalComments to set
	 */
	public void setAdditionalComments(String additionalComments) {
		this.additionalComments = additionalComments;
	}

	/**
	 * @return the proofDoc
	 */
	public Object getProofDoc() {
		return proofDoc;
	}

	/**
	 * @param proofDoc the proofDoc to set
	 */
	public void setProofDoc(Object proofDoc) {
		this.proofDoc = proofDoc;
	}
	
	

}
