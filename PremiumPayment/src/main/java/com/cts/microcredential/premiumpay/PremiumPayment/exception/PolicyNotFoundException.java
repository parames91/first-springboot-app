package com.cts.microcredential.premiumpay.PremiumPayment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PolicyNotFoundException extends RuntimeException {

	public PolicyNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("Policy not found for this customer "+id);
	}
}

