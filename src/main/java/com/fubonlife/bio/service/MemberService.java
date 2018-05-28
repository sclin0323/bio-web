package com.fubonlife.bio.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.fubonlife.bio.entity.mongo.Member;

public interface MemberService {

    public Member create(Member obj);

    public Member update(Member obj);

    public Member delete(Member obj);

    public Page<Member> findByExample(Example example, Pageable pageable);

	public Page<Member> findAll(Pageable pageable);

}
