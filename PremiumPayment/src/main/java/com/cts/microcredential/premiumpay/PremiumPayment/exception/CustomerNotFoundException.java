package com.cts.microcredential.premiumpay.PremiumPayment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException {
    
	public CustomerNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("Customer Id is Invalid "+id);
	}
}
