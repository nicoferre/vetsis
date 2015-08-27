package com.mrgss.web.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.SpeciesEntity;

@Repository
public interface SpeciesRepository extends CrudRepository<SpeciesEntity, Long> {

	public SpeciesEntity findByid(Long id);
}


