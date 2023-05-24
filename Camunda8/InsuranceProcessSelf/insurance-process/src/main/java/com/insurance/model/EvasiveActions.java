package com.insurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class EvasiveActions {

	@Id
	@GeneratedValue(generator = "actions_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "actions_gen", sequenceName = "actions_seq", initialValue = 301, allocationSize = 1)
	private Integer actionId;
	private String actionTaken;

	public EvasiveActions() {
		super();
	}

	public EvasiveActions(String actionTaken) {
		super();
		this.actionTaken = actionTaken;
	}

	public Integer getActionId() {
		return actionId;
	}

	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}

	public String getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}

	@Override
	public String toString() {
		return "EvasiveActions [actionId=" + actionId + ", actionTaken=" + actionTaken + "]";
	}

}
