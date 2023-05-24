package com.timeoff.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timeoff.model.LeaveDetails;

@Repository
public interface ILeaveRepository extends JpaRepository<LeaveDetails, String>{

}
