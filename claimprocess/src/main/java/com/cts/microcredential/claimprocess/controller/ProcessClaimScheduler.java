package com.cts.microcredential.claimprocess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.cts.microcredential.claimprocess.services.ProcessClaimService;

@Component
public class ProcessClaimScheduler {
	
	@Autowired
	ProcessClaimService claimService;

	@Scheduled(fixedRate = 5000)
	public void returnCurrentTie() {
		
		System.out.println("Enabling scheduler "+ System.currentTimeMillis());
		
	}
	
	@Scheduled(fixedRate = 5000)
	public void processClaim() {
		claimService.processClaim();
	}
}
