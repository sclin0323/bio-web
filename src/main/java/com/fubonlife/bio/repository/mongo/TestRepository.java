package com.fubonlife.bio.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubonlife.bio.entity.mongo.Test;


@Repository
public interface TestRepository extends MongoRepository<Test, String> {
	
}

