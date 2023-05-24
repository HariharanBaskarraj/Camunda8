package com.preboarding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.preboarding.model.EmployeeDetails;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeDetails, Integer> {

}
