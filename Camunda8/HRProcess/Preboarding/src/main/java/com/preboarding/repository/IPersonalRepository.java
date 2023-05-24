package com.preboarding.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.preboarding.model.PersonalDetails;

@Repository
public interface IPersonalRepository extends JpaRepository<PersonalDetails, Integer> {

}
