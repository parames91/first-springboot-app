package com.cts.microcredential.claimprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.claimprocess.entity.CustomerDaoBean;
import com.cts.microcredential.claimprocess.entity.PolicyDaoBean;

public interface PolicyRepository extends JpaRepository<PolicyDaoBean, Long>{

	public PolicyDaoBean findByPolciynumber(Long id);
	public List<PolicyDaoBean> findByCustIdbean(CustomerDaoBean bean);
}
