package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.SurveyorDetails;
import com.insurance.repository.ISurveyorRepository;

@Service
public class SurveyorServiceImpl implements ISurveyorService {

	private ISurveyorRepository surveyorRepository;
	@Autowired
	public void setSurveyorRepository(ISurveyorRepository surveyorRepository) {
		this.surveyorRepository = surveyorRepository;
	}

	@Override
	public SurveyorDetails getSurveyorById(Integer surveyorId) {
		return surveyorRepository.findById(surveyorId).get();
	}

	@Override
	public void addSurveyor(SurveyorDetails surveyor) {
		surveyorRepository.save(surveyor);
	}
	
	

}
