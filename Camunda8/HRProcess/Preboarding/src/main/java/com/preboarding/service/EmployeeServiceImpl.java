package com.preboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preboarding.model.EmployeeDetails;
import com.preboarding.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	private IEmployeeRepository employeeRepository;
	@Autowired
	public void setEmployeeRepository(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public void addEmployeeDetails(EmployeeDetails employeeDetails) {
		employeeRepository.save(employeeDetails);
	}

}
