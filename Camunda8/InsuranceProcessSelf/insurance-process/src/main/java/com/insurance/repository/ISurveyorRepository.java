package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.SurveyorDetails;

public interface ISurveyorRepository extends JpaRepository<SurveyorDetails, Integer> {

}
