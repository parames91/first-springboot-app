package com.cts.microcredential.premiumpay.PremiumPayment.Entity;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "policy", schema = "mysqldb")
public class PolicyDaoBean {

	@Id
	@Column(name = "policynumber")
	private Long polciynumber;
	
	@Column(name = "policyname")
	private String policyname;
	
	@ManyToOne
	@JoinColumn(name = "custid")
	private CustomerDaoBean custIdbean;
	
	@Column(name = "total_perimum_amount")
	private Long totalPerimumAmount;
	
	@Column(name = "perimum_amount")
	private Long preimumAmount;
	
	@Column(name = "due_amount")
	private Long dueAmount;
	
	@Column(name = "due_date")
	private Timestamp dueDate;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "status_message")
	private String statusMessage;
	
	@OneToMany(mappedBy="policyNum", cascade = CascadeType.ALL)
	Set<TransactionDaoBean> transactions; 

	public Long getPolciynumber() {
		return polciynumber;
	}

	public void setPolciynumber(Long polciynumber) {
		this.polciynumber = polciynumber;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public Long getTotalPerimumAmount() {
		return totalPerimumAmount;
	}

	public void setTotalPerimumAmount(Long totalPerimumAmount) {
		this.totalPerimumAmount = totalPerimumAmount;
	}

	public Long getPreimumAmount() {
		return preimumAmount;
	}

	public void setPreimumAmount(Long preimumAmount) {
		this.preimumAmount = preimumAmount;
	}

	public Long getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(Long dueAmount) {
		this.dueAmount = dueAmount;
	}

	public Timestamp getDueDate() {
		return dueDate;
	}

	public void setDueDate(Timestamp dueDate) {
		this.dueDate = dueDate;
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

	public CustomerDaoBean getCustIdbean() {
		return custIdbean;
	}

	public void setCustIdbean(CustomerDaoBean custIdbean) {
		this.custIdbean = custIdbean;
	}
	
	public Set<TransactionDaoBean> getTransactions() {
		return transactions;
	}

	public void setTransactions(Set<TransactionDaoBean> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "PolicyDaoBean [polciynumber=" + polciynumber + ", policyname=" + policyname + ", custIdbean="
				+ custIdbean + ", totalPerimumAmount=" + totalPerimumAmount + ", preimumAmount=" + preimumAmount
				+ ", dueAmount=" + dueAmount + ", dueDate=" + dueDate + ", status=" + status + ", statusMessage="
				+ statusMessage + "]";
	}


}
