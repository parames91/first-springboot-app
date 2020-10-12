package com.cts.microcredential.premiumpay.fileclaim.bean;

public class ClaimSubmitResponse {
	
	private int claimId;
	
	private Long custId;
	
	private Long policyNumber;
	
	private String status;
	
	private String message;

	/**
	 * @return the claimId
	 */
	public int getClaimId() {
		return claimId;
	}

	/**
	 * @param claimId the claimId to set
	 */
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}

	/**
	 * @return the custId
	 */
	public Long getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Long custId) {
		this.custId = custId;
	}

	/**
	 * @return the policyNumber
	 */
	public Long getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * @param policyNumber the policyNumber to set
	 */
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ClaimSubmitResponse [claimId=" + claimId + ", custId=" + custId + ", policyNumber=" + policyNumber
				+ ", status=" + status + ", message=" + message + "]";
	}

	public ClaimSubmitResponse(int claimId, Long custId, Long policyNumber, String status, String message) {
		super();
		this.claimId = claimId;
		this.custId = custId;
		this.policyNumber = policyNumber;
		this.status = status;
		this.message = message;
	}
	
}
