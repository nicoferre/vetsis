package com.mrgss.web.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.DocTypeEntity;

@Repository
public interface DocTypeRepository extends CrudRepository<DocTypeEntity, Long> {

}
