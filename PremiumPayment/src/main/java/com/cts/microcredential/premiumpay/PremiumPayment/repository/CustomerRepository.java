package com.cts.microcredential.premiumpay.PremiumPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.CustomerDaoBean;

public interface CustomerRepository extends JpaRepository<CustomerDaoBean, Integer>{

	public CustomerDaoBean findByCustId(Long id);
}
