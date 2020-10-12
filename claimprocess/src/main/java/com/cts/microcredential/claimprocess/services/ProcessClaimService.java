package com.cts.microcredential.claimprocess.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.microcredential.claimprocess.entity.ClaimSubmitEntity;
import com.cts.microcredential.claimprocess.entity.PolicyDaoBean;
import com.cts.microcredential.claimprocess.repository.ClaimSubmitRepository;
import com.cts.microcredential.claimprocess.repository.PolicyRepository;

@Service
public class ProcessClaimService {

	@Autowired
	ClaimSubmitRepository submitRepository;
	
	@Autowired
	PolicyRepository policyRepository;
	
	public void processClaim() {
		List<ClaimSubmitEntity> submitEntities = submitRepository.findByStatus("IP");
		submitEntities.forEach(entry ->{
			PolicyDaoBean daoBean = entry.getPolicyNo();
			Long totalAmt = daoBean.getTotalPerimumAmount();
			Long claimAmt = entry.getClaimAmount();
			if(totalAmt > claimAmt) {
				Long changeTot = totalAmt - claimAmt;
				daoBean.setTotalPerimumAmount(changeTot);
				policyRepository.save(daoBean);
				entry.setStatus("P");
				entry.setProcessMessage("Claim is approved");
				submitRepository.save(entry);
			} else {
				entry.setStatus("R");
				entry.setProcessMessage("Claim amount exceed your total perimum amount");
				submitRepository.save(entry);
			}
		});
		
	}
}
