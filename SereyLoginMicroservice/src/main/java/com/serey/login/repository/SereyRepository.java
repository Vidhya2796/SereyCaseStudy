package com.serey.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.serey.login.model.SereyUser;

public interface SereyRepository extends MongoRepository<SereyUser, String>{

}
