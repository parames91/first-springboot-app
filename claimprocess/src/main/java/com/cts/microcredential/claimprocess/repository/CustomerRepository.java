package com.cts.microcredential.claimprocess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.claimprocess.entity.CustomerDaoBean;

public interface CustomerRepository extends JpaRepository<CustomerDaoBean, Integer>{

	public CustomerDaoBean findByCustId(Long id);
}
