package com.fubonlife.bio.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fubonlife.bio.service.TestService;


@RestController
@RequestMapping(value="/web/test")
public class TestController {
	
	Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//System.out.println(urlPrefix);
		
		log.info("Hello Loging....");
		
		//testService.read();
		
		testService.save();
		
		return "Hello World";
		
		
	}
}
