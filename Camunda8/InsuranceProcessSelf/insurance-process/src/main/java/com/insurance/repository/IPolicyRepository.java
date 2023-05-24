package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.PolicyDetails;

public interface IPolicyRepository extends JpaRepository<PolicyDetails, Integer> {

}
