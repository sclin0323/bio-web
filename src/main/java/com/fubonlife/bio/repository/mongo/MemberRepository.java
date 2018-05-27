package com.fubonlife.bio.repository.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubonlife.bio.entity.mongo.Member;


@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
	
}

