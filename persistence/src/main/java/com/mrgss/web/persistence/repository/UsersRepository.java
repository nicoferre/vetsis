package com.mrgss.web.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mrgss.web.persistence.model.PersistentUser;

@Repository
public interface UsersRepository extends CrudRepository<PersistentUser, Long> {

}
