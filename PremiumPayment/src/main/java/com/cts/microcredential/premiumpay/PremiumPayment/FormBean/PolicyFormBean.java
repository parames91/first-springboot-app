package com.cts.microcredential.premiumpay.PremiumPayment.FormBean;

import java.sql.Timestamp;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.PolicyDaoBean;

public class PolicyFormBean {
	
	private Long custid;
	
	private Long policyNum;
	
	private Long custSSN;
	
	private String polciyname;
	
	private Long premiumamount;
	
	private Long dueamount;
	
	private Timestamp duedate;

	public Long getCustid() {
		return custid;
	}

	public void setCustid(Long custid) {
		this.custid = custid;
	}

	public Long getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(Long policyNum) {
		this.policyNum = policyNum;
	}

	public Long getCustSSN() {
		return custSSN;
	}

	public void setCustSSN(Long custSSN) {
		this.custSSN = custSSN;
	}

	public String getPolciyname() {
		return polciyname;
	}

	public void setPolciyname(String polciyname) {
		this.polciyname = polciyname;
	}

	public Long getPremiumamount() {
		return premiumamount;
	}

	public void setPremiumamount(Long premiumamount) {
		this.premiumamount = premiumamount;
	}

	public Long getDueamount() {
		return dueamount;
	}

	public void setDueamount(Long dueamount) {
		this.dueamount = dueamount;
	}

	public Timestamp getDuedate() {
		return duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

	public PolicyFormBean(PolicyDaoBean policyDaoBean) {
		super();
		CustomerDaoBean bean = policyDaoBean.getCustIdbean();
		this.custid = bean.getCustId();
		this.policyNum = policyDaoBean.getPolciynumber();
		this.custSSN = bean.getCustSsn();
		this.polciyname = policyDaoBean.getPolicyname();
		this.premiumamount = policyDaoBean.getPreimumAmount();
		this.dueamount = policyDaoBean.getDueAmount();
		this.duedate = policyDaoBean.getDueDate();
	}
	

}
