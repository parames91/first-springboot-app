package com.cts.microcredential.premiumpay.fileclaim.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.premiumpay.fileclaim.entity.CustomerDaoBean;
import com.cts.microcredential.premiumpay.fileclaim.entity.PolicyDaoBean;

public interface PolicyRepository extends JpaRepository<PolicyDaoBean, Long>{

	public PolicyDaoBean findByPolciynumber(Long id);
	public List<PolicyDaoBean> findByCustIdbean(CustomerDaoBean bean);
}
