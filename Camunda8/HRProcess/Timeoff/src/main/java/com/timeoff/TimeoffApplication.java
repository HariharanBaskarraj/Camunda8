package com.timeoff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import io.camunda.zeebe.spring.client.lifecycle.ZeebeClientLifecycle;

@SpringBootApplication
@EnableZeebeClient
@Deployment(resources = "classpath:timeoff.bpmn")
public class TimeoffApplication implements CommandLineRunner{

	@Autowired
	private ZeebeClientLifecycle zeebeClient;

	public static void main(String[] args) {
		SpringApplication.run(TimeoffApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		zeebeClient.newCreateInstanceCommand()
					.bpmnProcessId("timeoffProcess")
					.latestVersion()
					.send()
					.join();
	}
}
