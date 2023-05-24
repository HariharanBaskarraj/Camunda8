package com.insurance.workers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.insurance.model.FnolPersistence;
import com.insurance.service.FnolServiceImpl;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@Component
public class PersistenceWorker {
	
	private FnolServiceImpl fnolServiceImpl;
	@Autowired
	public void setFnolServiceImpl(FnolServiceImpl fnolServiceImpl) {
		this.fnolServiceImpl = fnolServiceImpl;
	}
	
	@JobWorker
	public void persistFnol(JobClient jobClient, ActivatedJob job) {
		FnolPersistence fnolPersistence = job.getVariablesAsType(FnolPersistence.class);
		fnolServiceImpl.addFnolEntries(fnolPersistence);
	}
	
}
