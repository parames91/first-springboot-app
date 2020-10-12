package com.cts.microcredential.premiumpay.fileclaim.services;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microcredential.premiumpay.fileclaim.bean.ClaimSubmitBean;
import com.cts.microcredential.premiumpay.fileclaim.bean.ClaimSubmitResponse;
import com.cts.microcredential.premiumpay.fileclaim.entity.ClaimSubmitEntity;
import com.cts.microcredential.premiumpay.fileclaim.entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.fileclaim.entity.PolicyDaoBean;
import com.cts.microcredential.premiumpay.fileclaim.repository.ClaimSubmitRepository;
import com.cts.microcredential.premiumpay.fileclaim.repository.CustomerRepository;
import com.cts.microcredential.premiumpay.fileclaim.repository.PolicyRepository;

@Service
public class ClaimSubmitService {
	
	@Autowired
	CustomerRepository custRepo;
	
	@Autowired
	PolicyRepository policyRepo;
	
	@Autowired
	ClaimSubmitRepository claimRepo;
	
	public ClaimSubmitResponse submitClaim(ClaimSubmitBean claimSubmitBean) {
		
		PolicyDaoBean daoBean = policyRepo.findByPolciynumber(Long.parseLong(claimSubmitBean.getPolicyNum()));
		ClaimSubmitEntity submitEntity = new ClaimSubmitEntity();
		submitEntity.setPolicyNo(daoBean);
		submitEntity.setClaimAmount(Long.parseLong(claimSubmitBean.getClaimAmount()));
		submitEntity.setReason(claimSubmitBean.getReason());
		submitEntity.setComments(claimSubmitBean.getAdditionalComments());
		submitEntity.setClaimdate(new Timestamp(System.currentTimeMillis()));
		submitEntity.setStatus("IP");
		submitEntity.setProcessMessage("Claim is submitted it is in process");
		submitEntity = claimRepo.save(submitEntity);
		
		CustomerDaoBean customerDaoBean = daoBean.getCustIdbean();
		
		
		return new ClaimSubmitResponse(submitEntity.getClaimId(), customerDaoBean.getCustId(), daoBean.getPolciynumber(), submitEntity.getStatus(), submitEntity.getProcessMessage()) ;
		
	}

}
