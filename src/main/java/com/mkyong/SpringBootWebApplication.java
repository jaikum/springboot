package com.mkyong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.err.println("-----------------------------BUILDER---------------------------");

		return application.sources(SpringBootWebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		System.err.println("-----------------------------MAIN---------------------------");

		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}