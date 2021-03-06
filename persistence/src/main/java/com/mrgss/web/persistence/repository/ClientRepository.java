package com.mrgss.web.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

	public ClientEntity findByFirstname(String name);
	
	public List<ClientEntity> findAll();
}


