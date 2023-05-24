package com.preboarding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.preboarding.model.PersonalDetails;
import com.preboarding.repository.IPersonalRepository;

@Service
public class PersonalServiceImpl implements IPersonalService {

	private IPersonalRepository personalRepository;
	@Autowired
	public void setPersonalRepository(IPersonalRepository personalRepository) {
		this.personalRepository = personalRepository;
	}

	@Override
	public void addPersonalDetails(PersonalDetails personalDetails) {
		personalRepository.save(personalDetails);
	}

}
