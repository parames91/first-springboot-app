package com.cts.microcredential.premiumpay.fileclaim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.premiumpay.fileclaim.entity.CustomerDaoBean;

public interface CustomerRepository extends JpaRepository<CustomerDaoBean, Integer>{

	public CustomerDaoBean findByCustId(Long id);
}
