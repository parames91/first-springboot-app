package com.cts.microcredential.premiumpay.PremiumPayment.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.PolicyDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.TransactionDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.PolicyFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.PremiumPayFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.TransactionFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.exception.CustomerNotFoundException;
import com.cts.microcredential.premiumpay.PremiumPayment.exception.PolicyNotFoundException;
import com.cts.microcredential.premiumpay.PremiumPayment.repository.CustomerRepository;
import com.cts.microcredential.premiumpay.PremiumPayment.repository.PolicyRepository;
import com.cts.microcredential.premiumpay.PremiumPayment.repository.TransactionRepository;

@Service
public class PremiumPayService {

	@Autowired
	CustomerRepository payRepository;
	
	@Autowired
	PolicyRepository policyRepository;
	
	@Autowired
	TransactionRepository transRepository;
	
	public List<CustomerDaoBean> viewdetails(){
		List<CustomerDaoBean> customerDaoBeans = payRepository.findAll();
		return customerDaoBeans;
	}
	
	/*
	 * public String savePolicy(Long policyNum, Long custId) { List<PolicyDaoBean>
	 * daoBean = policyRepository.findById(policyNum); CustomerDaoBean daoCustomer =
	 * payRepository.findByCustId(custId); if(null == daoBean) {
	 * policyRepository.save(new PolicyDaoBean(policyNum, "Dental Claim",
	 * daoCustomer, Long.parseLong("200000"), Long.parseLong("1200"),
	 * Long.parseLong("1200"), new Timestamp(20201010), "NP",
	 * "Please Pay October Month Due")); } return "Success"; }
	 */
	
	public List<PolicyFormBean> viewPolicy(PremiumPayFormBean payFormBean){
		List<PolicyFormBean> policyFormBeans = new ArrayList<PolicyFormBean>();
		CustomerDaoBean customerDaoBean = payRepository.findByCustId(Long.parseLong(payFormBean.getCustId()));
		if(null == customerDaoBean ) {
			throw new CustomerNotFoundException(Long.parseLong(payFormBean.getCustId()));
		} 
		List<PolicyDaoBean> listPolicyById = policyRepository.findByCustIdbean(customerDaoBean);
		if(null == listPolicyById || listPolicyById.isEmpty()) {
			throw new PolicyNotFoundException(customerDaoBean.getCustId());
		}
		ListIterator<PolicyDaoBean> iterator =  listPolicyById.listIterator();
		while(iterator.hasNext()) {
			PolicyDaoBean policyTemp = iterator.next();
			policyFormBeans.add(new PolicyFormBean(policyTemp));
		}
		return policyFormBeans;
		
	}
	
	public TransactionDaoBean savePayment(TransactionFormBean formBean) {
		
		TransactionDaoBean transactionDaoBean = new TransactionDaoBean();
		PolicyDaoBean policyDaoBean = policyRepository.findByPolciynumber(Long.parseLong(formBean.getPolicyNum()));
		if(null == policyDaoBean) {
			throw new PolicyNotFoundException(Long.parseLong(formBean.getPolicyNum()));
		}
		transactionDaoBean.setPolicyNum(policyDaoBean);
		transactionDaoBean.setPaidAmount(formBean.getDueAmount());
		transactionDaoBean.setCardNum(formBean.getCardNo());
		transactionDaoBean.setCardExpiry(formBean.getCardExpiry());
		transactionDaoBean.setCvv(formBean.getCvv());
		transactionDaoBean.setStatus("Paid");
		transactionDaoBean.setStatusMessage("Payment via card");
		
		PolicyDaoBean tempPolicyDaoBean = policyDaoBean;
		tempPolicyDaoBean.setDueAmount(policyDaoBean.getPreimumAmount());
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(policyDaoBean.getDueDate());
		calendar.add(Calendar.MONTH, 1);
		Date newDate = new Date();
		newDate = calendar.getTime();
		tempPolicyDaoBean.setDueDate(new Timestamp(newDate.getTime()));
		tempPolicyDaoBean.setStatus("P");
		tempPolicyDaoBean.setStatusMessage("Due all Paid");
		policyRepository.save(tempPolicyDaoBean);
		return transRepository.save(transactionDaoBean);
		
	}
}
