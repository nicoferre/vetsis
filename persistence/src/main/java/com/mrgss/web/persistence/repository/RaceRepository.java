package com.mrgss.web.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.RaceEntity;

@Repository
public interface RaceRepository extends CrudRepository<RaceEntity, Long> {

	public RaceEntity findById(Long id);
}


