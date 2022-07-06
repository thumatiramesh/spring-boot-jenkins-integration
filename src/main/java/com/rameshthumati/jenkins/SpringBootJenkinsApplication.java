package com.rameshthumati.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started...!");
	}

	public static void main(String[] args) {
		logger.info("Application executed...!");
		SpringApplication.run(SpringBootJenkinsApplication.class, args);
	}

}
