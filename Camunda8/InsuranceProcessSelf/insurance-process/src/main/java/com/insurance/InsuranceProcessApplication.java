package com.insurance;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.insurance.model.PolicyDetails;
import com.insurance.model.SurveyorDetails;
import com.insurance.service.PolicyServiceImpl;
import com.insurance.service.SurveyorServiceImpl;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.ZeebeClientBuilder;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import io.camunda.zeebe.spring.client.annotation.JobWorker;

@SpringBootApplication
@Deployment(resources = { "classpath:InsuranceProcess.bpmn", "classpath:SurveyorAssignment.dmn" })
public class InsuranceProcessApplication implements CommandLineRunner {

	@Autowired
	private Environment environment;
	private ZeebeClientBuilder clientBuilder;

//	@Autowired
//	PolicyServiceImpl policyService;
//	@Autowired
//	SurveyorServiceImpl surveyorService;
	
	Random rndm_method = new Random();

	

	public static void main(String[] args) {
		SpringApplication.run(InsuranceProcessApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clientBuilder = ZeebeClient.newClientBuilder().usePlaintext();

		try (ZeebeClient client = clientBuilder.build()) {
			client.newCreateInstanceCommand().bpmnProcessId(environment.getProperty("camunda.processid"))
					.latestVersion().send().join();
		}

//		policyService.addPolicyDetails(new PolicyDetails(1234,"Aakash"));
//		policyService.addPolicyDetails(new PolicyDetails(5678,"Abhishek"));
//		policyService.addPolicyDetails(new PolicyDetails(9012,"Akil Nandhan"));
//		policyService.addPolicyDetails(new PolicyDetails(3456,"Akash"));
//		policyService.addPolicyDetails(new PolicyDetails(7890,"Jashwanth"));
//		policyService.addPolicyDetails(new PolicyDetails(9876,"Aravind"));
//		policyService.addPolicyDetails(new PolicyDetails(5432,"Gladwin"));
//		
//		surveyorService.addSurveyor(new SurveyorDetails("Hariharan","789456123"));
//		surveyorService.addSurveyor(new SurveyorDetails("Niroshan","332145677"));
//		surveyorService.addSurveyor(new SurveyorDetails("Pradeish","785654185"));
//		surveyorService.addSurveyor(new SurveyorDetails("Salai Arunmani","4168563"));
//		surveyorService.addSurveyor(new SurveyorDetails("Dharsigan","524654684"));
//		surveyorService.addSurveyor(new SurveyorDetails("Aadish","56489785"));
//		surveyorService.addSurveyor(new SurveyorDetails("Luna","8596874"));

	}
}