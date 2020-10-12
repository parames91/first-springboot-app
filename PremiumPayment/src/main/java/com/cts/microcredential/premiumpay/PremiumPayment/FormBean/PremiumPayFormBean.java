package com.cts.microcredential.premiumpay.PremiumPayment.FormBean;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class PremiumPayFormBean {

	
	private String policyNumber;
	
	@Size(min = 16, message = "SSN atleast contain 16 digit")
	private String ssn;
	
	@NotNull(message = "User Id of Policy Holder should not be Null")
	@NotBlank(message = "User Id of Policy Holder should not be Null")
	private String custId;
	
	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "PremiumPayFormBean [policyNumber=" + policyNumber + ", ssn=" + ssn + "]";
	}
	
}
