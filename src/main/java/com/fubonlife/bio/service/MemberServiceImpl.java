package com.fubonlife.bio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.fubonlife.bio.entity.mongo.Member;
import com.fubonlife.bio.repository.mongo.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
    MemberRepository memberRepository;

	@Override
	public Member create(Member obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member update(Member obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member delete(Member obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Member> findByExample(Example example, Pageable pageable) {
		Page<Member> page = memberRepository.findAll(example, pageable);
		return page;
	}

	@Override
	public Page<Member> findAll(Pageable pageable) {
		Page<Member> page = memberRepository.findAll(pageable);
		return page;
	}
	


}
