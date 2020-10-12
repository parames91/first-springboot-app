package com.cts.microcredential.premiumpay.fileclaim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.microcredential.premiumpay.fileclaim.bean.ClaimSubmitBean;
import com.cts.microcredential.premiumpay.fileclaim.bean.ClaimSubmitResponse;
import com.cts.microcredential.premiumpay.fileclaim.services.ClaimSubmitService;

@RestController
public class ClaimSubmitController {
	
	@Autowired
	ClaimSubmitService claimSubmit;

	@RequestMapping(method = RequestMethod.POST, value = "/claimSubmit", consumes = "application/json")
	public ResponseEntity<ClaimSubmitResponse> claimSubmit(@RequestBody ClaimSubmitBean submitBean) {
		ClaimSubmitResponse response = claimSubmit.submitClaim(submitBean);
		return ResponseEntity.accepted().body(response);
	}
}
