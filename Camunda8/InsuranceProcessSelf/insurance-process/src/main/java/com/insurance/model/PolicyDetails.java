package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PolicyDetails {

	@Id
	private Integer policyNumber;
	private String policyHolderName;

	public PolicyDetails() {
		super();
	}

	public PolicyDetails(Integer policyNumber, String policyHolderName) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
	}

	public Integer getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	@Override
	public String toString() {
		return "PolicyDetails [policyNumber=" + policyNumber + ", policyHolderName=" + policyHolderName + "]";
	}

}
