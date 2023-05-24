package com.insurance.workers;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class AuthenticationWorker {
	
//	@Autowired
	Random random = new Random();
	
	@JobWorker
	public void generateOTP(JobClient jobClient, ActivatedJob job) {
		Map<String, Object> map = job.getVariablesAsMap();
		
		String numbers = "0123456789";    
	    char[] otp = new char[6];  
	    for (int i = 0; i < 6; i++) {  
	        otp[i] = numbers.charAt(random.nextInt(numbers.length()));  
	    }
	    
	    map.put("generatedOtp", String.valueOf(otp));
	    jobClient.newCompleteCommand(job.getKey()).variables(map).send().join();
	}

	@JobWorker
	public void validateOTP(JobClient jobClient, ActivatedJob job) {
		Map<String, Object> map = job.getVariablesAsMap();
		String userEnteredOtp = (String) map.get("userEnteredOtp");
		String generatedOtp = (String) map.get("generatedOtp");
		
		if(generatedOtp.equals(userEnteredOtp)) {
			map.put("otpValid", "true");
		} else {
			map.put("otpValid", "false");
		}

	    jobClient.newCompleteCommand(job.getKey()).variables(map).send().join();

	}
}
