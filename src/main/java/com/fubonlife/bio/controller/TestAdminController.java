package com.fubonlife.bio.controller;

import java.io.IOException;
import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/web/testadmin")
public class TestAdminController {
	
	Logger log = LoggerFactory.getLogger(TestAdminController.class);

	
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(Principal principal) throws IOException {
		
		//System.out.println(urlPrefix);
		
		//log.info("principal name: "+principal.getName());
		
		//testService.read();
		
		
		
		return "principal name: "+principal.getName();
		
		
	}
}
