package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class SurveyorDetails {

	@Id
	@GeneratedValue(generator = "surveyor_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "surveyor_gen", sequenceName = "surveyor_seq", initialValue = 201, allocationSize = 1)
	private Integer surveyorId;
	private String surveyorName;
	private String surveyorPhoneNumber;

	public SurveyorDetails() {
		super();
	}

	public SurveyorDetails(String surveyorName, String surveyorPhoneNumber) {
		super();
		this.surveyorName = surveyorName;
		this.surveyorPhoneNumber = surveyorPhoneNumber;
	}

	public Integer getSurveyorId() {
		return surveyorId;
	}

	public void setSurveyorId(Integer surveyorId) {
		this.surveyorId = surveyorId;
	}

	public String getSurveyorName() {
		return surveyorName;
	}

	public void setSurveyorName(String surveyorName) {
		this.surveyorName = surveyorName;
	}

	public String getSurveyorPhoneNumber() {
		return surveyorPhoneNumber;
	}

	public void setSurveyorPhoneNumber(String surveyorPhoneNumber) {
		this.surveyorPhoneNumber = surveyorPhoneNumber;
	}

	@Override
	public String toString() {
		return "SurveyorDetails [surveyorId=" + surveyorId + ", surveyorName=" + surveyorName + ", surveyorPhoneNumber="
				+ surveyorPhoneNumber + "]";
	}

}
