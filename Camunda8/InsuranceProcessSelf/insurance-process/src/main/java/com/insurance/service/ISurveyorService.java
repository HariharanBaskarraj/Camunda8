package com.insurance.service;

import com.insurance.model.SurveyorDetails;

public interface ISurveyorService {
	
	SurveyorDetails getSurveyorById (Integer surveyorId);

	void addSurveyor (SurveyorDetails surveyor);
}
