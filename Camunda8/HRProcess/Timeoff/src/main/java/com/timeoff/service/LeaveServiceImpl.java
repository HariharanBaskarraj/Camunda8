package com.timeoff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timeoff.model.LeaveDetails;
import com.timeoff.repository.ILeaveRepository;

@Service
public class LeaveServiceImpl implements ILeaveService {

	private ILeaveRepository leaveRepository;
	@Autowired
	public void setLeaveRepository(ILeaveRepository leaveRepository) {
		this.leaveRepository = leaveRepository;
	}

	@Override
	public void addLeaveDetails(LeaveDetails leaveDetails) {
		leaveRepository.save(leaveDetails);
	}

}
