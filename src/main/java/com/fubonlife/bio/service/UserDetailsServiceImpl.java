package com.fubonlife.bio.service;

import org.springframework.security.core.userdetails.User.UserBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fubonlife.bio.controller.MainController;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	Logger log = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		log.info("**********************************************");
	
		UserBuilder builder = org.springframework.security.core.userdetails.User.withUsername(username);
		
		return builder.build();
	}

}
