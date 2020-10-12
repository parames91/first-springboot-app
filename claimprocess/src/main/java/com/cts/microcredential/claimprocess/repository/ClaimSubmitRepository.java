package com.cts.microcredential.claimprocess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.microcredential.claimprocess.entity.ClaimSubmitEntity;


public interface ClaimSubmitRepository extends JpaRepository<ClaimSubmitEntity, Integer> {

	public List<ClaimSubmitEntity> findByStatus(String id);
}
