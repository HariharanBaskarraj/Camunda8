package com.insurance.workers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.insurance.model.SurveyorDetails;
import com.insurance.service.SurveyorServiceImpl;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.Variable;

@Component
public class SurveyorRetrievalWorker {

	private SurveyorServiceImpl surveyorServiceImpl;

	@Autowired
	public void setSurveyorServiceImpl(SurveyorServiceImpl surveyorServiceImpl) {
		this.surveyorServiceImpl = surveyorServiceImpl;
	}

	@JobWorker
	public void retrieveSurveyor(JobClient jobClient, ActivatedJob job, @Variable Integer surveyorId) {
		SurveyorDetails surveyor = surveyorServiceImpl.getSurveyorById(surveyorId);
		
		Map<String, Object> map = job.getVariablesAsMap();
		map.put("surveyorName", surveyor.getSurveyorName());
		map.put("surveyorMobile", surveyor.getSurveyorPhoneNumber());
		
		jobClient.newCompleteCommand(job.getKey()).variables(map).send().join();
	}

	

}
