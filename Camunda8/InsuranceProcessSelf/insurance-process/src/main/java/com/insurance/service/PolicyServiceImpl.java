package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.PolicyDetails;
import com.insurance.repository.IPolicyRepository;

@Service
public class PolicyServiceImpl implements IPolicyService {

	private IPolicyRepository policyRepository;
	@Autowired
	public void setPolicyRepository(IPolicyRepository policyRepository) {
		this.policyRepository = policyRepository;
	}

	@Override
	public void addPolicyDetails(PolicyDetails policyDetails) {
		policyRepository.save(policyDetails);
	}

	public List<PolicyDetails> retrievePolicyDetails() {
		return policyRepository.findAll();
	}
}
