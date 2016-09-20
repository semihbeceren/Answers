package com.semihbeceren.answers.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.semihbeceren.answers.model.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface SpringDataUserRepository extends CrudRepository<User, Long>{
	List<User> findByUserName(@Param("username") String userName);
	
	
}
