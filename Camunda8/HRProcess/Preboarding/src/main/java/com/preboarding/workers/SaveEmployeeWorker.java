package com.preboarding.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.preboarding.model.EmployeeDetails;
import com.preboarding.service.EmployeeServiceImpl;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class SaveEmployeeWorker {

	@Autowired
	private EmployeeServiceImpl employeeService;
	

	@JobWorker
	public void saveEmployeeDetails(JobClient jobClient, ActivatedJob job) {
		String panNumber = (String) job.getVariablesAsMap().get("panNumber");
		String passportNumber = (String) job.getVariablesAsMap().get("passportNumber");
		String passportExpiry = (String) job.getVariablesAsMap().get("passportExpiry");
		String qualification = (String) job.getVariablesAsMap().get("qualification");
		String college = (String) job.getVariablesAsMap().get("college");
		String accountNumber = (String) job.getVariablesAsMap().get("accountNumber");
		String bankName = (String) job.getVariablesAsMap().get("bankName");
		String ifscCode = (String) job.getVariablesAsMap().get("ifscCode");

		EmployeeDetails employeeDetails = new EmployeeDetails(panNumber, passportNumber, passportExpiry, qualification,
				college, accountNumber, bankName, ifscCode);
		
		employeeService.addEmployeeDetails(employeeDetails);
		jobClient.newCompleteCommand(job.getKey()).send().join();
	}
}
