package com.insurance.workers;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.insurance.service.PolicyServiceImpl;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class PolicyCheckWorker {

	@Autowired
	private PolicyServiceImpl policyService;
	
	@JobWorker
	public void validityCheck(JobClient jobClient, ActivatedJob job) {
		Map<String, Object> map = job.getVariablesAsMap();
		Integer policyNumber = Integer.valueOf((String) map.get("policyNumber"));
		
		List<Integer> policyNumbers = policyService.retrievePolicyDetails()
												   .stream()
												   .map(policyDetail -> policyDetail.getPolicyNumber())
												   .collect(Collectors.toList());
		
		if(policyNumbers.contains(policyNumber)) {
			map.put("validity", "true");
		} else {
			map.put("validity", "false");
		}
		
		jobClient.newCompleteCommand(job.getKey()).variables(map).send().join();
	}
}
