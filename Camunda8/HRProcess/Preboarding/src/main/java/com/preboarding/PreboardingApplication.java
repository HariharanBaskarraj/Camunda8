package com.preboarding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import io.camunda.zeebe.spring.client.lifecycle.ZeebeClientLifecycle;

@SpringBootApplication
@EnableZeebeClient
@Deployment(resources = "classpath:preboarding.bpmn")
public class PreboardingApplication implements CommandLineRunner{

	@Autowired
	private ZeebeClientLifecycle zeebeClient;

	public static void main(String[] args){
		SpringApplication.run(PreboardingApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		zeebeClient.newCreateInstanceCommand()
					.bpmnProcessId("preboardingProcess")
					.latestVersion()
					.send()
					.join();
	}

}
