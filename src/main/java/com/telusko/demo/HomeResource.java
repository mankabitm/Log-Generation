package com.telusko.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeResource {
	Logger logger = LoggerFactory.getLogger(HomeResource.class);
	@RequestMapping("/")
	public String home() {
		logger.error("Home accessed");
		return "Hello from Logger app";
	}
}
