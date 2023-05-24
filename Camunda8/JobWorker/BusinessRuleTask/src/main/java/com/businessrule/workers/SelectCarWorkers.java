package com.businessrule.workers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class SelectCarWorkers {
	private Logger LOGGER = LoggerFactory.getLogger(SelectCarWorkers.class);

	@JobWorker
	public void selectedSUV(JobClient jobClient, ActivatedJob job) {
		LOGGER.info("The user has selected SUV model");
		jobClient.newCompleteCommand(job.getKey()).send().join();
	}

	@JobWorker
	public void selectedBudget(JobClient jobClient, ActivatedJob job) {
		LOGGER.info("The user has selected Budget model");
		jobClient.newCompleteCommand(job.getKey()).send().join();
	}
	
	@JobWorker
	public void saveBookingDetails(JobClient jobClient, ActivatedJob job) {
		LOGGER.info("Saved to DB");
		jobClient.newCompleteCommand(job.getKey()).send().join();
	}

}
