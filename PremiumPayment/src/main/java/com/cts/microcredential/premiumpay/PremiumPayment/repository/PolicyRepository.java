package com.cts.microcredential.premiumpay.PremiumPayment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.premiumpay.PremiumPayment.Entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.PremiumPayment.Entity.PolicyDaoBean;

public interface PolicyRepository extends JpaRepository<PolicyDaoBean, Long>{

	public PolicyDaoBean findByPolciynumber(Long id);
	public List<PolicyDaoBean> findByCustIdbean(CustomerDaoBean bean);
}
