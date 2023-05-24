package com.timeoff.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeaveDetails {

	@Id
	private String employeeId;
	private String startDate;
	private String endDate;
	private String leaveType;
	private String status;
	
	public LeaveDetails() {
		super();
	}

	public LeaveDetails(String employeeId, String startDate, String endDate, String leaveType, String status) {
		super();
		this.employeeId = employeeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.status = status;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LeaveDetails [employeeId=" + employeeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", leaveType=" + leaveType + ", status=" + status + "]";
	}
	
}
