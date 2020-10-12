package com.cts.microcredential.claimprocess.entity;


import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "processclaim", schema = "mysqldb")
public class ClaimSubmitEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "claimid")
	private int claimId;
	
	@ManyToOne
	@JoinColumn(name = "policynumber")
	private PolicyDaoBean policyNo;
	
	@Column(name = "claimamount")
	private Long claimAmount;
	
	@Column(name = "reason")
	private String reason;
	
	@Column(name = "claimdate")
	private Timestamp claimdate;
	
	@Column(name = "comments")
	private String comments;
	
	@Column(name = "proofdoc")
	private Blob proofDoc;
	
	@Column(name = "staus")
	private String status;
	
	@Column(name = "processmessage")
	private String processMessage;

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
	 * @return the policyNo
	 */
	public PolicyDaoBean getPolicyNo() {
		return policyNo;
	}

	/**
	 * @param policyNo the policyNo to set
	 */
	public void setPolicyNo(PolicyDaoBean policyNo) {
		this.policyNo = policyNo;
	}

	/**
	 * @return the claimAmount
	 */
	public Long getClaimAmount() {
		return claimAmount;
	}

	/**
	 * @param claimAmount the claimAmount to set
	 */
	public void setClaimAmount(Long claimAmount) {
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
	 * @return the claimdate
	 */
	public Timestamp getClaimdate() {
		return claimdate;
	}

	/**
	 * @param claimdate the claimdate to set
	 */
	public void setClaimdate(Timestamp claimdate) {
		this.claimdate = claimdate;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the proofDoc
	 */
	public Blob getProofDoc() {
		return proofDoc;
	}

	/**
	 * @param proofDoc the proofDoc to set
	 */
	public void setProofDoc(Blob proofDoc) {
		this.proofDoc = proofDoc;
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
	 * @return the processMessage
	 */
	public String getProcessMessage() {
		return processMessage;
	}

	/**
	 * @param processMessage the processMessage to set
	 */
	public void setProcessMessage(String processMessage) {
		this.processMessage = processMessage;
	}

	@Override
	public String toString() {
		return "ClaimSubmitEntity [claimId=" + claimId + ", policyNo=" + policyNo + ", claimAmount=" + claimAmount
				+ ", reason=" + reason + ", claimdate=" + claimdate + ", comments=" + comments + ", proofDoc="
				+ proofDoc + ", status=" + status + ", processMessage=" + processMessage + "]";
	}

}
