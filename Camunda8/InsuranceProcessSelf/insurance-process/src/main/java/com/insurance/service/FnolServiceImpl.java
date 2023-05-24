package com.insurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.FnolPersistence;
import com.insurance.repository.IFnolRepository;

@Service
public class FnolServiceImpl implements IFnolService {

	private IFnolRepository fnolRepository;
	@Autowired
	public void setFnolRepository(IFnolRepository fnolRepository) {
		this.fnolRepository = fnolRepository;
	}

	@Override
	public void addFnolEntries(FnolPersistence fnolPersistence) {
		fnolRepository.save(fnolPersistence);
	}

}
