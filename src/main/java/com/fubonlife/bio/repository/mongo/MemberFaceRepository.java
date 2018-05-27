package com.fubonlife.bio.repository.mongo;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fubonlife.bio.entity.mongo.Member;
import com.fubonlife.bio.entity.mongo.MemberFace;


@Repository
public interface MemberFaceRepository extends MongoRepository<MemberFace, ObjectId> {

	public List<Member> findByMember(Member member);
}

