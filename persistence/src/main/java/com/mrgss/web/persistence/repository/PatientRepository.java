package com.mrgss.web.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.PatientEntity;

@Repository
public interface PatientRepository extends CrudRepository<PatientEntity, Long> {

	public PatientEntity findById(Long id);
}


