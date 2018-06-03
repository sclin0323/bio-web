package com.fubonlife.bio.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubonlife.bio.entity.mongo.Test;
import com.fubonlife.bio.entity.mongo.User;


@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
}

