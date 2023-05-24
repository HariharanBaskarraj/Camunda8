package com.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insurance.model.FnolPersistence;

public interface IFnolRepository extends JpaRepository<FnolPersistence, Integer> {

}
