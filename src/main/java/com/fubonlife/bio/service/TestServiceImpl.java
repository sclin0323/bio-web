package com.fubonlife.bio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fubonlife.bio.entity.mongo.Test;
import com.fubonlife.bio.repository.jpa.UserRepository;
import com.fubonlife.bio.repository.mongo.TestRepository;


@Service
public class TestServiceImpl implements TestService{
	
	//@Autowired
	//UserRepository userRepository;
	
	@Autowired
	TestRepository testRepository;

	@Override
	public void read() {
		
		//testRepository.findAll();
		
		
	}

	@Override
	public void save() {
		
		Test o = new Test();
		
		o.setTestId("1111122222");
		
		testRepository.save(o);
		
//		User o = new User();
//		
//		o.setUserId("0012");
//		o.setName("NAB!111");
//		
//		userRepository.save(o);
		
	}

}
