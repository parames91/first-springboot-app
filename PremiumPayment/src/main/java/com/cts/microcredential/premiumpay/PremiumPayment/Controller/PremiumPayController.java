package com.cts.microcredential.premiumpay.PremiumPayment.Controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.PolicyDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.TransactionDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.PolicyFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.PremiumPayFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.TransactionFormBean;
import com.cts.microcredential.premiumpay.PremiumPayment.FormBean.TransactionResponseBean;
import com.cts.microcredential.premiumpay.PremiumPayment.service.PremiumPayService;

@RestController
@EnableAutoConfiguration
public class PremiumPayController {
	
	private static final Logger log = LoggerFactory.getLogger(PremiumPayController.class);
	
	@Autowired
	PremiumPayService payService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/viewAllCustomer", consumes = "application/json")
	public ResponseEntity<List<CustomerDaoBean>> viewuser(){
		//CutomerDaoBean cutomerDaoBean = null;
		List<CustomerDaoBean> beans = payService.viewdetails();
		return ResponseEntity.accepted().body(beans);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/viewPolicy", consumes = "application/json")
	public ResponseEntity<List<PolicyFormBean>> viewPolicy(@RequestBody@Valid PremiumPayFormBean payFormBean){
		log.debug("Start method viewPolicy");
		List<PolicyFormBean> policyForm = payService.viewPolicy(payFormBean);
		return ResponseEntity.accepted().body(policyForm);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/payPerimum", consumes = "application/json")
	public ResponseEntity<TransactionResponseBean> payPerimum(@RequestBody@Valid TransactionFormBean transactionFormBean){
		TransactionDaoBean daoBean = payService.savePayment(transactionFormBean);
		return ResponseEntity.accepted().body(new TransactionResponseBean(transactionFormBean.getPolicyNum(),transactionFormBean.getCustId(), daoBean.getTransId(), "Payment Sucess"));
	}

}
