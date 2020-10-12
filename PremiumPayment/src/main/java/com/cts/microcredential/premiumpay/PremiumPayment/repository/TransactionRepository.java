package com.cts.microcredential.premiumpay.PremiumPayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.TransactionDaoBean;

public interface TransactionRepository extends JpaRepository<TransactionDaoBean, Integer> {

}
