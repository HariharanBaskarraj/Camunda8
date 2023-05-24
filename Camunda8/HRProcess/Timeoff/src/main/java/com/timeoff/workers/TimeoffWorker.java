package com.timeoff.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timeoff.model.LeaveDetails;
import com.timeoff.service.LeaveServiceImpl;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class TimeoffWorker {

	private LeaveServiceImpl leaveService;
	@Autowired
	public void setLeaveService(LeaveServiceImpl leaveService) {
		this.leaveService = leaveService;
	}
	
	@JobWorker
	public void saveLeaveDetails(JobClient jobClient, ActivatedJob job) {
		String employeeId = (String) job.getVariablesAsMap().get("employeeId");
		String startDate = (String) job.getVariablesAsMap().get("startDate");
		String endDate = (String) job.getVariablesAsMap().get("endDate");
		String leaveType = (String) job.getVariablesAsMap().get("leaveType");
		String status = (String) job.getVariablesAsMap().get("decision");
		LeaveDetails leaveDetails = new LeaveDetails(employeeId, startDate, endDate, leaveType, status);
		leaveService.addLeaveDetails(leaveDetails);
		jobClient.newCompleteCommand(job.getKey()).send().join();
	}
}
